package behavioral._07_observer.own;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PhoneClient extends Observer {

    public PhoneClient( Subject subject ) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from phone");
    }

    @Override
    void update() {
        log.info("Phone Stream: {}", subject.getState());
    }
}