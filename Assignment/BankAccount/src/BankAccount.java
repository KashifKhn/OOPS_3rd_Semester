public class BankAccount {
    private String accountNumber;
    private String accountTitle;
    private double balance;
    private boolean status;

    //    non parameterized constructor
    public BankAccount() {
        this.accountNumber = "N/A";
        this.accountTitle = "Unknown";
        this.balance = 0.0;
        this.status = false;
    }

    //    parameterized constructor with 3 parameters
    public BankAccount(String accountNumber, String accountTitle, double balance) {
        this.accountNumber = accountNumber;
        this.accountTitle = accountTitle;
        setBalance(balance);
    }

    //    Copy constructor
    public BankAccount(BankAccount account) {
        this.accountNumber = account.accountNumber;
        this.accountTitle = account.accountTitle;
        this.balance = account.balance;
        this.status = account.status;
    }

    //    getter and setter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
            return;
        }
        System.out.println("Balance can not be negative");
        this.balance = 0;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void InputFromUser() {
        System.out.print("Please Enter account number: ");
        this.accountNumber = Main.sc.nextLine();
        System.out.print("Please Enter account title: ");
        this.accountTitle = Main.sc.nextLine();
        System.out.print("Please Enter balance: ");
        setBalance(Main.sc.nextDouble());
        Main.sc.nextLine();
    }

    public void displayAccountInfo() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Account Information");
        System.out.println("\tAccount Number: " + getAccountNumber());
        System.out.println("\tAccount Title: " + getAccountTitle());
        System.out.println("\tBalance: $" + getBalance());
        System.out.println("\tStatus: " + (getStatus() ? "Active" : "Inactive"));
        System.out.println("--------------------------------------------------------------");
    }

    public void depositAmount(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount deposited successfully");
            return;
        }
        System.out.println("Amount can not be negative");
    }

    public void withdrawAmount(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance -= amount;
                System.out.println("Amount withdrawn successfully");
                return;
            }
            System.out.println("Insufficient balance");
            return;
        }
        System.out.println("Amount can not be negative");
    }

    public void transferAmount(BankAccount account, double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance -= amount;
                account.balance += amount;
                System.out.println("Amount transferred successfully");
                System.out.printf("From %s, %.2f amount is transferred to %s\n", this.accountTitle, amount, account.accountTitle);
                return;
            }
            System.out.println("Insufficient balance");
            return;
        }
        System.out.println("Amount can not be negative");
    }

}
