package behavioral._02_command.lightswitch;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class LightOnCommand implements Command {

    private Light light;

    @Override
    public void execute() {
        light.on();
    }
}