package behavioral._08_state.enumerated;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public enum FanState {

    OFF,
    LOW,
    MED,
    HIGH;

    private String value;

    private static final List<FanState> fanStates = Arrays.asList(values());

    FanState() {
        value = name().toLowerCase();
    }

    FanState getNext() {
        return fanStates.get((ordinal()+1) % fanStates.size());
    }

    FanState getPrevious() {
        return fanStates.get((ordinal()+fanStates.size()-1) % fanStates.size());
    }
}