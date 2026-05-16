package ChangePreventers.DivergentChange;

public class SalaryManager {
    private int salary;

    public SalaryManager(int salary) {
        this.salary = salary;
    }

    public void applyRaise(int raiseAmount) {
        salary += raiseAmount;
        System.out.println("New salary: " + salary);
    }

    public int getSalary() { return salary; }
}
