import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.*;

public class UserInfoClient {

    public static Map<Integer, List<String>> map = new HashMap<>();
    public static String firstName, lastName, email;

    public static int ID;
    public static void main(String[] args) throws ParseException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();


        Scanner sc = new Scanner(System.in);
        userActionsGrpc.userActionsBlockingStub stub = userActionsGrpc.newBlockingStub(channel);

        System.out.print("\nHow many users you want to add ? ");
        int noOfUsers = sc.nextInt();
        for(int i=0;i<noOfUsers;i++) {
            List<String> ObjectList = new ArrayList<>();
            System.out.print("\nEnter ID : ");
            ID = sc.nextInt();

            System.out.print("Enter First Name : ");
            firstName = sc.next();
            ObjectList.add(firstName);

            System.out.print("Enter Last Name : ");
            lastName = sc.next();
            ObjectList.add(lastName);

            System.out.print("Enter email : ");
            email = sc.next();
            ObjectList.add(email);

            map.put(ID, ObjectList);
        }

        UserInfo.APIResponse respond = stub.createUser(UserInfo.User.newBuilder().setId(123).setFirstName(" Pranesh ").setLastName(" Kathavate ").setEmail(" pk@gmail.com ").build());
        System.out.print("Server Response : " + respond);

        channel.shutdown();
    }
}
