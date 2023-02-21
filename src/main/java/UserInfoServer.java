import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class UserInfoServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080).addService(new UserInfoServiceImpl()).build();

        server.start();

        System.out.println("Server started at " + server.getPort());

        server.awaitTermination();

    }
}
