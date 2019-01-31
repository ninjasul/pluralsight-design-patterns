package behavioral._07_observer.own;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}