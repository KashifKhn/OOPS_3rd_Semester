import java.util.Scanner;

public class Time {

    private int hour;
    private int minute;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void userInputTime(Scanner sc) {
        System.out.print("Please Enter the Hours:  ");
        this.hour = sc.nextInt();
        System.out.print("Please Enter the Minute:  ");
        this.minute = sc.nextInt();
    }

    public void showTime() {
        System.out.printf("\n%02d : %02d\n", this.hour, this.minute);
    }

    public void showMinute() {
        int minute = hour * 60;
        System.out.printf("\nMinute = %d\n", this.minute + minute);
    }
}


