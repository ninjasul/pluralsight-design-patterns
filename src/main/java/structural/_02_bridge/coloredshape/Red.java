package structural._02_bridge.coloredshape;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Red implements Color {
    @Override
    public void applyColor() {
        log.info("applying red color");
    }
}