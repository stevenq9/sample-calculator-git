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

    //New functions for second increment
    public double square_root(int num1){
        System.out.println("Square root: sqrt("+ num1 + ")= " + Math.sqrt(num1) );
        return Math.sqrt(num1);
    }

    public double powerment(int num, int exponent){
        System.out.println("Powerment: "+ num + "^ " + exponent + "= "+ Math.pow(num, exponent) );
        return Math.pow(num, exponent);
    }

    public double logarithm(int num){
        System.out.println("Logarithm: log("+ num + ")= " + Math.log(num) );
        return Math.log(num);
    }

}
