public class CurrentAccount extends Account{
    public CurrentAccount(String accountNumber, double accountBalance) {
        super(accountNumber, accountBalance);
    }

    @Override
    public void displayAccountInformation() {
        System.out.println("----------Current Account-----------");
        super.displayAccountInformation();
        System.out.println();
    }
}

