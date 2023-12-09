import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> personArrayList = new ArrayList<>();
        Random random = new Random();
        String cont = "Yes";
        do {
            int randomNumber = random.nextInt(2);
            Person p;
            if (randomNumber == 0)
                p = new Student();
            else
                p = new Professor();

            p.getDataFromUser(sc);
            personArrayList.add(p);
            System.out.print("Press any Key To Continue or N to Stop");
            sc.nextLine();
            cont = sc.nextLine();
            System.out.println(cont);
        } while (!cont.equals("n") && !cont.equals("N"));

        System.out.println();
        System.out.println("__________OutPut_______________");
        for (Person person : personArrayList) {
            System.out.println(person);
            System.out.println();
        }
    }
}