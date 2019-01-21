package behavioral._08_state.enumerated;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
@Builder
public class Fan {

    FanState curState;

    public Fan() {
        curState = FanState.OFF;
    }

    public void pullChain() {
        curState = curState.getNext();
        System.out.println("The fan has turned to " + curState.getValue());
    }

    public String toString() {
        return "The fan is " + curState.getValue();
    }
}