import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Please Enter the Character.... ");
        //            A 65 Z 90
//        97 to 122
        char ch = sc.next().charAt(0);
        int num;
        if(ch >= 65 && ch <= 90) {
            System.out.println("Cap");
             num =Math.abs(65 - ch) ;
             ch = (char) (97 + num);
        }
        else if(ch >= 97 && ch <= 122)
        {
            System.out.println("sm");
            num =Math.abs(97 - ch) ;
            ch = (char) (65 + num);
        }
        System.out.println(ch);

    }
}
