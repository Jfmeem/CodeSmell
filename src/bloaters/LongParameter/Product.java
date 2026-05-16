package bloaters.LongParameter;

public class Product {
    private String name;
    private int quantity;
    private double price;
    private double discount;

    public Product(String name, int quantity,
                   double price, double discount) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public double getDiscount() { return discount; }
}
