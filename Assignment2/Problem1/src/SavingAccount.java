public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String accountNumber, double accountBalance, double interestRate) {
        super(accountNumber, accountBalance);
        setInterestRate(interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate >= 0) {
            this.interestRate = interestRate;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void displayAccountInformation() {
        System.out.println("----------Saving Account---------------");
        super.displayAccountInformation();
        System.out.println("Interest Rate: " + this.getInterestRate());
    }
}
