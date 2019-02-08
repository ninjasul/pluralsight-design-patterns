package structural._02_bridge.coloredshape;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Shape {

    protected Color color;

    abstract public void applyColor();
}