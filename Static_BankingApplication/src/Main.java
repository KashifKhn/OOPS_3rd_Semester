public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        System.out.println("Average Balance: " + BankAccount.calculateAverageBalance());

        account1.deposit(500);
        account2.withdraw(300);

        System.out.println("Average Balance: " + BankAccount.calculateAverageBalance());
    }
}