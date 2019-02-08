package structural._02_bridge.coloredshape;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Blue implements Color {
    @Override
    public void applyColor() {
        log.info("applying blue color");
    }
}