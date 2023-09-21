package Accounts;

public class Account {
    private String accountNo;
    private String accountTitle;
    private double accountBalance;
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public String getAccountTitle() {
        return accountTitle;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
}
