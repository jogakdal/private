package com.atlas.nlp.cass_broker;

import java.lang.reflect.Array;
import java.util.Properties;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

public class KafkaProducer {
	private Properties props;
	private ProducerConfig producerConfig;
	private Producer<String, String> producer;
	
	public KafkaProducer(String ... hosts) {
		props = new Properties();
		String brokerList = new String();
		for (int i = 0; i < hosts.length; i++) {
			if (i != 0) brokerList = brokerList + ",";
			brokerList = brokerList + hosts[i];
		}
		props.put("metadata.broker.list", brokerList);//"kafka-test-001.epicdevs.com:9092,kafka-test-002.epicdevs.com:9092,kafka-test-003.epicdevs.com:9092");
		props.put("serializer.class", "kafka.serializer.StringEncoder");

		producerConfig = new ProducerConfig(props);
		producer = new Producer<String, String>(producerConfig);
	}
	
	public void EnqueueMessage(String topic, String message) {
		KeyedMessage<String, String> messages = new KeyedMessage<String, String>(topic, message);

		producer.send(messages);
	}
	public void finalizer() {
		producer.close();
	}
}
