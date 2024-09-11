package services;

import domains.*;

public class Main {
    public static void main(String[] args) {
        AdminStaff admin = new AdminStaff("Pepito", "Perez", 300.000);
        admin.calcularPrima();

        Titular titular = new Titular("Juanito", "Juarez", "Filosofia");
        titular.enseña();

        Interim interino = new Interim("Marisol", "Lopez", "Sociales");
        interino.enseña();

        Member miembro = new Member("Jose", "Hernandez", 20, "Comedero Comunitario");
        miembro.jornada();

        External externo = new External("Lorena", "Quiceno", 10, "Limpieza Ciudad");
        externo.jornada();
    }
}