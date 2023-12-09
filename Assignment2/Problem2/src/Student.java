import java.util.Scanner;

public class Student extends Person {
    private double GPA;

    public Student(String name, double gpa) {
        super(name);
        this.setGPA(gpa);
    }

    public Student() {
        super();
        setGPA(0.0);
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        if(GPA > 0) {
            this.GPA = GPA;
//            return;
        }
//        throw new IllegalArgumentException();
    }

    @Override
    public void getDataFromUser(Scanner sc) {
        System.out.println("------Student Portal-----------");
        super.getDataFromUser(sc);
        System.out.print("Enter The GPA:.....");
        setGPA(sc.nextDouble());
    }

    @Override
    public String displayData() {
        return String.format("\n-----------Student Portal----------------\n%sGPA: %f\n", super.displayData(), this.getGPA());
    }

    @Override
    public boolean isOutstanding() {
        if(this.getGPA() >= 3.5)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return String.format("\n-----------Student Portal----------------\n%sGPA: %f\nIs Outstanding Student: %b", super.displayData(), this.getGPA(), this.isOutstanding());
    }
}
