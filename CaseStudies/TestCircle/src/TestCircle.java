import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        c1.userInput(sc);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
    }
}
