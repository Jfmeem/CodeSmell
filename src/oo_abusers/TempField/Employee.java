package oo_abusers.TempField;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void giveRaise(int raiseAmount) {
        salary = salary + raiseAmount;
        System.out.println(name + " new salary: " + salary);
    }

    public int getSalary() { return salary; }
}
