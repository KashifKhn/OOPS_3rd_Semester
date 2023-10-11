import java.time.LocalDate;
import java.util.Scanner;

public class TestTime {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now().getDayOfMonth());
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Hour: ");
//        int h= sc.nextInt();
//        System.out.print("Enter the Min: ");
//        int m= sc.nextInt();
//        System.out.print("Enter the sec: ");
//        int s= sc.nextInt();

        Time time = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
//        time.userInput();
        time.printUniversalTime();
        time.printTime();
    }
}
