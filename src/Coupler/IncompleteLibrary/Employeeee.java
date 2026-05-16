package Coupler.IncompleteLibrary;

import java.time.LocalDate;

public class Employeeee {
    private String name;
    private LocalDate birthDate;

    public Employeeee(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return DateUtils.calculateAge(birthDate);
    }
}
