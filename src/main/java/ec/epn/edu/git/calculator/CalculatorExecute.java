package ec.epn.edu.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------");
        System.out.println("--------------- Calculator -------------------");
        System.out.println("----------------------------------------------");

        Calculator c = new Calculator();
        int addition = c.addition(48,77);
        System.out.println("----------------------------------------------");

        int subtraction = c.subtraction(59,45);
        System.out.println("----------------------------------------------");

        int multiplication = c.multiplication(4,33);
        System.out.println("----------------------------------------------");

        int division = c.division(88,44);
        System.out.println("----------------------------------------------");
    }
}