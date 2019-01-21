package behavioral._08_state.traditional;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
public class MediumState implements State {

    Fan fan;

    @Override
    public void handleRequest() {
        fan.setCurState(fan.getHighState());
        System.out.println("The fan has turned to the high state.");
    }

    @Override
    public String toString() {
        return "The fan is medium.";
    }
}