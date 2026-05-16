package oo_abusers.RefusedBequest;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Rahim", 50000, "Java");
        dev.giveRaise(5000);

        Manager mgr = new Manager("Karim", 80000, 10000);
        mgr.assignBonus(15000);
    }
}
