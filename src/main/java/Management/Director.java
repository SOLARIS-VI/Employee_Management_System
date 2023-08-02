package Management;

public class Director extends Manager {
    private double budget;

    public Director(String name, String niNumber, double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    // Getter for budget
    public double getBudget() {
        return budget;
    }

    // Override the payBonus method to return 2% of salary
    @Override
    public double payBonus() {
        return getSalary() * 0.02;
    }
}
