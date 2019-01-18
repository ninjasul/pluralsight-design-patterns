package behavioral._10_templatemethod.order;

import lombok.Builder;

@Builder
public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("StoreOrder doCheckout");
    }

    @Override
    public void doPayment() {
        System.out.println("StoreOrder doPayment");
    }

    @Override
    public void doReceipt() {
        System.out.println("StoreOrder doReceipt");
    }

    @Override
    public void doDeliver() {
        System.out.println("StoreOrder doDeliver");
    }
}