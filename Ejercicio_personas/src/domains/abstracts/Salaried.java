package domains.abstracts;

public abstract class Salaried extends Person {
    private double salary;

    // Constructor
    public Salaried(String name, String lastName, double salary) {
        super(name, lastName);
        this.salary = salary;
    }

    // Getters
    public double getSalary() {
        return salary;
    }

    // Setters
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method
    public abstract void calcularPrima();


}
