package bloaters.LongMethod;

public class InvoiceGenerator {

    public void generateInvoice(odr order) {
        double total = calculateTotal(order);
        double discount = calculateDiscount(total);
        double tax = calculateTax(total);
        double finalAmount = total - discount + tax;
        printInvoice(order, total, discount, tax, finalAmount);
    }

    private double calculateTotal(odr order) {
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        return total;
    }

    private double calculateDiscount(double total) {
        return total * 0.1;
    }

    private double calculateTax(double total) {
        return total * 0.2;
    }

    private void printInvoice(odr order, double total,
                              double discount, double tax,
                              double finalAmount) {
        System.out.println("Invoice for Order ID: " + order.getId());
        System.out.println("Items:");
        for (Item item : order.getItems()) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }
        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Amount: " + finalAmount);
    }
}
