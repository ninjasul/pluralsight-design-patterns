package behavioral._05_mediator.light;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Light {

    @Getter @Setter
    private String name;

    @Getter
    private boolean isOn = false;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        isOn = true;
        log.info("The {} light is on", name );
    }

    public void off() {
        isOn = false;
        log.info("The {} light is off", name );
    }

    public void toggle() {

        if (isOn) {
            off();
        }
        else {
            on();
        }
    }
}