// ex 3.13

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Getter and setter methods for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    // Getter and setter methods for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    // Getter and setter methods for monthlySalary
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Method to calculate yearly salary
    public double calculateYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to give a raise
    public void giveRaise(double percentage) {
        monthlySalary *= (1 + percentage / 100);
    }
}
