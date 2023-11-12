public class BankAccount {
    private double balance;
    private static double totalBalance = 0;
    private static int totalAccounts = 0;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
        totalBalance += initialBalance;
        totalAccounts++;
    }
    public void deposit(double amount) {
        balance += amount;
        totalBalance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            totalBalance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public static double calculateAverageBalance() {
        if (totalAccounts == 0) {
            return 0;
        }
        return totalBalance / totalAccounts;
    }

    public double getBalance() {
        return balance;
    }

    public static double getTotalBalance() {
        return totalBalance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
