package Accounts;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc1 = new Account();
        System.out.print("Enter the Deposit Amount for Account: ");
        acc1.setAccountBalance(sc.nextDouble());
        System.out.println(acc1.getAccountBalance());
    }
}
