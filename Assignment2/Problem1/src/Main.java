public class Main {
    public static void main(String[] args) {
        Account currentAccount = new CurrentAccount("1234321-212",123.4 );
        Account savingAccount = new SavingAccount("1234321-212",123.4, 0.0725 );

        currentAccount.displayAccountInformation();
        savingAccount.displayAccountInformation();
    }
}