import java.util.Scanner;

public class Professor extends Person {
    private int numberOfPublication;

    public Professor() {
        super();
        setNumberOfPublication(0);
    }

    public Professor(String name, int numberOfPublication) {
        super(name);
        setNumberOfPublication(numberOfPublication);
    }

    public int getNumberOfPublication() {
        return numberOfPublication;
    }

    public void setNumberOfPublication(int numberOfPublication) {
        if (numberOfPublication >= 0) {
            this.numberOfPublication = numberOfPublication;
            return;
        }

        throw new IllegalArgumentException("Number of Publication must be Zero or Greater Than Zero");
    }

    @Override
    public void getDataFromUser(Scanner sc) {
        System.out.println("--------Professor Portal------------");
        super.getDataFromUser(sc);
        System.out.print("Enter the number of Publication: ");
        this.setNumberOfPublication(sc.nextInt());
    }

    @Override
    public String displayData() {
        return String.format("---------Professor Portal ------------\n%sNumber of Publication %d\n", super.displayData(), this.getNumberOfPublication());
    }

    @Override
    public boolean isOutstanding() {
        if (this.getNumberOfPublication() >= 20)
            return true;

        return false;
    }

    @Override
    public String toString() {
        return String.format("---------Professor Portal ------------\n%sNumber of Publication %d\nIs outstanding : %b", super.displayData(), this.getNumberOfPublication(), this.isOutstanding());
    }
}
