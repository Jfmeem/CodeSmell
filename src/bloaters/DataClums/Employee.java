package bloaters.DataClums;

public class Employee {
    private String name;
    private ContactInfo contactInfo;
    private String department;
    private int salary;


    public void updateEmployee(String name, ContactInfo contactInfo,
                               String department, int salary) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.department = department;
        this.salary = salary;
        System.out.println("Employee updated: " + name);
        System.out.println("Address: " + contactInfo.getAddress());
        System.out.println("Phone: " + contactInfo.getPhoneNumber());
    }
}
