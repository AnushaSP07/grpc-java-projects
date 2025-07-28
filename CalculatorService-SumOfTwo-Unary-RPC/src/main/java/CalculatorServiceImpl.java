import com.calculator.CalculatorServiceGrpc;
import com.calculator.SumRequest;
import com.calculator.SumResponse;
import io.grpc.stub.StreamObserver;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {


    @Override
    public void add(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        int result = request.getNum1() + request.getNum2();
        var response = SumResponse.newBuilder().setSum(result).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
