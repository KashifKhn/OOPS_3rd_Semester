public class Main {
    public static void main(String[] args) {
        Distance d1 = new Distance(10, 6);
        Distance d2 = new Distance(5, 10);
        d1.displayDistance();
        d2.displayDistance();
        Distance d3 = d1.addDistance(d2);
        d3.displayDistance();
    }
}