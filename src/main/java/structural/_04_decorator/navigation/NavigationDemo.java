package structural._04_decorator.navigation;

public class NavigationDemo {

    public static void main(String[] args) {
        Display display = new CrossingDecorator(new TrafficDecorator(new LaneDecorator(new RoadDisplay())));
        display.draw();
    }
}