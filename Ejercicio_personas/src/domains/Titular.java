package domains;

import domains.abstracts.Teacher;

public class Titular extends Teacher {
    public Titular(String name, String lastName, String subject) {
        super(name, lastName, subject);
    }

    @Override
    public void enseña() {
        System.out.printf("El maestro %s %s enseña la materia de %s \n", getName(), getLastName(), getSubject());
    }

    @Override
    protected void showPerson() {
    }
}
