package oo_abusers.RefusedBequest;

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void assignBonus(int bonusAmount) {
        this.bonus = bonusAmount;
        System.out.println(name + " bonus: " + bonus);
    }
}
