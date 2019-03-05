package creational._01_singleton.printer;

import java.util.ArrayList;
import java.util.List;

public class PrinterDemo {


    public static void main(String[] args) {
        UserThread[] userThreads = new UserThread[5];

        for( int i = 0; i < 5; ++i ) {
            userThreads[i] = new UserThread(i+1 + "-thread");
            userThreads[i].start();
        }
    }

}