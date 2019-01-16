package behavioral._11_visitor._02_after;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Fender part) {
        shippingAmount += 3;
        System.out.println("Wheels are bulky and expensive to ship.");
    }

    @Override
    public void visit(Oil part) {
        shippingAmount += 9;
        System.out.println("Oil is hzardous and has a fee to ship.");
    }

    @Override
    public void visit(Wheel part) {
        shippingAmount += 15;
        System.out.println("Wheels are bulky and expensive to ship.");
    }

    @Override
    public void visit(PartsOrder order) {
        System.out.println("If they bought more than 3 things we will give them a discount on shipping.");

        List<AtvPart> parts = order.getParts();

        if( parts.size() > 3 ) {
            shippingAmount -= 5;
        }

        System.out.println("Shipping amount is: " + shippingAmount);
    }

}