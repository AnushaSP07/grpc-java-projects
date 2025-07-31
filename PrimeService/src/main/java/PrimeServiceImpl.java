import com.prime.PrimeRequest;
import com.prime.PrimeResponse;
import com.prime.PrimeServiceGrpc;
import io.grpc.stub.StreamObserver;

public class PrimeServiceImpl extends PrimeServiceGrpc.PrimeServiceImplBase {
    @Override
    public void getPrimes(PrimeRequest request, StreamObserver<PrimeResponse> responseObserver) {
       int number = request.getNumber();
       System.out.println("Received request for prime");
    }
}
