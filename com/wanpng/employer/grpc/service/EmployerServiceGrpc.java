package com.wanpng.employer.grpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: protos/service/employer_service.grpc.proto")
public final class EmployerServiceGrpc {

  private EmployerServiceGrpc() {}

  public static final String SERVICE_NAME = "protos.service.EmployerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wanpng.employer.grpc.service.GetEmployerRequest,
      com.wanpng.employer.grpc.service.GetEmployerResponse> getGetEmployerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmployer",
      requestType = com.wanpng.employer.grpc.service.GetEmployerRequest.class,
      responseType = com.wanpng.employer.grpc.service.GetEmployerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.employer.grpc.service.GetEmployerRequest,
      com.wanpng.employer.grpc.service.GetEmployerResponse> getGetEmployerMethod() {
    io.grpc.MethodDescriptor<com.wanpng.employer.grpc.service.GetEmployerRequest, com.wanpng.employer.grpc.service.GetEmployerResponse> getGetEmployerMethod;
    if ((getGetEmployerMethod = EmployerServiceGrpc.getGetEmployerMethod) == null) {
      synchronized (EmployerServiceGrpc.class) {
        if ((getGetEmployerMethod = EmployerServiceGrpc.getGetEmployerMethod) == null) {
          EmployerServiceGrpc.getGetEmployerMethod = getGetEmployerMethod =
              io.grpc.MethodDescriptor.<com.wanpng.employer.grpc.service.GetEmployerRequest, com.wanpng.employer.grpc.service.GetEmployerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmployer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.employer.grpc.service.GetEmployerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.employer.grpc.service.GetEmployerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployerServiceMethodDescriptorSupplier("GetEmployer"))
              .build();
        }
      }
    }
    return getGetEmployerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.employer.grpc.service.SearchEmployerRequest,
      com.wanpng.employer.grpc.service.SearchEmployerResponse> getSearchEmployerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchEmployer",
      requestType = com.wanpng.employer.grpc.service.SearchEmployerRequest.class,
      responseType = com.wanpng.employer.grpc.service.SearchEmployerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.employer.grpc.service.SearchEmployerRequest,
      com.wanpng.employer.grpc.service.SearchEmployerResponse> getSearchEmployerMethod() {
    io.grpc.MethodDescriptor<com.wanpng.employer.grpc.service.SearchEmployerRequest, com.wanpng.employer.grpc.service.SearchEmployerResponse> getSearchEmployerMethod;
    if ((getSearchEmployerMethod = EmployerServiceGrpc.getSearchEmployerMethod) == null) {
      synchronized (EmployerServiceGrpc.class) {
        if ((getSearchEmployerMethod = EmployerServiceGrpc.getSearchEmployerMethod) == null) {
          EmployerServiceGrpc.getSearchEmployerMethod = getSearchEmployerMethod =
              io.grpc.MethodDescriptor.<com.wanpng.employer.grpc.service.SearchEmployerRequest, com.wanpng.employer.grpc.service.SearchEmployerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchEmployer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.employer.grpc.service.SearchEmployerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.employer.grpc.service.SearchEmployerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployerServiceMethodDescriptorSupplier("SearchEmployer"))
              .build();
        }
      }
    }
    return getSearchEmployerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.employer.grpc.service.GetEmployerUserRequest,
      com.wanpng.employer.grpc.service.GetEmployerUserResponse> getGetEmployerUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmployerUser",
      requestType = com.wanpng.employer.grpc.service.GetEmployerUserRequest.class,
      responseType = com.wanpng.employer.grpc.service.GetEmployerUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.employer.grpc.service.GetEmployerUserRequest,
      com.wanpng.employer.grpc.service.GetEmployerUserResponse> getGetEmployerUserMethod() {
    io.grpc.MethodDescriptor<com.wanpng.employer.grpc.service.GetEmployerUserRequest, com.wanpng.employer.grpc.service.GetEmployerUserResponse> getGetEmployerUserMethod;
    if ((getGetEmployerUserMethod = EmployerServiceGrpc.getGetEmployerUserMethod) == null) {
      synchronized (EmployerServiceGrpc.class) {
        if ((getGetEmployerUserMethod = EmployerServiceGrpc.getGetEmployerUserMethod) == null) {
          EmployerServiceGrpc.getGetEmployerUserMethod = getGetEmployerUserMethod =
              io.grpc.MethodDescriptor.<com.wanpng.employer.grpc.service.GetEmployerUserRequest, com.wanpng.employer.grpc.service.GetEmployerUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmployerUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.employer.grpc.service.GetEmployerUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.employer.grpc.service.GetEmployerUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployerServiceMethodDescriptorSupplier("GetEmployerUser"))
              .build();
        }
      }
    }
    return getGetEmployerUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployerServiceStub>() {
        @java.lang.Override
        public EmployerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployerServiceStub(channel, callOptions);
        }
      };
    return EmployerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployerServiceBlockingStub>() {
        @java.lang.Override
        public EmployerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployerServiceBlockingStub(channel, callOptions);
        }
      };
    return EmployerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployerServiceFutureStub>() {
        @java.lang.Override
        public EmployerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployerServiceFutureStub(channel, callOptions);
        }
      };
    return EmployerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EmployerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEmployer(com.wanpng.employer.grpc.service.GetEmployerRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.employer.grpc.service.GetEmployerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployerMethod(), responseObserver);
    }

    /**
     */
    public void searchEmployer(com.wanpng.employer.grpc.service.SearchEmployerRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.employer.grpc.service.SearchEmployerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchEmployerMethod(), responseObserver);
    }

    /**
     */
    public void getEmployerUser(com.wanpng.employer.grpc.service.GetEmployerUserRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.employer.grpc.service.GetEmployerUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployerUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEmployerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.employer.grpc.service.GetEmployerRequest,
                com.wanpng.employer.grpc.service.GetEmployerResponse>(
                  this, METHODID_GET_EMPLOYER)))
          .addMethod(
            getSearchEmployerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.employer.grpc.service.SearchEmployerRequest,
                com.wanpng.employer.grpc.service.SearchEmployerResponse>(
                  this, METHODID_SEARCH_EMPLOYER)))
          .addMethod(
            getGetEmployerUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.employer.grpc.service.GetEmployerUserRequest,
                com.wanpng.employer.grpc.service.GetEmployerUserResponse>(
                  this, METHODID_GET_EMPLOYER_USER)))
          .build();
    }
  }

  /**
   */
  public static final class EmployerServiceStub extends io.grpc.stub.AbstractAsyncStub<EmployerServiceStub> {
    private EmployerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployerServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEmployer(com.wanpng.employer.grpc.service.GetEmployerRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.employer.grpc.service.GetEmployerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchEmployer(com.wanpng.employer.grpc.service.SearchEmployerRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.employer.grpc.service.SearchEmployerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchEmployerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEmployerUser(com.wanpng.employer.grpc.service.GetEmployerUserRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.employer.grpc.service.GetEmployerUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployerUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmployerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EmployerServiceBlockingStub> {
    private EmployerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wanpng.employer.grpc.service.GetEmployerResponse getEmployer(com.wanpng.employer.grpc.service.GetEmployerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.employer.grpc.service.SearchEmployerResponse searchEmployer(com.wanpng.employer.grpc.service.SearchEmployerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchEmployerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.employer.grpc.service.GetEmployerUserResponse getEmployerUser(com.wanpng.employer.grpc.service.GetEmployerUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployerUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EmployerServiceFutureStub> {
    private EmployerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.employer.grpc.service.GetEmployerResponse> getEmployer(
        com.wanpng.employer.grpc.service.GetEmployerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.employer.grpc.service.SearchEmployerResponse> searchEmployer(
        com.wanpng.employer.grpc.service.SearchEmployerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchEmployerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.employer.grpc.service.GetEmployerUserResponse> getEmployerUser(
        com.wanpng.employer.grpc.service.GetEmployerUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployerUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EMPLOYER = 0;
  private static final int METHODID_SEARCH_EMPLOYER = 1;
  private static final int METHODID_GET_EMPLOYER_USER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EMPLOYER:
          serviceImpl.getEmployer((com.wanpng.employer.grpc.service.GetEmployerRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.employer.grpc.service.GetEmployerResponse>) responseObserver);
          break;
        case METHODID_SEARCH_EMPLOYER:
          serviceImpl.searchEmployer((com.wanpng.employer.grpc.service.SearchEmployerRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.employer.grpc.service.SearchEmployerResponse>) responseObserver);
          break;
        case METHODID_GET_EMPLOYER_USER:
          serviceImpl.getEmployerUser((com.wanpng.employer.grpc.service.GetEmployerUserRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.employer.grpc.service.GetEmployerUserResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EmployerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wanpng.employer.grpc.service.EmployerServiceProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployerService");
    }
  }

  private static final class EmployerServiceFileDescriptorSupplier
      extends EmployerServiceBaseDescriptorSupplier {
    EmployerServiceFileDescriptorSupplier() {}
  }

  private static final class EmployerServiceMethodDescriptorSupplier
      extends EmployerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployerServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EmployerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployerServiceFileDescriptorSupplier())
              .addMethod(getGetEmployerMethod())
              .addMethod(getSearchEmployerMethod())
              .addMethod(getGetEmployerUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
