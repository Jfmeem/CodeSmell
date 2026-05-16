package ChangePreventers.ParallelInheritance;

public abstract class Worker {
    protected String name;
    protected int salary;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void giveRaise(int amount) {
        salary += amount;
        System.out.println(name + " new salary: " + salary);
    }

    public void assignBonus(int bonus) {
        System.out.println(name + " bonus: " + bonus);
    }
}
