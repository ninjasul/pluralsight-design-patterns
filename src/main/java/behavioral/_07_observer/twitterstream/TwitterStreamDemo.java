package behavioral._07_observer.twitterstream;

public class TwitterStreamDemo {

    public static void main(String[] args) {
        TwitterStream messageStream = new TwitterStream();
        Client client1 = new Client("Bryan");
        Client client2 = new Client("Mark");

        messageStream.addObserver(client1);
        messageStream.addObserver(client2);

        messageStream.someoneTweeted();
    }
}