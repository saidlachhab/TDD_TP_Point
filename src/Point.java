public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getDistance(Point point){
        if (this.equals(point)){
            return 0;
        }
        return 1;
    }
}
