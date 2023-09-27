import java.util.Scanner;

public class Account {
    private long accountNumber;
    private String accountTitle;
    private double accountBalance;

    //    getter and setter
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public String getAccountTitle() {
        return this.accountTitle;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    //    all info of account
    public void showAccountInfo() {
        System.out.println(this.accountNumber);
        System.out.println(this.accountTitle);
        System.out.println(this.accountBalance);
    }

    // Set info form user
    public void setAccountInfoFromUser(Scanner sc) {
        System.out.print("Please Enter the Account Number: ");
        this.accountNumber = sc.nextLong();
        sc.nextLine();
        System.out.print("Please Enter the Account Title: ");
        this.accountTitle = sc.nextLine();
        System.out.print("Please Enter the Account Balance: ");
        this.accountBalance = sc.nextDouble();
    }

    //    deposit amount
    public void depositAmount(Scanner sc) {
        System.out.print("Please Enter the Amount to deposit: ");
        double amount = sc.nextDouble();
        if (amount < 0) {
            System.out.println("Can't deposit negative amount");
            return;
        }
        this.accountBalance += amount;
        System.out.println("Amount Deposit Successfully");
    }

    // withdraw amount
    public void withdrawAmount(Scanner sc) {
        System.out.print("Please Enter the Amount to Withdraw: ");
        double amount = sc.nextDouble();
        if (this.accountBalance < amount) {
            System.out.println("Insufficient Balance");
            return;
        }
        this.accountBalance -= amount;
        System.out.println("Amount withdraw Successfully");
    }
}
