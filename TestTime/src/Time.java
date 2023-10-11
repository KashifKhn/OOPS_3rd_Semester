import java.util.Scanner;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private String meridiemIndicator;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        if(hours >= 0 && hours <24)
            this.hours = hours;
        else {
            System.out.println("Invalid Hours");
            this.hours = 0;
        }
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        if(minutes >= 0 && minutes <60)
            this.minutes = minutes;
        else {
            System.out.println("Invalid Minutest");
            this.minutes = 0;
        }
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        if(seconds >= 0 && seconds <60)
            this.seconds = seconds;
        else {
            System.out.println("Invalid Second");
            this.seconds = 0;
        }
    }

    public void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Hours: ");
        this.setHours(sc.nextInt());
        System.out.print("Please Enter Minutes: ");
        this.setMinutes(sc.nextInt());
        System.out.print("Please Enter Seconds: ");
        this.setSeconds(sc.nextInt());
    }

    public void printUniversalTime() {
        System.out.printf("\n%02d : %02d : %02d\n", this.getHours(),this.getMinutes(), this.getSeconds());
    }
    public void printTime() {
        int hour = this.hours;
        if(hour>12) {
            hour -= 12;
        }
        if(hour == 0)
            hour = 12;
        String str = this.hours > 12 ? "PM" : "AM";
        System.out.printf("\n%02d : %02d : %02d %s",hour, this.getMinutes(), this.getSeconds(), str );
    }
}
