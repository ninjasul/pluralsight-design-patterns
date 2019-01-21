package behavioral._08_state.traditional;

import lombok.*;

@AllArgsConstructor
@Getter @Setter
@Builder
public class Fan {

    State offState;
    State lowState;
    State mediumState;
    State highState;
    State curState;

    public Fan() {
        offState = new OffState(this);
        lowState = new LowState(this);
        mediumState = new MediumState(this);
        highState = new HighState(this);
        curState = offState;
    }

    public void pullChain() {
        curState.handleRequest();
    }

    public String toString() {
        return curState.toString();
    }
}