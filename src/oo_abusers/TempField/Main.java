package oo_abusers.TempField;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahim", 50000);
        emp.giveRaise(5000);
        System.out.println("Final Salary: " + emp.getSalary());
    }
}
