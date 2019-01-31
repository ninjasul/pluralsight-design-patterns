package behavioral._07_observer.twitterstream;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Observable;
import java.util.Observer;

@AllArgsConstructor
@Log4j2
public class Client implements Observer {

    private String name;

    @Override
    public void update(Observable o, Object arg) {
       log.info("Update {} 's stream, someone tweeted something.");
    }
}