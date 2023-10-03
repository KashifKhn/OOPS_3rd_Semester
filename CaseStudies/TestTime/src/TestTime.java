import java.util.Scanner;

public class TestTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time t1 = new Time();
        t1.userInputTime(sc);
        t1.showTime();
        t1.showMinute();
    }
}