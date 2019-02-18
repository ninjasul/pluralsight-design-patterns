package behavioral._05_mediator.light;

import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Light {

    private static final Logger log = LogManager.getLogger(Light.class);

    @Getter @Setter
    private String name;

    @Getter
    private boolean isOn = false;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        isOn = true;
        log.info("The {} light is on" + name );
    }

    public void off() {
        isOn = false;
        log.info("The {} light is off" + name );
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