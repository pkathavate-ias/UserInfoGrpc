import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.30.2)",
    comments = "Source: userInfo.proto")
public final class userActionsGrpc {

  private userActionsGrpc() {}

  public static final String SERVICE_NAME = "userActions";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<UserInfo.User,
      UserInfo.APIResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createUser",
      requestType = UserInfo.User.class,
      responseType = UserInfo.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserInfo.User,
      UserInfo.APIResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<UserInfo.User, UserInfo.APIResponse> getCreateUserMethod;
    if ((getCreateUserMethod = userActionsGrpc.getCreateUserMethod) == null) {
      synchronized (userActionsGrpc.class) {
        if ((getCreateUserMethod = userActionsGrpc.getCreateUserMethod) == null) {
          userActionsGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<UserInfo.User, UserInfo.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserInfo.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserInfo.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new userActionsMethodDescriptorSupplier("createUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserInfo.UserByIDResponse,
      UserInfo.UserByIDResponse> getGetUserByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserByID",
      requestType = UserInfo.UserByIDResponse.class,
      responseType = UserInfo.UserByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserInfo.UserByIDResponse,
      UserInfo.UserByIDResponse> getGetUserByIDMethod() {
    io.grpc.MethodDescriptor<UserInfo.UserByIDResponse, UserInfo.UserByIDResponse> getGetUserByIDMethod;
    if ((getGetUserByIDMethod = userActionsGrpc.getGetUserByIDMethod) == null) {
      synchronized (userActionsGrpc.class) {
        if ((getGetUserByIDMethod = userActionsGrpc.getGetUserByIDMethod) == null) {
          userActionsGrpc.getGetUserByIDMethod = getGetUserByIDMethod =
              io.grpc.MethodDescriptor.<UserInfo.UserByIDResponse, UserInfo.UserByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUserByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserInfo.UserByIDResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserInfo.UserByIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new userActionsMethodDescriptorSupplier("getUserByID"))
              .build();
        }
      }
    }
    return getGetUserByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserInfo.ListOfUserResponse,
      UserInfo.ListOfUserResponse> getGetAllUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllUsers",
      requestType = UserInfo.ListOfUserResponse.class,
      responseType = UserInfo.ListOfUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserInfo.ListOfUserResponse,
      UserInfo.ListOfUserResponse> getGetAllUsersMethod() {
    io.grpc.MethodDescriptor<UserInfo.ListOfUserResponse, UserInfo.ListOfUserResponse> getGetAllUsersMethod;
    if ((getGetAllUsersMethod = userActionsGrpc.getGetAllUsersMethod) == null) {
      synchronized (userActionsGrpc.class) {
        if ((getGetAllUsersMethod = userActionsGrpc.getGetAllUsersMethod) == null) {
          userActionsGrpc.getGetAllUsersMethod = getGetAllUsersMethod =
              io.grpc.MethodDescriptor.<UserInfo.ListOfUserResponse, UserInfo.ListOfUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserInfo.ListOfUserResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserInfo.ListOfUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new userActionsMethodDescriptorSupplier("getAllUsers"))
              .build();
        }
      }
    }
    return getGetAllUsersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userActionsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<userActionsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<userActionsStub>() {
        @java.lang.Override
        public userActionsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new userActionsStub(channel, callOptions);
        }
      };
    return userActionsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userActionsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<userActionsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<userActionsBlockingStub>() {
        @java.lang.Override
        public userActionsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new userActionsBlockingStub(channel, callOptions);
        }
      };
    return userActionsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userActionsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<userActionsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<userActionsFutureStub>() {
        @java.lang.Override
        public userActionsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new userActionsFutureStub(channel, callOptions);
        }
      };
    return userActionsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class userActionsImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(UserInfo.User request,
        io.grpc.stub.StreamObserver<UserInfo.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void getUserByID(UserInfo.UserByIDResponse request,
        io.grpc.stub.StreamObserver<UserInfo.UserByIDResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserByIDMethod(), responseObserver);
    }

    /**
     */
    public void getAllUsers(UserInfo.ListOfUserResponse request,
        io.grpc.stub.StreamObserver<UserInfo.ListOfUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllUsersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                UserInfo.User,
                UserInfo.APIResponse>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getGetUserByIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                UserInfo.UserByIDResponse,
                UserInfo.UserByIDResponse>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            getGetAllUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                UserInfo.ListOfUserResponse,
                UserInfo.ListOfUserResponse>(
                  this, METHODID_GET_ALL_USERS)))
          .build();
    }
  }

  /**
   */
  public static final class userActionsStub extends io.grpc.stub.AbstractAsyncStub<userActionsStub> {
    private userActionsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userActionsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new userActionsStub(channel, callOptions);
    }

    /**
     */
    public void createUser(UserInfo.User request,
        io.grpc.stub.StreamObserver<UserInfo.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserByID(UserInfo.UserByIDResponse request,
        io.grpc.stub.StreamObserver<UserInfo.UserByIDResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUsers(UserInfo.ListOfUserResponse request,
        io.grpc.stub.StreamObserver<UserInfo.ListOfUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userActionsBlockingStub extends io.grpc.stub.AbstractBlockingStub<userActionsBlockingStub> {
    private userActionsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userActionsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new userActionsBlockingStub(channel, callOptions);
    }

    /**
     */
    public UserInfo.APIResponse createUser(UserInfo.User request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public UserInfo.UserByIDResponse getUserByID(UserInfo.UserByIDResponse request) {
      return blockingUnaryCall(
          getChannel(), getGetUserByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public UserInfo.ListOfUserResponse getAllUsers(UserInfo.ListOfUserResponse request) {
      return blockingUnaryCall(
          getChannel(), getGetAllUsersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userActionsFutureStub extends io.grpc.stub.AbstractFutureStub<userActionsFutureStub> {
    private userActionsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userActionsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new userActionsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UserInfo.APIResponse> createUser(
        UserInfo.User request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UserInfo.UserByIDResponse> getUserByID(
        UserInfo.UserByIDResponse request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UserInfo.ListOfUserResponse> getAllUsers(
        UserInfo.ListOfUserResponse request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_GET_USER_BY_ID = 1;
  private static final int METHODID_GET_ALL_USERS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userActionsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userActionsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((UserInfo.User) request,
              (io.grpc.stub.StreamObserver<UserInfo.APIResponse>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserByID((UserInfo.UserByIDResponse) request,
              (io.grpc.stub.StreamObserver<UserInfo.UserByIDResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_USERS:
          serviceImpl.getAllUsers((UserInfo.ListOfUserResponse) request,
              (io.grpc.stub.StreamObserver<UserInfo.ListOfUserResponse>) responseObserver);
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

  private static abstract class userActionsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userActionsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return UserInfo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("userActions");
    }
  }

  private static final class userActionsFileDescriptorSupplier
      extends userActionsBaseDescriptorSupplier {
    userActionsFileDescriptorSupplier() {}
  }

  private static final class userActionsMethodDescriptorSupplier
      extends userActionsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userActionsMethodDescriptorSupplier(String methodName) {
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
      synchronized (userActionsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userActionsFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getGetUserByIDMethod())
              .addMethod(getGetAllUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
