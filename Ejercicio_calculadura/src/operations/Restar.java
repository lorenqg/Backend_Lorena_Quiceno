package operations;

import operations.abstracts.Operations;

public class Restar extends Operations {

    @Override
    public void operation(double number1, double number2){

        double result = number1 - number2;

        System.out.printf("%s - %s = %s \n", number1, number2, result);
    }
}
