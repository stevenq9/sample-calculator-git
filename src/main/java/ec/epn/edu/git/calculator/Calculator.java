package ec.epn.edu.git.calculator;

public class Calculator {
    public int addition(int num1, int num2) {
        System.out.println("Addition: " + num1 + "+"+num2 + "= " + (num1+num2) );
        return num1+num2;
    }

    public int subtraction(int num1, int num2) {
        System.out.println("Subtraction: "+ num1 + "-"+num2 + "= " + (num1-num2) );
        return num1-num2;
    }

    public int multiplication(int num1, int num2) {
        System.out.println("Multiplication: " + num1 + "*"+num2 + "= " + (num1*num2) );
        return num1*num2;
    }

    public int division(int num1, int num2) {
        System.out.println("Division: "+ num1 + "/"+num2 + "= " + (num1/num2) );
        return num1/num2;
    }


}
