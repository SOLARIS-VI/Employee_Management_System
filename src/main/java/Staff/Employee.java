package Staff;

public class Employee {
    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    // Method to raise salary
    public void raiseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
        }
    }

    // Method to calculate bonus
    public double payBonus() {
        return salary * 0.01;
    }
}
