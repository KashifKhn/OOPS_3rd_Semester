import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Please Enter the Second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Please Enter the Third Number: ");
        int num3 = sc.nextInt();
        if (num1 == num2 && num2 == num3)
            System.out.println("All are Equal");
        else if (num1 > num2 && num2 > num3)
            System.out.println(num1 + " " + num2 + " " + num3);
        else if (num2 > num1 && num2 > num3)
            System.out.println(num2 + " " + num3 + " " + num1);
        else
            System.out.println(num3 + " " + num2 + " " + num1);
    }
}

