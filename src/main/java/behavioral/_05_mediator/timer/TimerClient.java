package behavioral._05_mediator.timer;


import lombok.extern.log4j.Log4j2;

import java.util.Timer;

@Log4j2()
public class TimerClient {
    private Timer timer;

    public TimerClient(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(timer), seconds * 1000);
        timer.schedule(new RemindTaskWithoutBeep(timer), seconds * 2 * 1000);
    }

    public static void main(String[] args) {

        log.info("About to schedule task.");
        new TimerClient(3);
        log.info("Task scheduled.");

    }
}