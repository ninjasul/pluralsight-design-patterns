package behavioral._02_command.lightswitch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
public class Light {

    private String name;
    private boolean isOn = false;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        isOn = true;
        System.out.println("The " + name + " light is on");
    }

    public void off() {
        isOn = false;
        System.out.println("The " + name + " light is off");
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