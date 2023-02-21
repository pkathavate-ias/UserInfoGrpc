import io.grpc.stub.StreamObserver;

public class UserInfoServiceImpl extends userActionsGrpc.userActionsImplBase {

    @Override
    public void createUser(UserInfo.User request, StreamObserver<UserInfo.APIResponse> responseObserver) {
        StringBuilder st = new StringBuilder();
        st.append(request.getId()).append(request.getFirstName()).append(request.getLastName()).append(request.getBirthDate()).append(request.getEmail());
        String new_st = st.toString();
        UserInfo.APIResponse response = UserInfo.APIResponse.newBuilder().setResponseMessage(new_st).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getUserByID(UserInfo.UserByIDResponse request, StreamObserver<UserInfo.UserByIDResponse> responseObserver) {
        if(!request.getUserByIDResponse().isEmpty()) {
            UserInfo.UserByIDResponse response = UserInfo.UserByIDResponse.newBuilder().setUserByIDResponse(request.getUserByIDResponse()).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getAllUsers(UserInfo.ListOfUserResponse request, StreamObserver<UserInfo.ListOfUserResponse> responseObserver) {
        if(!request.getUserResponseList().isEmpty()) {
            UserInfo.ListOfUserResponse response = UserInfo.ListOfUserResponse.newBuilder().setUserResponseList(request.getUserResponseList()).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}