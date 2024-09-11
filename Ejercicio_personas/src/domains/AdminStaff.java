package domains;

import domains.abstracts.Salaried;

public class AdminStaff extends Salaried {

    public AdminStaff(String name, String lastName, double salary) {
        super(name, lastName, salary);
    }

    @Override
    public void calcularPrima() {
        double prima = (getSalary() * 180) / 360;
        System.out.printf("La prima es: %s \n", prima);
    }

    @Override
    protected void showPerson() {
        System.out.printf("El administrativo es %s %s \n", getName(), getLastName());
    }
}
