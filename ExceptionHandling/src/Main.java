import java.util.Scanner;

public class Main {
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=0, num2=0, result = 0;
        boolean flag = true;
        while (flag) {
            try {
                System.out.print("Enter Number 1: ");
                num1 = sc.nextInt();
                System.out.print("Enter Number 2: ");
                num2 = sc.nextInt();
                result = divide(num1, num2);
                flag = false;
            } catch (Exception e) {
                System.out.println("The following exceptional occurred\t" + e);
                System.out.println();
            }
        }
        System.out.printf("%d divide by %d = %d", num1, num2, result);
    }
}