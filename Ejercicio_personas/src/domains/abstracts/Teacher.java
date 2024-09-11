package domains.abstracts;

import java.lang.reflect.Method;

public abstract class Teacher extends Person{
    private String subject;

    // Constructor
    public Teacher(String name, String lastName, String subject) {
        super(name, lastName);
        this.subject = subject;
    }

    // Getters
    public String getSubject() {
        return subject;
    }

    // Setters
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Method
    public abstract void enseña();
}
