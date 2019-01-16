package behavioral._11_visitor._01_before;

public class VisitorDemo {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Oil());
        order.addPart(new Fender());
        order.addPart(new Wheel());
        System.out.println("order.calculateShipping() : " + order.calculateShipping());
    }
}