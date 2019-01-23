package behavioral._02_command.lightswitch;

public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}