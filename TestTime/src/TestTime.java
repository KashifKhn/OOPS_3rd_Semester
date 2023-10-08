import java.time.LocalDate;

public class TestTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now().getDayOfMonth());
        Time time = new Time();
        time.userInput();
        time.printUniversalTime();
        time.printTime();
    }
}
