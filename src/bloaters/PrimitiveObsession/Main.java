package bloaters.PrimitiveObsession;

public class Main {
    public static void main(String[] args) {
        Money salary = new Money(50000);
        HireDate hireDate = new HireDate(2020, 5, 10);
        Employee emp = new Employee("Rahim", salary, hireDate);
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Hire Date: " + emp.getHireDate());
    }
}
