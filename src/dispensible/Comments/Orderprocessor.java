package dispensible.Comments;

public class Orderprocessor {

    public void processOrder(Order order) {
        if (isOrderEmpty(order)) {
            System.out.println("Order is empty");
            return;
        }
        double total = calculateTotal(order);
        double tax = calculateTax(total);
        printTotal(total, tax);
    }

    private boolean isOrderEmpty(Order order) {
        return order.getItems().size() == 0;
    }

    private double calculateTotal(Order order) {
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        return total;
    }

    private double calculateTax(double total) {
        return total * 0.2;
    }

    private void printTotal(double total, double tax) {
        System.out.println("Total with tax: " + (total + tax));
    }
}