public class Rectangle {
    private double width;
    private double height;

    //    Constructors
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //    Copy Constructor
    public Rectangle(Rectangle rectangle) {
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    //    Getter and setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

//    member Function

    public double calculateArea() {
        return getHeight() * getWidth();
    }

    public double calculatePerimeter() {
        return  2 * (getWidth() * getHeight());
    }

    public void displayAreaAndPerimeter() {
        System.out.println("The Area is " + this.calculateArea());
        System.out.println("The Perimeter is " + this.calculatePerimeter());
    }

    public void compareArea(Rectangle rectangle) {
        if(this.calculateArea() > rectangle.calculateArea()) {
            System.out.println(this.calculateArea() + " is Greater than  " + rectangle.calculateArea());
            return;
        }
        if(this.calculateArea() < rectangle.calculateArea()) {
            System.out.println(this.calculateArea() + " is Smaller than  " + rectangle.calculateArea());
            return;
        }
        System.out.println("Both are Equal");
    }
}


