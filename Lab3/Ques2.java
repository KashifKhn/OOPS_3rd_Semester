import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Number:..... ");
        int number = sc.nextInt();
        if(number == 0)
            System.out.println("Number is Neutral");
        else if(number > 0)
            System.out.println("Number is Positive");
        else
            System.out.println("Number is Negative");


    }
}
