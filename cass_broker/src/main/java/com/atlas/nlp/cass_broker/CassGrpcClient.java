package com.atlas.nlp.cass_broker;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.atlas.nlp.grpc.CassGrpc;
import com.atlas.nlp.grpc.CassGrpc.CassBlockingStub;
import com.atlas.nlp.grpc.CassGrpc.CassStub;
import com.atlas.nlp.grpc.ClassificationRequest;
import com.atlas.nlp.grpc.ClassificationResponse;
import com.atlas.nlp.grpc.ClassificationResult;
import com.atlas.nlp.grpc.ListClassifiersRequest;
import com.atlas.nlp.grpc.ListClassifiersResponse;
import com.atlas.nlp.grpc.ScoredLabel;
import com.google.protobuf.Descriptors.FieldDescriptor;
import io.grpc.okhttp.OkHttpChannelBuilder;

public class CassGrpcClient {
	private static final Logger logger = Logger.getLogger(CassGrpcClient.class.getName());

	private final ManagedChannel channel;
	private final CassBlockingStub blockingStub;
	private final CassStub asyncStub;

	public CassGrpcClient(String host, int port) {
//		ManagedChannelBuilder channelBuilder = ManagedChannelBuilder.forAddress(host, port);
//		channelBuilder.
		this(OkHttpChannelBuilder.forAddress(host, port).usePlaintext(true));
//		this(ManagedChannelBuilder.forAddress(host, port).usePlaintext(true));
		
//		ManagedChannelBuilder channelBuilder = ManagedChannelBuilder.forAddress(host, port);
//		channelBuilder.
	}
	
	public CassGrpcClient(ManagedChannelBuilder<?> channelBuilder) {
		channel = channelBuilder.build();
		blockingStub = CassGrpc.newBlockingStub(channel);
		asyncStub = CassGrpc.newStub(channel);
	}

	public String getClassification(String sentense, int maxResults) {
		String resultString = "No received";
		
		ClassificationRequest request = ClassificationRequest.newBuilder()
				.setText(sentense)
				.setN(1)
				.addModels("speech_act_classifier")
				.build();
		ClassificationResponse response;
		
		try {
			response = blockingStub.classifyOtherModel(request);
//			response = blockingStub.classifyTracyDepth(request);
			ClassificationResult classResult = response.getResult(0);
			ScoredLabel scoredLabel = classResult.getResult(0);
			
			resultString = "Label: " + scoredLabel.getLabel() + "Score: " + scoredLabel.getScore();
//			System.out.println( "Label: " + scoredLabel.getLabel());
//			System.out.println( "Score: " + scoredLabel.getScore());
		} catch (StatusRuntimeException e) {
			warning("RPC failed: {0}", e.getStatus());
		}
		return resultString;
	}
	
	public String test() {
		String resultString = "No received";
		
		ListClassifiersRequest request = ListClassifiersRequest.newBuilder().clear().build();
		ListClassifiersResponse response;
		
		try {
			response = blockingStub.listClassifiers(request);
			resultString = response.getName(0);
		} catch (StatusRuntimeException e) {
			warning("RPC failed: {0}", e.getStatus());
		}
		return resultString;
	}
	
	private void warning(String msg, Object... params) {
		logger.log(Level.WARNING, msg, params);
	}
}
