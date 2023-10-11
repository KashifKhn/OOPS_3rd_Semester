import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Time time = new Time(23, 32, 31);
//        Time time2 = new Time(14, 32, 31);
//        Time time3 = time.addTime(time2);
//        time3.displayTime12();
//        time3.displayUniversalTime();

        Date date = new Date(28, 1, 2015);
        Time time=new Time(14,25,23);
        DateTime dateTime1=new DateTime(date,time);
        DateTime dateTime2=new DateTime(date,time);
        dateTime1.addDateTime(dateTime2);

    }
}