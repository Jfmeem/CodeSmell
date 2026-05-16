package bloaters.LongMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Apple", 50));
        items.add(new Item("Banana", 30));
        odr order = new odr("ORD001", items);
        InvoiceGenerator generator = new InvoiceGenerator();
        generator.generateInvoice(order);
    }
}
