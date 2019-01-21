package behavioral._08_state.traditional;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
public class HighState implements State {

    Fan fan;

    @Override
    public void handleRequest() {
        fan.setCurState(fan.getOffState());
        System.out.println("The fan has turned to the off state.");
    }

    @Override
    public String toString() {
        return "The fan is high.";
    }
}