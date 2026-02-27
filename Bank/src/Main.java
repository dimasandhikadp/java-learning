public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.createAccount("001", "Dimas");
        bank.createAccount("002", "Budi");

        bank.displayAllAccounts();

        Account acc = bank.findAccount("001");
        if (acc != null) {
            acc.deposit(500);
            acc.withdraw(200);
            acc.printTransactionHistory();
        }

        bank.displayAllAccounts();
    }
}