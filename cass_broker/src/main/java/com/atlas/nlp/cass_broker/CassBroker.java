package com.atlas.nlp.cass_broker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.message.MessageAndMetadata;

/**
 * Cass Broker
 *
 */
public class CassBroker {
	private static final String KAFKA_PRODUCER_HOST = "localhost:9092";
	private static final String KAFKA_CONSUMER_HOST = "localhost:2181";
	private static final String KAFKA_CONSUMER_GROUPID = "Zeroth_Consumer";
	private static final String ZEROTH_TOPIC = "transcribed_text";
	private static final String WAS_TOPIC = "intent_result";

	private static final String CASS_GRPC_HOST = "0.0.0.0";
	private static final int CASS_GRPC_PORT = 5001;
	private static final int NUM_THREADS = 8;

	private static final Logger logger = Logger.getLogger(CassBroker.class.getName());

	private Properties props;
	private ConsumerConfig consumerConfig;
	private ConsumerConnector consumer;
	private CassGrpcClient cassClient;
	private KafkaProducer kafkaProducer;
	
	private CassBroker(String Grpc_Host, int Grpc_Port, String Kafka_HostAndPort, String Kafka_GroupId) {
       cassClient = new CassGrpcClient(Grpc_Host, Grpc_Port);
       kafkaProducer = new KafkaProducer(KAFKA_PRODUCER_HOST);
       
		props = new Properties();
		props.put("group.id", Kafka_GroupId);
		props.put("zookeeper.connect", Kafka_HostAndPort);
		props.put("auto.commit.interval.ms", "1000");

		consumerConfig = new ConsumerConfig(props);
		consumer = Consumer.createJavaConsumerConnector(consumerConfig);
	}
	
	private String callCass(String sentence) {
		String result = cassClient.getClassification(sentence, 1);
//		String result = cassClient.test();
		return result;
	}
	
	private void PublishAnswer(String message) {
		kafkaProducer.EnqueueMessage(WAS_TOPIC, message);
	}
	
	public void runMainLoop (String topic) {
		
//		String recommendation = callCass("hello?");
//		System.out.println("received: " + recommendation);
		
		Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
		topicCountMap.put(topic, NUM_THREADS);
		
		Map<String, List<KafkaStream<byte[], byte[]>>> consumerMap = consumer.createMessageStreams(topicCountMap);
		List<KafkaStream<byte[], byte[]>> streams = consumerMap.get(topic);
		ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
		for (final KafkaStream<byte[], byte[]> stream : streams) {
			executor.execute(new Runnable() {
				public void run() {
					for (MessageAndMetadata<byte[], byte[]> messageAndMetadata : stream) {
						String receivedMessage = new String(messageAndMetadata.message());
						info("received: " + receivedMessage);
//						System.out.println("received: " + receivedMessage);
						String recommendation = callCass(receivedMessage);
						info("rexcommendation: " + recommendation);
//						System.out.println("received: " + receivedMessage);
						if (recommendation != "") {
							PublishAnswer(recommendation);
						}
					}
				}
			});
		}
		try {
			while(true) Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		consumer.shutdown();
		executor.shutdown();

	}
	
	private void info(String msg, Object... params) {
		logger.log(Level.INFO, msg, params);
	}

	private void warning(String msg, Object... params) {
		logger.log(Level.WARNING, msg, params);
	}

	public static void main( String[] args ) 
   {
       System.out.println( "Hello Cass!" );
       CassBroker inst = new CassBroker(CASS_GRPC_HOST, CASS_GRPC_PORT, KAFKA_CONSUMER_HOST, KAFKA_CONSUMER_GROUPID);
//       cassClient = new CassGrpcClient(CASS_GRPC_HOST, 5001);
       
//       System.out.println( cass.getClassification("Refund my account.", 1));
       inst.runMainLoop(ZEROTH_TOPIC);
//       System.out.println( cassClient.test());
       System.out.println( "Application Terminated!");
    }
}
