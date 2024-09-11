package services;

import operations.Dividir;
import operations.Multiplicar;
import operations.Restar;
import operations.Sumar;

public class Main {

    public static void main(String[] args) {

        Sumar suma = new Sumar();
        Restar resta = new Restar();
        Multiplicar multiplicacion = new Multiplicar();
        Dividir division = new Dividir();

        suma.operation(1, 2);
        resta.operation(5.5, 2.5);
        multiplicacion.operation(10, 2);
        division.operation(50, 2);


    }
}