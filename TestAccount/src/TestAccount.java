import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account1 = new Account();
//        account1.setAccountNumber(12345);
//        account1.setAccountTitle("Kashif Khan");
//        account1.setAccountBalance(5402.42);
//        System.out.println(account1.getAccountNumber());
//        System.out.println(account1.getAccountTitle());
//        System.out.println(account1.getAccountBalance());

        account1.setAccountInfoFromUser(sc);
        account1.showAccountInfo();
        account1.depositAmount(sc);
        account1.withdrawAmount(sc);
        account1.showAccountInfo();
    }
}