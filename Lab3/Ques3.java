import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character.... ");
        char ch = sc.nextLine().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch== 'u'||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch== 'U')
            System.out.println("Character is Vowel");
        else
            System.out.println("Character is Constant");
    }
}
