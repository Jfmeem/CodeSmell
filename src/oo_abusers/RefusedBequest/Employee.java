package oo_abusers.RefusedBequest;

public class Employee {
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
        System.out.println(name + " salary set to: " + salary);
    }
}
