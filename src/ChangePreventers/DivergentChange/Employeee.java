package ChangePreventers.DivergentChange;

public class Employeee {
    private String name;
    private SalaryManager salaryManager;
    private TaxCalc taxCalculator;

    public Employeee(String name, int salary, double taxRate) {
        this.name = name;
        this.salaryManager = new SalaryManager(salary);
        this.taxCalculator = new TaxCalc();
    }

    public void applyRaise(int raiseAmount) {
        salaryManager.applyRaise(raiseAmount);
    }

    public double calculateTax(double taxRate) {
        return taxCalculator.calculateTax(salaryManager.getSalary(), taxRate);
    }

}