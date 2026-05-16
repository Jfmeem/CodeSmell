package dispensible.DuplicateCode;

import dispensible.Comments.Item;
import dispensible.Comments.Order;

public class OrderCalc {
    public double calculateTotal(Order order) {
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        return total + (total * 0.2);
    }
}
