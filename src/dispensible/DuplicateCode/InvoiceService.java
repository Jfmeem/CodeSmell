package dispensible.DuplicateCode;

import dispensible.Comments.Order;

public class InvoiceService {
    private OrderCalc calculator = new OrderCalc();

    public void printInvoice(Order order) {
        System.out.println("Invoice Total: " + calculator.calculateTotal(order));
    }
}
