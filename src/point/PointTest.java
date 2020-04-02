package point;

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

        Double result = p.getDistance(p);
        Assert.assertEquals(Double.valueOf(0), result);
    }

    @Test
    public void distanceBetweenTwoPointsWhoHaveTheSameXandYshouldBe0(){
        Point p1 = new Point(1, 9);
        Point p2 = new Point(1, 9);

        Double result = p1.getDistance(p2);
        Assert.assertEquals(Double.valueOf(0), result);
    }

    @Test
    public void distanceBetweenTwoDifferentsPoints(){
        Point p1 = new Point(1, 9);
        Point p2 = new Point(4, 7);

        Double result = p1.getDistance(p2);
        Assert.assertEquals(Double.valueOf(3.605551275463989), result);
    }



}
