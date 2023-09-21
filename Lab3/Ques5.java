import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Please Enter the Second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Please Enter the Third Number: ");
        int num3 = sc.nextInt();
        if(num1 == num2 && num2 == num3)
            System.out.println("All are Equal");
        else if(num1 > num2 && num1 > num3)
            System.out.println("Num 1 is Greater " + num1);
        else if (num2 > num1 && num2 > num3)
            System.out.println("Num 2 is Greater " + num2);
        else
            System.out.println("Num 3 is Greater " + num3);


    }
}
