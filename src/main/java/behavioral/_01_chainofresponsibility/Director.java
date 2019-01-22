package behavioral._01_chainofresponsibility;

import lombok.Builder;

@Builder
public class Director extends AbstractHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.CONFERENCE)) {
            System.out.println("Directors can only approve conferences");
        }
        else {
            successor.handleRequest(request);
        }
    }
}