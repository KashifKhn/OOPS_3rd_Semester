import java.util.Scanner;

public class TestDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date d1 = new Date();
        d1.userInputDate(sc);
        d1.displayDate();
    }
}
