import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        e1.userInput(sc);
        e1.showEmployeeInfo();
        e1.showYearlySalary();
        e1.riseSalaryByTenPercent();
        e1.showYearlySalary();
        e1.showEmployeeInfo();
    }
}
