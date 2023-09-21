import java.util.Scanner;

public class Ques7 {
    /**
     * @param args are Command Line Arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Number is Not palindromic");
            return;
        }
        if (num < 10) {
            System.out.println("Number is palindromic");
            return;
        }
        if (num % 10 == 0) {
            System.out.println("Number is Not palindromic");
            return;
        }
        int tempNum = num;
        int palindromicNum = 0;
        while (tempNum > 0) {
            palindromicNum = palindromicNum * 10 + tempNum % 10;
            tempNum /= 10;
        }
        if (num == palindromicNum)
            System.out.println("Number is palindromic");
        else
            System.out.println("Number is Not palindromic");

    }
}
