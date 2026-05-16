package Coupler.InappropriateIntimacy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Q10 Inappropriate Intimacy ===");
        List<Item> itm = new ArrayList<>();
        itm.add(new Item(100));
        itm.add(new Item(200));
        Order order1 = new Order();
        OrderHelper helper = new OrderHelper();
        helper.applyDiscount(order1, 0.1);
    }
}
