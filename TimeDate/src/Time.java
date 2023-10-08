import java.util.Scanner;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time(int hours) {
        this(hours, 0, 0);
    }

    public Time(int hours, int minutes) {
        this(hours, minutes, 0);
    }

    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
            return;
        }
        System.out.println("Invalid Hours");
        this.hours = 0;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
            return;
        }
        System.out.println("Invalid Minutes");
        this.minutes = 0;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
            return;
        }
        System.out.println("Invalid Seconds");
        this.seconds = 0;
    }

    public void userInputTime(Scanner sc) {
        System.out.println("Please Enter the Hours");
        setHours(sc.nextInt());
        System.out.println("Please Enter the Minutes");
        setMinutes(sc.nextInt());
        System.out.println("Please Enter the Seconds");
        setSeconds(sc.nextInt());
    }

    public void displayUniversalTime() {
        System.out.print("\nUniversal Time:  ");
        System.out.printf("%02d : %02d : %02d \n", this.getHours(), this.getMinutes(), this.getSeconds());
    }

    public void displayTime12() {
        int hour = this.getHours() % 12;
        if (this.getHours() == 0) hour = 12;
        System.out.print("\n12 Hour Time:  ");
        System.out.printf("%02d : %02d : %02d ", hour, this.getMinutes(), this.getSeconds());
        System.out.print(this.getHours() < 12 ? "AM" : "PM");
        System.out.println();
    }

    public Time addTime(Time t) {
        int second = this.getSeconds() + t.getSeconds();
        int extraMinutes = second / 60;
        second %= 60;
        int minute = this.getMinutes() + t.getMinutes() + extraMinutes;
        int extraHours = minute / 60;
        minute %= 60;
        int hour = this.getHours() + t.getHours() + extraHours;
        hour %= 24;
        return new Time(hour, minute, second);
    }
}
