package dispensible.DataClass;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean isValidEmail() {
        return email.contains("@") && email.contains(".");
    }

    public String getEmail() { return email; }
}
