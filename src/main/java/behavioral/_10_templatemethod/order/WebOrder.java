package behavioral._10_templatemethod.order;

import lombok.Builder;

@Builder
public class WebOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("WebOrder doCheckout");
    }

    @Override
    public void doPayment() {
        System.out.println("WebOrder doPayment");
    }

    @Override
    public void doReceipt() {
        System.out.println("WebOrder doReceipt");
    }

    @Override
    public void doDeliver() {
        System.out.println("WebOrder doDeliver");
    }
}