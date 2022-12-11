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


    //*********** Unit Test for second increment *************
    //Unit test for square root
    @Test
    public void given_one_integer_when_squareRoot_then_ok(){
        System.out.println("Unit Test for square root");
        assertEquals(4.0,c.square_root(16), 0.0001);
    }
    //Unit test for powerment
    @Test
    public void given_two_integers_when_powerment_then_ok(){
        System.out.println("Unit Test for powerment");
        assertEquals(125,c.powerment(5,3),0.0001);
    }
    //Unit test for logarithm
    @Test
    public void given_one_integer_when_logarithm_then_ok(){
        System.out.println("Unit Test for logarithm");
        assertEquals(0.6931471805599453,c.logarithm(2), 0.0001);
    }






}