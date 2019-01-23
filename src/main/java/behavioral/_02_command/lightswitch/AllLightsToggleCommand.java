package behavioral._02_command.lightswitch;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class AllLightsToggleCommand implements Command {

    private List<Light> lights;

    @Override
    public void execute() {
        for( Light light : lights ) {
            light.toggle();
        }
    }
}