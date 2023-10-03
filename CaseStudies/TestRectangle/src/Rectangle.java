public class Rectangle {
    private double length ;
    private double width ;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0 && length < 20)
            this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0 && width < 20)
            this.width = width;
    }

    public void displayPerimeter() {
        double perimeter = 2 * (this.length + this.width);
        System.out.println("The perimeter is:  " + perimeter);
    }
    public void displayArea() {
        double area = this.length + this.width;
        System.out.println("The perimeter is:  " + area);
    }

}
