package ec.epn.edu.git.calculator;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
    private int a, b, expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        //For addition
        objects.add(new Object[]{15,15,30});
        objects.add(new Object[]{59,41,100});
        objects.add(new Object[]{21,21,42});
        objects.add(new Object[]{152,23,175});
        objects.add(new Object[]{12,3,15});
        objects.add(new Object[]{46,4,50});
        objects.add(new Object[]{33,33,66});
        objects.add(new Object[]{1000,515,1515});
        objects.add(new Object[]{789,211,1000});
        return objects;
    }

    public CalculatorParametersTest(int a, int b, int expected){
        this.a=a;
        this.b=b;
        this.expected=expected;
    }

    @Test
    public void given_parameters_when_addition_then_summation(){
        Calculator c = new Calculator();
        int actual = c.addition(a,b);
        assertEquals(expected, actual);
    }

}