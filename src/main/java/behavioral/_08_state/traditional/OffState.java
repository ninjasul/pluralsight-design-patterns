package behavioral._08_state.traditional;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
public class OffState implements State {

    Fan fan;

    @Override
    public void handleRequest() {
        fan.setCurState(fan.getLowState());
        System.out.println("The fan has turned to the low state.");
    }

    @Override
    public String toString() {
        return "The fan is off.";
    }
}