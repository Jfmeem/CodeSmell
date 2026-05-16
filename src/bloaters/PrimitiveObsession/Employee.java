package bloaters.PrimitiveObsession;

public class Employee {
    private String name;
    private Money salary;
    private HireDate hireDate;

    public Employee(String name, Money salary, HireDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int getSalary() { return salary.getAmount(); }
    public String getHireDate() { return hireDate.getFormattedDate(); }
}
