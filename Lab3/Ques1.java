import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter The Number:... ");
        int number = sc.nextInt();
        if (number % 2 == 0)
            System.out.println(number + " Number is Even");
        else
            System.out.println(number + " Number is Odd");
    }
}
