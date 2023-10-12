public class Distance {
    private double feet;
    private double inches;

    //    Constructors
    public Distance() {
        this.feet = 0.0;
        this.inches = 0.0;
    }

    // parameterized constructor
    public Distance(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Getters and setters
    public double getFeet() {
        return feet;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

//    Methods
    public void displayDistance() {
        System.out.println("Feet: " + this.feet + "\tInches: " + this.inches);
    }

    public Distance addDistance(Distance d2) {
        double inches = this.inches + d2.inches;
        int extraFeet = (int) (inches / 12);
        inches = inches % 12;
        double feet = this.feet + d2.feet + extraFeet;
        return new Distance(feet, inches);
    }
}
