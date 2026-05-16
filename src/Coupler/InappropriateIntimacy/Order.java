package Coupler.InappropriateIntimacy;

import java.util.List;

public class Order {
    private List<Item> items;
    private double discount;

    public Order() {
        this.items = items;
    }

    public double applyDiscount(double rate) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        this.discount = total * rate;
        System.out.println("Discount applied: " + discount);
        return discount;
    }
}
