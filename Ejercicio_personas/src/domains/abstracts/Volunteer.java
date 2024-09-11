package domains.abstracts;

public abstract class Volunteer extends Person {
    private int hours;
    private String project;

    // Constructor
    public Volunteer(String name, String lastName, int hours, String project) {
        super(name, lastName);
        this.hours = hours;
        this.project = project;
    }

    // Getters
    public int getHours() {
        return hours;
    }

    public String getProject() {
        return project;
    }

    // Setters
    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setProject(String project) {
        this.project = project;
    }

    // Method
    public abstract void jornada();
}
