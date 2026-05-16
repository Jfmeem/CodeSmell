package oo_abusers.RefusedBequest;

public class Developer extends Employee implements SalaryAdjustable {
    private String programmingLanguage;

    public Developer(String name, int salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void giveRaise(int raiseAmount) {
        salary += raiseAmount;
        System.out.println(name + " new salary: " + salary);
    }
}
