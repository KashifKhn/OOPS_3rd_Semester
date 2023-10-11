public class Point {
    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double addPoints(Point p2) {
        int xes = p2.x - this.x;
        int yes = p2.y - this.y;
        xes =(int) Math.pow(xes, 2);
        yes = yes* yes;
        double root = Math.sqrt(xes + yes);
        return root;
    }
}
