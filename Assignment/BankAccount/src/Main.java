import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", "Kashif", 1000);
        BankAccount account2 = new BankAccount(account1);
        account2.setAccountNumber("987654321");
        account2.setAccountTitle("Khan");
        account2.setBalance(2000);
        account2.setStatus(true);
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        account1.depositAmount(1000);
        account1.displayAccountInfo();
        account1.withdrawAmount(500);
        account1.displayAccountInfo();
        System.out.println();
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        account1.transferAmount(account2, 500);
        account1.displayAccountInfo();
        account2.displayAccountInfo();


    }
}