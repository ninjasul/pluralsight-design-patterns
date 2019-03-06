package creational._02_builder;

import java.util.function.LongUnaryOperator;

public class LunchDemo {

    public static void main(String[] args) {
        Lunch lunch = Lunch.builder()
                            .bread("A")
                            .condiments("B")
                            .dressing("mayo")
                            .meat("beef")
                            .build();

        System.out.println(lunch);
    }
}