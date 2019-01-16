package behavioral._11_visitor._02_after;

public interface AtvPartVisitor {
    void visit(Fender part);
    void visit(Oil oil);
    void visit(Wheel wheel);
    void visit(PartsOrder partsOrder);
}