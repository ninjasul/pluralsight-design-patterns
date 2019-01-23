package behavioral._02_command.lightswitch;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LightToggleCommand implements Command {

    private Light light;

    @Override
    public void execute() {
        light.toggle();
    }
}