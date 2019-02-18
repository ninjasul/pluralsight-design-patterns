package structural._04_decorator.sandwich;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SandwichDemo {
    private static final Logger log = LogManager.getLogger(Sandwich.class);

    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        log.info(sandwich.make());
    }
}