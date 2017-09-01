package com.atlas.nlp.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.5.0)",
    comments = "Source: cass.proto")
public final class CassGrpc {

  private CassGrpc() {}

  public static final String SERVICE_NAME = "Cass";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.atlas.nlp.grpc.ClassificationRequest,
      com.atlas.nlp.grpc.SimpleResult> METHOD_CLASSIFY_REGEX_MODEL =
      io.grpc.MethodDescriptor.<com.atlas.nlp.grpc.ClassificationRequest, com.atlas.nlp.grpc.SimpleResult>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "Cass", "ClassifyRegexModel"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.atlas.nlp.grpc.ClassificationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.atlas.nlp.grpc.SimpleResult.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.atlas.nlp.grpc.ClassificationRequest,
      com.atlas.nlp.grpc.ClassificationResponse> METHOD_CLASSIFY_TRACY_DEPTH =
      io.grpc.MethodDescriptor.<com.atlas.nlp.grpc.ClassificationRequest, com.atlas.nlp.grpc.ClassificationResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "Cass", "ClassifyTracyDepth"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.atlas.nlp.grpc.ClassificationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.atlas.nlp.grpc.ClassificationResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.atlas.nlp.grpc.ClassificationRequest,
      com.atlas.nlp.grpc.ClassificationResponse> METHOD_CLASSIFY_OTHER_MODEL =
      io.grpc.MethodDescriptor.<com.atlas.nlp.grpc.ClassificationRequest, com.atlas.nlp.grpc.ClassificationResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "Cass", "ClassifyOtherModel"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.atlas.nlp.grpc.ClassificationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.atlas.nlp.grpc.ClassificationResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.atlas.nlp.grpc.ListClassifiersRequest,
      com.atlas.nlp.grpc.ListClassifiersResponse> METHOD_LIST_CLASSIFIERS =
      io.grpc.MethodDescriptor.<com.atlas.nlp.grpc.ListClassifiersRequest, com.atlas.nlp.grpc.ListClassifiersResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "Cass", "ListClassifiers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.atlas.nlp.grpc.ListClassifiersRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.atlas.nlp.grpc.ListClassifiersResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CassStub newStub(io.grpc.Channel channel) {
    return new CassStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CassBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CassBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CassFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CassFutureStub(channel);
  }

  /**
   */
  public static abstract class CassImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Classify demo
     * </pre>
     */
    public void classifyRegexModel(com.atlas.nlp.grpc.ClassificationRequest request,
        io.grpc.stub.StreamObserver<com.atlas.nlp.grpc.SimpleResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CLASSIFY_REGEX_MODEL, responseObserver);
    }

    /**
     * <pre>
     * Classify a request
     * </pre>
     */
    public void classifyTracyDepth(com.atlas.nlp.grpc.ClassificationRequest request,
        io.grpc.stub.StreamObserver<com.atlas.nlp.grpc.ClassificationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CLASSIFY_TRACY_DEPTH, responseObserver);
    }

    /**
     * <pre>
     * Classify with other model
     * </pre>
     */
    public void classifyOtherModel(com.atlas.nlp.grpc.ClassificationRequest request,
        io.grpc.stub.StreamObserver<com.atlas.nlp.grpc.ClassificationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CLASSIFY_OTHER_MODEL, responseObserver);
    }

    /**
     * <pre>
     * List all available classifiers
     * </pre>
     */
    public void listClassifiers(com.atlas.nlp.grpc.ListClassifiersRequest request,
        io.grpc.stub.StreamObserver<com.atlas.nlp.grpc.ListClassifiersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_CLASSIFIERS, responseObserver);
    }

    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CLASSIFY_REGEX_MODEL,
            asyncUnaryCall(
              new MethodHandlers<
                com.atlas.nlp.grpc.ClassificationRequest,
                com.atlas.nlp.grpc.SimpleResult>(
                  this, METHODID_CLASSIFY_REGEX_MODEL)))
          .addMethod(
            METHOD_CLASSIFY_TRACY_DEPTH,
            asyncUnaryCall(
              new MethodHandlers<
                com.atlas.nlp.grpc.ClassificationRequest,
                com.atlas.nlp.grpc.ClassificationResponse>(
                  this, METHODID_CLASSIFY_TRACY_DEPTH)))
          .addMethod(
            METHOD_CLASSIFY_OTHER_MODEL,
            asyncUnaryCall(
              new MethodHandlers<
                com.atlas.nlp.grpc.ClassificationRequest,
                com.atlas.nlp.grpc.ClassificationResponse>(
                  this, METHODID_CLASSIFY_OTHER_MODEL)))
          .addMethod(
            METHOD_LIST_CLASSIFIERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.atlas.nlp.grpc.ListClassifiersRequest,
                com.atlas.nlp.grpc.ListClassifiersResponse>(
                  this, METHODID_LIST_CLASSIFIERS)))
          .build();
    }
  }

  /**
   */
  public static final class CassStub extends io.grpc.stub.AbstractStub<CassStub> {
    private CassStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CassStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CassStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CassStub(channel, callOptions);
    }

    /**
     * <pre>
     * Classify demo
     * </pre>
     */
    public void classifyRegexModel(com.atlas.nlp.grpc.ClassificationRequest request,
        io.grpc.stub.StreamObserver<com.atlas.nlp.grpc.SimpleResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CLASSIFY_REGEX_MODEL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Classify a request
     * </pre>
     */
    public void classifyTracyDepth(com.atlas.nlp.grpc.ClassificationRequest request,
        io.grpc.stub.StreamObserver<com.atlas.nlp.grpc.ClassificationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CLASSIFY_TRACY_DEPTH, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Classify with other model
     * </pre>
     */
    public void classifyOtherModel(com.atlas.nlp.grpc.ClassificationRequest request,
        io.grpc.stub.StreamObserver<com.atlas.nlp.grpc.ClassificationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CLASSIFY_OTHER_MODEL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all available classifiers
     * </pre>
     */
    public void listClassifiers(com.atlas.nlp.grpc.ListClassifiersRequest request,
        io.grpc.stub.StreamObserver<com.atlas.nlp.grpc.ListClassifiersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_CLASSIFIERS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CassBlockingStub extends io.grpc.stub.AbstractStub<CassBlockingStub> {
    private CassBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CassBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CassBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CassBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Classify demo
     * </pre>
     */
    public com.atlas.nlp.grpc.SimpleResult classifyRegexModel(com.atlas.nlp.grpc.ClassificationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CLASSIFY_REGEX_MODEL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Classify a request
     * </pre>
     */
    public com.atlas.nlp.grpc.ClassificationResponse classifyTracyDepth(com.atlas.nlp.grpc.ClassificationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CLASSIFY_TRACY_DEPTH, getCallOptions(), request);
    }

    /**
     * <pre>
     * Classify with other model
     * </pre>
     */
    public com.atlas.nlp.grpc.ClassificationResponse classifyOtherModel(com.atlas.nlp.grpc.ClassificationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CLASSIFY_OTHER_MODEL, getCallOptions(), request);
    }

    /**
     * <pre>
     * List all available classifiers
     * </pre>
     */
    public com.atlas.nlp.grpc.ListClassifiersResponse listClassifiers(com.atlas.nlp.grpc.ListClassifiersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_CLASSIFIERS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CassFutureStub extends io.grpc.stub.AbstractStub<CassFutureStub> {
    private CassFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CassFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CassFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CassFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Classify demo
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atlas.nlp.grpc.SimpleResult> classifyRegexModel(
        com.atlas.nlp.grpc.ClassificationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CLASSIFY_REGEX_MODEL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Classify a request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atlas.nlp.grpc.ClassificationResponse> classifyTracyDepth(
        com.atlas.nlp.grpc.ClassificationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CLASSIFY_TRACY_DEPTH, getCallOptions()), request);
    }

    /**
     * <pre>
     * Classify with other model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atlas.nlp.grpc.ClassificationResponse> classifyOtherModel(
        com.atlas.nlp.grpc.ClassificationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CLASSIFY_OTHER_MODEL, getCallOptions()), request);
    }

    /**
     * <pre>
     * List all available classifiers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atlas.nlp.grpc.ListClassifiersResponse> listClassifiers(
        com.atlas.nlp.grpc.ListClassifiersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_CLASSIFIERS, getCallOptions()), request);
    }
  }

  private static final int METHODID_CLASSIFY_REGEX_MODEL = 0;
  private static final int METHODID_CLASSIFY_TRACY_DEPTH = 1;
  private static final int METHODID_CLASSIFY_OTHER_MODEL = 2;
  private static final int METHODID_LIST_CLASSIFIERS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CassImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CassImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLASSIFY_REGEX_MODEL:
          serviceImpl.classifyRegexModel((com.atlas.nlp.grpc.ClassificationRequest) request,
              (io.grpc.stub.StreamObserver<com.atlas.nlp.grpc.SimpleResult>) responseObserver);
          break;
        case METHODID_CLASSIFY_TRACY_DEPTH:
          serviceImpl.classifyTracyDepth((com.atlas.nlp.grpc.ClassificationRequest) request,
              (io.grpc.stub.StreamObserver<com.atlas.nlp.grpc.ClassificationResponse>) responseObserver);
          break;
        case METHODID_CLASSIFY_OTHER_MODEL:
          serviceImpl.classifyOtherModel((com.atlas.nlp.grpc.ClassificationRequest) request,
              (io.grpc.stub.StreamObserver<com.atlas.nlp.grpc.ClassificationResponse>) responseObserver);
          break;
        case METHODID_LIST_CLASSIFIERS:
          serviceImpl.listClassifiers((com.atlas.nlp.grpc.ListClassifiersRequest) request,
              (io.grpc.stub.StreamObserver<com.atlas.nlp.grpc.ListClassifiersResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class CassDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.atlas.nlp.grpc.CassGrpc.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CassGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CassDescriptorSupplier())
              .addMethod(METHOD_CLASSIFY_REGEX_MODEL)
              .addMethod(METHOD_CLASSIFY_TRACY_DEPTH)
              .addMethod(METHOD_CLASSIFY_OTHER_MODEL)
              .addMethod(METHOD_LIST_CLASSIFIERS)
              .build();
        }
      }
    }
    return result;
  }
  
  
// 다른 gen.코드에서 따옴   
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SimpleResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SimpleResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClassificationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClassificationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScoredLabel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScoredLabel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClassificationResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClassificationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClassificationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClassificationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ListClassifiersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ListClassifiersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ListClassifiersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ListClassifiersResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ncass.proto\"\034\n\014SimpleResult\022\014\n\004text\030\001 \001" +
      "(\t\"@\n\025ClassificationRequest\022\014\n\004text\030\001 \001(" +
      "\t\022\t\n\001n\030\002 \001(\005\022\016\n\006models\030\003 \003(\t\"9\n\013ScoredLa" +
      "bel\022\r\n\005label\030\001 \001(\t\022\r\n\005score\030\002 \001(\002\022\014\n\004cod" +
      "e\030\003 \001(\t\"C\n\024ClassificationResult\022\r\n\005model" +
      "\030\001 \001(\t\022\034\n\006result\030\003 \003(\0132\014.ScoredLabel\"^\n\026" +
      "ClassificationResponse\022%\n\006result\030\001 \003(\0132\025" +
      ".ClassificationResult\022\035\n\006status\030\002 \001(\0162\r." +
      "HealthStatus\"\030\n\026ListClassifiersRequest\"\'" +
      "\n\027ListClassifiersResponse\022\014\n\004name\030\001 \003(\t*",
      "-\n\014HealthStatus\022\006\n\002OK\020\000\022\010\n\004BUSY\020\001\022\013\n\007CRA" +
      "SHED\020\0022\237\002\n\004Cass\022=\n\022ClassifyRegexModel\022\026." +
      "ClassificationRequest\032\r.SimpleResult\"\000\022G" +
      "\n\022ClassifyTracyDepth\022\026.ClassificationReq" +
      "uest\032\027.ClassificationResponse\"\000\022G\n\022Class" +
      "ifyOtherModel\022\026.ClassificationRequest\032\027." +
      "ClassificationResponse\"\000\022F\n\017ListClassifi" +
      "ers\022\027.ListClassifiersRequest\032\030.ListClass" +
      "ifiersResponse\"\000B \n\022com.atlas.nlp.grpcB\010" +
      "CassGrpcP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_SimpleResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SimpleResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SimpleResult_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_ClassificationRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ClassificationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClassificationRequest_descriptor,
        new java.lang.String[] { "Text", "N", "Models", });
    internal_static_ScoredLabel_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ScoredLabel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScoredLabel_descriptor,
        new java.lang.String[] { "Label", "Score", "Code", });
    internal_static_ClassificationResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ClassificationResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClassificationResult_descriptor,
        new java.lang.String[] { "Model", "Result", });
    internal_static_ClassificationResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ClassificationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClassificationResponse_descriptor,
        new java.lang.String[] { "Result", "Status", });
    internal_static_ListClassifiersRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ListClassifiersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ListClassifiersRequest_descriptor,
        new java.lang.String[] { });
    internal_static_ListClassifiersResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_ListClassifiersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ListClassifiersResponse_descriptor,
        new java.lang.String[] { "Name", });
  }
}
