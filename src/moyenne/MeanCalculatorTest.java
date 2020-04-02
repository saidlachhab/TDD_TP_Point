package moyenne;

import org.junit.Assert;
import org.junit.Test;

public class MeanCalculatorTest {

    @Test
    public void meanOf_2_4_6_is_4(){
        int [] array = new int[] {2,4,6};

        Assert.assertEquals(Double.valueOf(4),MeanCalculator.mean(array));
    }

    @Test(expected = ArithmeticException.class)
    public void meanOfEmptyArrayShouldThrowException(){
        int [] array = new int[] {};

        Assert.assertEquals(Double.valueOf(4),MeanCalculator.mean(array));

    }

}