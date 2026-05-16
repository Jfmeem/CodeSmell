package Coupler.FeatureEnvy;

import java.util.List;

public class Invoice {
    private List<LineItem> items;

    public Invoice(List<LineItem> items) {
        this.items = items;
    }

    public List<LineItem> getItems() { return items; }

    public double getSubtotal() {
        double subtotal = 0;
        for (LineItem item : items) {
            subtotal += item.getPrice();
        }
        return subtotal;
    }

    public double getTax() {
        return getSubtotal() * 0.2;
    }

    public double getTotal() {
        return getSubtotal() + getTax();
    }

    public void printInvoice() {
        System.out.println("Subtotal: " + getSubtotal());
        System.out.println("Tax: " + getTax());
        System.out.println("Total: " + getTotal());
    }
}