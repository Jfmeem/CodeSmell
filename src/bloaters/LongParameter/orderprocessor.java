package bloaters.LongParameter;

public class orderprocessor {
    public void processOrder(Customerrr customer,
                             Product product,
                             ShippingDetails shipping) {
        System.out.println("Processing order for: " + customer.getName());
        System.out.println("Product: " + product.getName());
        System.out.println("Payment: " + shipping.getPaymentMethod());
        System.out.println("Shipping: " + shipping.getShippingMethod());
    }
}
