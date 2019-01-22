package behavioral._01_chainofresponsibility;

import lombok.Builder;

@Builder
public class VP extends AbstractHandler {
    @Override
    public void handleRequest(Request request) {

        if( request.getRequestType().equals(RequestType.PURCHASE) ) {
            if (request.getAmount() < 1500) {
                System.out.println("VPs can only approve below 1500");
            } else {
                successor.handleRequest(request);
            }
        }
    }
}