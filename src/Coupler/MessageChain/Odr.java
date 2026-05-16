package Coupler.MessageChain;

public class Odr {
    private Cstmr customer;

    public Odr(Cstmr customer) {
        this.customer = customer;
    }

    public String getZipCode() {
        return customer.getZipCode();
    }
}
