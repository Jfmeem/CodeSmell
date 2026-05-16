import Coupler.FeatureEnvy.Invoice;
import Coupler.FeatureEnvy.InvoicePrinter;
import Coupler.FeatureEnvy.LineItem;
import Coupler.InappropriateIntimacy.Item;
import Coupler.InappropriateIntimacy.Order;
import Coupler.InappropriateIntimacy.OrderHelper;
import Coupler.IncompleteLibrary.Employeeee;
import Coupler.LargeClass.OrderManager;
import Coupler.LazyClass.OrderService;
import Coupler.MessageChain.Address;
import Coupler.MessageChain.Cstmr;
import Coupler.MessageChain.Odr;
import bloaters.DataClums.ContactInfo;
import bloaters.DataClums.Employee;
import bloaters.LongMethod.InvoiceGenerator;
import bloaters.LongParameter.Customerrr;
import bloaters.LongParameter.Product;
import bloaters.LongParameter.ShippingDetails;
import bloaters.LongParameter.orderprocessor;
import dispensible.Comments.Orderprocessor;
import dispensible.DataClass.Customer;
import dispensible.DeadCode.PaymentService;
import dispensible.DuplicateCode.InvoiceService;
import dispensible.DuplicateCode.ReceiptService;
import oo_abusers.ACwDI;
import ChangePreventers.DivergentChange.Employeee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Alternative classes with different interface ===");
        ACwDI.Order online = new ACwDI.OnlineOrder();
        online.processPayment(100);

        ACwDI.Order offline = new ACwDI.OfflineOrder();
        offline.processPayment(200);

        System.out.println("=== Comments ===");
        Orderprocessor processor = new Orderprocessor();
        processor.processOrder(new dispensible.Comments.Order());

        System.out.println("=== Data Class ===");
        Customer customer = new Customer("Rahim", "Hossain", "rahim@gmail.com");
        System.out.println("Full Name: " + customer.getFullName());
        System.out.println("Valid Email: " + customer.isValidEmail());

        System.out.println("=== Data Clumps ===");
        ContactInfo contact = new ContactInfo("Mirpur, Dhaka", "01712345678");
        Employee emp = new Employee();
        emp.updateEmployee("Karim", contact, "IT", 50000);

        System.out.println("=== Q5 Dead Code ===");
        PaymentService payment = new PaymentService();
        payment.processPayment(500);

        System.out.println("=== Q6 Divergent Change ===");
        Employeee employee = new Employeee("Salam", 50000, 0.1);
        employee.applyRaise(5000);
        employee.calculateTax(0.1);

        System.out.println("=== Q7 Duplicate Code ===");
        InvoiceService invoice = new InvoiceService();
        invoice.printInvoice(new dispensible.Comments.Order());

        ReceiptService receipt = new ReceiptService();
        receipt.printReceipt(new dispensible.Comments.Order());

        System.out.println("=== Q8 Feature Envy ===");
        List<LineItem> items = new ArrayList<>();
        items.add(new LineItem(100));
        items.add(new LineItem(200));
        Invoice invoice1 = new Invoice(items);
        InvoicePrinter printer = new InvoicePrinter();
        printer.printInvoice(invoice1);

        System.out.println("=== Q9 Large Class ===");
        OrderManager manager = new OrderManager();
        dispensible.Comments.Order order = new dispensible.Comments.Order();
        manager.createOrder(order);
        manager.processPayment(order);
        manager.shipOrder(order);
        manager.sendConfirmationEmail(order);
        manager.calculateInvoice(order);


        System.out.println("=== Q11 Incomplete Library Class ===");
        Employeeee emp2 = new Employeeee("Rahim", LocalDate.of(1995, 5, 10));
        System.out.println("Age: " + emp2.getAge());

        System.out.println("=== Q12 Lazy Class ===");
        OrderService service = new OrderService();
        service.processOrder("Order#101");


        System.out.println("=== Q14 Long Parameter List ===");
        Customerrr customerrr = new Customerrr("Rahim", "Dhaka", "01712345678");
        Product product = new Product("Laptop", 1, 50000, 0.1);
        ShippingDetails shipping = new ShippingDetails("credit", "express");
        orderprocessor processorrr = new orderprocessor();
        processorrr.processOrder(customerrr, product, shipping);

        System.out.println("=== Q15 Message Chain ===");
        Address address = new Address("1216");
        Cstmr cstmr = new Cstmr(address);
        Odr odr = new Odr(cstmr);
        System.out.println("Zip Code: " + odr.getZipCode());
    }
}