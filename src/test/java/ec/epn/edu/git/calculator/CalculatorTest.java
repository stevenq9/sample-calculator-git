package ec.epn.edu.git.calculator;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    //Variables
    Calculator c;

    @Before
    public void setUp(){
        c = new Calculator();
    }
    //Unit Test for addition
    @Test
    public void given_two_integers_when_addition_then_ok(){
        System.out.println("Unit Test for addition ");
        assertEquals(27,c.addition(5,22));
    }
    //Unit Test for subtraction
    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        System.out.println("Unit Test for subtraction ");
        assertEquals(72,c.subtraction(84,12));
    }
    //Unit Test for multiplication
    @Test
    public void given_two_integers_when_multiplication_then_ok(){
        System.out.println("Unit Test for multiplication");
        assertEquals(20,c.multiplication(4,5));
    }
    //Unit Test for division
    @Test
    public void given_two_integers_when_division_then_ok(){
        System.out.println("Unit Test for division");
        assertEquals(2,c.division(66,33));
    }



}