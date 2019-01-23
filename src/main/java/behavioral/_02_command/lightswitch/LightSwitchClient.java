package behavioral._02_command.lightswitch;

import java.util.ArrayList;
import java.util.List;

public class LightSwitchClient {

    public static void main(String[] args) {
        Switch lightSwitch = new Switch();
        turnOnOneLight(lightSwitch);
        toggleOneLight(lightSwitch);
        toggleLightList(lightSwitch);
    }

    private static void turnOnOneLight(Switch lightSwitch) {
        Light kitchenLight = new Light("First");
        Command lightOnCommand = new LightOnCommand(kitchenLight);

        lightSwitch.storeAndExecute(lightOnCommand);
    }

    private static void toggleOneLight(Switch lightSwitch) {
        Light kitchenLight = new Light("Second");
        Command lightToggleCommand = new LightToggleCommand(kitchenLight);

        lightSwitch.storeAndExecute(lightToggleCommand);
        lightSwitch.storeAndExecute(lightToggleCommand);
        lightSwitch.storeAndExecute(lightToggleCommand);
    }

    private static void toggleLightList(Switch lightSwitch) {
        Light kitchenLight = new Light("Kitchen");
        Light livingRoomLight = new Light("LivingRoom");

        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(livingRoomLight);

        Command allLightsToggleCommand = new AllLightsToggleCommand(lights);

        lightSwitch.storeAndExecute(allLightsToggleCommand);
        lightSwitch.storeAndExecute(allLightsToggleCommand);
        lightSwitch.storeAndExecute(allLightsToggleCommand);
    }
}