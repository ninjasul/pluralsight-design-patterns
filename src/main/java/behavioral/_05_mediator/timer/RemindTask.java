package behavioral._05_mediator.timer;

import lombok.extern.log4j.Log4j2;

import java.util.Timer;
import java.util.TimerTask;

@Log4j2
public class RemindTask extends TimerTask {
    Timer timer;

    public RemindTask(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        log.info("Time's up!");
    }
}