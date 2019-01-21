package behavioral._08_state.traditional;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
public class LowState implements State {

    Fan fan;

    @Override
    public void handleRequest() {
        fan.setCurState(fan.getMediumState());
        System.out.println("The fan has turned to the medium state.");
    }

    @Override
    public String toString() {
        return "The fan is low.";
    }
}