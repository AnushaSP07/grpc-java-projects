import com.calculator.CalculatorServiceGrpc;
import com.calculator.SumRequest;
import com.calculator.SumResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalculatorClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50052)
                .usePlaintext().build();
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub =
                CalculatorServiceGrpc.newBlockingStub(channel);
        SumRequest request = SumRequest.newBuilder()
                .setNum1(10)
                .setNum2(20)
                .build();
        SumResponse response = stub.add(request);
        System.out.println("Result : "+response.getSum());
        channel.shutdown();

    }
}
