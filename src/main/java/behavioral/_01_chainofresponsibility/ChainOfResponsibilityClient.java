package behavioral._01_chainofresponsibility;

public class ChainOfResponsibilityClient {

    public static void main(String[] args) {
        AbstractHandler bryan = Director.builder().build();
        AbstractHandler crystal = VP.builder().build();
        AbstractHandler jeff = CEO.builder().build();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = Request.builder()
                                .requestType(RequestType.CONFERENCE)
                                .amount(500)
                                .build();
        bryan.handleRequest(request);


        request = Request.builder()
                .requestType(RequestType.PURCHASE)
                .amount(1000)
                .build();
        bryan.handleRequest(request);

        request = Request.builder()
                .requestType(RequestType.PURCHASE)
                .amount(2000)
                .build();
        bryan.handleRequest(request);
    }
}