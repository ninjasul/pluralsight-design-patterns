package structural._04_decorator.navigation;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TrafficDecorator extends DisplayDecorator {

    public TrafficDecorator(Display display) {
        super(display);
    }

    @Override
    public void draw() {
        super.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("교통량 표시");
    }
}