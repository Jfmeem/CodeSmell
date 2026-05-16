package ChangePreventers.Shotgun;

public class Order {
    private OrderValidator validator = new OrderValidator();
    private PaymentProcessor paymentProcessor = new PaymentProcessor();
    private ShippingHandler shippingHandler = new ShippingHandler();

    public void processOrder() {
        validator.validateOrder();
        paymentProcessor.processPayment();
        shippingHandler.shipOrder();
    }
}
