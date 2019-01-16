package behavioral._11_visitor._02_after;

public class VisitorDemo {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Oil());
        order.addPart(new Fender());
        order.addPart(new Wheel());

        order.accept(new AtvPartsShippingVisitor());
        order.accept(new AtvPartsDisplayVisitor());
    }
}