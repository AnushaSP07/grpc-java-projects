import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CalculatorServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50052).addService(new CalculatorServiceImpl()).build().start();
        System.out.println("Calculator grpc Server started");
        server.awaitTermination();
    }
}
