package ChangePreventers.DivergentChange;

public class TaxCalc {
    public double calculateTax(int salary, double taxRate) {
        double tax = salary * taxRate;
        System.out.println("Tax: " + tax);
        return tax;
    }
}
