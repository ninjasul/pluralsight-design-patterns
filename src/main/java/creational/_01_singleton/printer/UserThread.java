package creational._01_singleton.printer;

public class UserThread extends Thread {

    public UserThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Printer.print(Thread.currentThread().getName() + " print using.");
    }
}