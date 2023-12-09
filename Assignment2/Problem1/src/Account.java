public class Account {
    private String  accountNumber;
    private double accountBalance;

    public Account(String accountNumber, double accountBalance) {
        setAccountNumber(accountNumber);
        setAccountBalance(accountBalance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if(accountBalance >= 0) {
            this.accountBalance = accountBalance;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void displayAccountInformation() {
        System.out.println("Account Number: " + this.getAccountNumber());
        System.out.println("Account Balance: " + this.getAccountBalance());
    }
}
