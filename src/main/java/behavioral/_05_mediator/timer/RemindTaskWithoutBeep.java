package behavioral._05_mediator.timer;

import lombok.extern.log4j.Log4j2;

import java.util.Timer;
import java.util.TimerTask;

@Log4j2
public class RemindTaskWithoutBeep extends TimerTask {

    Timer timer;

    public RemindTaskWithoutBeep(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        log.info("Now Time's really up!");
        timer.cancel();
    }
}