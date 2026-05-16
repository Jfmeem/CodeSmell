package Coupler.LargeClass;


import dispensible.Comments.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders = new ArrayList<>();
    private PaymentProcessor paymentProcessor = new PaymentProcessor();
    private ShippingService shippingService = new ShippingService();
    private EmailService emailService = new EmailService();
    private InvoiceCalc invoiceCalculator = new InvoiceCalc();

    public void createOrder(Order order) {
        orders.add(order);
        System.out.println("Order created");
    }

    public void processPayment(Order order) {
        paymentProcessor.processPayment(order);
    }

    public void shipOrder(Order order) {
        shippingService.shipOrder(order);
    }

    public void sendConfirmationEmail(Order order) {
        emailService.sendConfirmationEmail(order);
    }

    public void calculateInvoice(Order order) {
        invoiceCalculator.calculateInvoice(order);
    }
}
