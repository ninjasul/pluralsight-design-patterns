package structural._04_decorator.navigation;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CrossingDecorator extends DisplayDecorator {

    public CrossingDecorator(Display display) {
        super(display);
    }

    @Override
    public void draw() {
        super.draw();
        drawCrossing();
    }

    private void drawCrossing() {
        System.out.println("교차로 표시");
    }
}