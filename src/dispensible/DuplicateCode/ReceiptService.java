package dispensible.DuplicateCode;

import dispensible.Comments.Order;

public class ReceiptService {
    private OrderCalc calculator = new OrderCalc();

    public void printReceipt(Order order) {
        System.out.println("Receipt Total: " + calculator.calculateTotal(order));
    }

}
