package ChangePreventers.ParallelInheritance;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahim", 50000);
        emp.giveRaise(5000);

        Manager mgr = new Manager("Karim", 80000);
        mgr.assignBonus(10000);

        Contractor con = new Contractor("Salam", 500);
        con.increaseHourlyRate(100);
    }
}
