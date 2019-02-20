package structural._06_flyweight.inventory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Order {

    private final int orderNumber;
    private final Item item;

    void processingOrder() {
        System.out.println("Ordering " + item + " for order number " + orderNumber);
    }

}