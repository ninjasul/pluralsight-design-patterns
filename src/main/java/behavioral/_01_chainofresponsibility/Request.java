package behavioral._01_chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Getter
@Builder
public class Request {

    private RequestType requestType;
    private double amount;

}