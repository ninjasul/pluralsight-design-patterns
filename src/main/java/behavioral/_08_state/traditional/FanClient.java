package behavioral._08_state.traditional;

import java.util.stream.IntStream;

public class FanClient {

    public static void main(String[] args) {
        Fan fan = new Fan();

        IntStream.range( 0, 5 ).forEach(
            i -> {
                System.out.println(fan);
                fan.pullChain();
            }
        );

    }
}