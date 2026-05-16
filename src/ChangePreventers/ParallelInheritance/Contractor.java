package ChangePreventers.ParallelInheritance;

public class Contractor extends Worker {
    public Contractor(String name, int hourlyRate) {
        super(name, hourlyRate);
    }

    public void increaseHourlyRate(int increment) {
        salary += increment;
        System.out.println(name + " new hourly rate: " + salary);
    }
}
