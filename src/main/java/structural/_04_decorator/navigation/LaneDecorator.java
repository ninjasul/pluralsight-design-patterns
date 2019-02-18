package structural._04_decorator.navigation;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LaneDecorator extends DisplayDecorator {

    public LaneDecorator(Display display) {
        super(display);
    }

    @Override
    public void draw() {
        super.draw();
        drawLanes();
    }

    private void drawLanes() {
        System.out.println("차선 표시");
    }
}