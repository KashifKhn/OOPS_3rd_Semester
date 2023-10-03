import java.util.Scanner;

public class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void userInput(Scanner sc) {
        System.out.print("Please Enter the Radius: ");
        this.radius = sc.nextDouble();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
