package behavioral._07_observer.twitterstream;

import java.util.Observable;

public class TwitterStream extends Observable {

    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}