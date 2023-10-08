import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Time time = new Time(23, 32, 31);
//        Time time2 = new Time(14, 32, 31);
//        Time time3 = time.addTime(time2);
//        time3.displayTime12();
//        time3.displayUniversalTime();

        Date date = new Date(12, 12, 2012);
        Date date2 = new Date(12, 12, 2012);
        Date date3 = date.addDate(date2);
        date3.displayDate();
        date3.displayDateWithMonthNames();
    }
}