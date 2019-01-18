package behavioral._10_templatemethod.order;

public class OrderClient {

    public static void main(String[] args) {
        System.out.println("Web Order: ");

        WebOrder webOrder = WebOrder.builder().build();
        webOrder.processOrder();

        System.out.println("Store Order: ");
        StoreOrder storeOrder = StoreOrder.builder().build();
        storeOrder.processOrder();
    }

}