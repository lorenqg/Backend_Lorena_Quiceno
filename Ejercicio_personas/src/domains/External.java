package domains;

import domains.abstracts.Volunteer;

public class External extends Volunteer {

    public External(String name, String lastName, int hours, String project) {
        super(name, lastName, hours, project);
    }

    @Override
    public void jornada() {
        System.out.printf("%s %s es un voluntario externo y tiene el proyecto de %s por %s horas \n",
                getName(), getLastName(), getProject(), getHours());
    }

    @Override
    protected void showPerson() {
    }
}
