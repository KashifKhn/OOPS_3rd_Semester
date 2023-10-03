public class Rectangle {
    private double length = 1;
    private double width = 1;

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
}
