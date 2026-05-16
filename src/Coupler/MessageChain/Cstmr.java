package Coupler.MessageChain;

public class Cstmr {
    private Address address;

    public Cstmr(Address address) {
        this.address = address;
    }

    public String getZipCode() {
        return address.getZipCode();
    }
}
