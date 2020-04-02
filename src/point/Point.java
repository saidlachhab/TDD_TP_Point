package point;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Double getDistance(Point point1){

        return Math.sqrt((point1.y - this.y) * (point1.y - this.y) + (point1.x - this.x) * (point1.x - this.x));
    }

}
