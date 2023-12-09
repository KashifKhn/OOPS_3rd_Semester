public class Main {
    public static void main(String[] args) {

        Account savingAccount = new SavingAccount("112(123)1233", 123.45, 10);
        Account currentAccount = new CurrentAccount("222(123)1233", 123.45);
        savingAccount.displayAccountInformation();
        System.out.printf("\n\n");
        currentAccount.displayAccountInformation();

    }
}