package creational._01_singleton.printer;

public class Printer {

    private static volatile Printer instance = null;
    private static int counter = 0;

    private Printer() {
        if( instance != null ) {
            throw new RuntimeException("Call getInstance() method to create an instance.");
        }
    }

    public static synchronized Printer getInstance() {
        if( instance == null ) {
            instance = new Printer();
        }

        return instance;
    }

    public static synchronized void print(String str) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter++;
        System.out.println(str + counter);
    }

}