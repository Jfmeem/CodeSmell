package Coupler.LazyClass;

public class OrderService {
    public void processOrder(String orderName) {
        System.out.println("Audit Log: Processing order - " + orderName);
        System.out.println("Order processed: " + orderName);
    }
}
