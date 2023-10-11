public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(4, 5);
        Point p2 = new Point(8, 9);
        double distance = p1.addPoints(p2);
        System.out.println("the distance is " + distance);
    }
}