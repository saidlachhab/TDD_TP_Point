import org.junit.Assert;
import org.junit.Test;


public class PointTest {

    @Test
    public void distanceBetweenTwoPointsMustbePositive(){
        Point p = new Point(1, 4);
        Point p2 = new Point(5,6);

        Assert.assertTrue(p.getDistance(p2) >= 0);

    }
    
    @Test
    public void distanceBetweenPointAndItselfShouldBe0(){
        Point p = new Point(1, 4);

        int result = p.getDistance(p);
        Assert.assertEquals(0, result);
    }

}
