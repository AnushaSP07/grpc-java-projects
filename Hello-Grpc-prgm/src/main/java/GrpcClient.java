import com.hello.HelloRequest;
import com.hello.HelloResponse;
import com.hello.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);
        HelloRequest request = HelloRequest.newBuilder().setName("Anusha").build();
        HelloResponse response = stub.sayHello(request);

        System.out.println("Clinet received "+response.getMessage());
        channel.shutdown();
    }
}
