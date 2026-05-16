package bloaters.PrimitiveObsession;

public class Money {
    private int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public int getAmount() { return amount; }

    public void add(Money other) {
        this.amount += other.amount;
        System.out.println("New salary: " + this.amount);
    }
}
