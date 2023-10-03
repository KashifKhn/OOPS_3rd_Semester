import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void userInputDate(Scanner sc) {
        System.out.print("Please Enter the Day: ");
        this.day = sc.nextInt();
        System.out.print("Please Enter the Month: ");
        this.month = sc.nextInt();
        System.out.print("Please Enter the Year: ");
        this.year = sc.nextInt();
    }

    public void displayDate() {
        System.out.printf("%02d/ %02d/ %04d",this.day, this.month, this.year );
    }
}
