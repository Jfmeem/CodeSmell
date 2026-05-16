package Coupler.MiddleMan;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Rahim", "rahim@gmail.com");
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
    }
}
