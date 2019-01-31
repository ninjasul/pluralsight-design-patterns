package behavioral._07_observer.own;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TabletClient extends Observer {

    public TabletClient(Subject subject ) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from tablet");
    }

    @Override
    void update() {
        log.info("Tablet Stream: {}", subject.getState());
    }
}