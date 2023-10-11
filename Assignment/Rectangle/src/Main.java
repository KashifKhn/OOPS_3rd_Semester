public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(15, 10);
        Rectangle rectangle2 = new Rectangle(25, 10);
        rectangle.displayAreaAndPerimeter();
        System.out.println();
        rectangle2.displayAreaAndPerimeter();
        System.out.println();
        rectangle.compareArea(rectangle2);
        rectangle2.compareArea(rectangle);

    }
}