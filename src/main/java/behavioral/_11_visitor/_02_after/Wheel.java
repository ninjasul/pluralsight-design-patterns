package behavioral._11_visitor._02_after;

public class Wheel implements AtvPart {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }

}