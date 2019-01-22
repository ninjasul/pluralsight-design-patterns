package behavioral._01_chainofresponsibility;

import lombok.Builder;

@Builder
public class CEO extends AbstractHandler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want.");
    }
}