import java.util.Scanner;

import javax.security.auth.login.AccountLockedException;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bank bank = new Bank();

    while (true) {
      System.out.println("\n====Bank Menu====");
      System.out.println("1. Create Account");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Check Balance");
      System.out.println("5. Transaction History");
      System.out.println("6. Show All Account");
      System.out.println("7. Exit");
      System.out.print("Choose: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          System.out.print("Enter account number: ");
          String accNumber = scanner.nextLine();

          System.out.print("Enter owner name: ");
          String owner = scanner.nextLine();

          bank.createAccount(accNumber, owner);
          break;
        case 2:
          System.out.print("Enter account number: ");
          String depAcc = scanner.nextLine();

          Account depositAccount = bank.findAccount(depAcc);

          if (depositAccount != null) {
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            depositAccount.deposit(amount);
          } else {
            System.out.println("Account not found.");
          }
          break;
        case 3:
          System.out.print("Enter account number: ");
          String withAcc = scanner.nextLine();

          Account withDrawAccount = bank.findAccount(withAcc);

          if (withDrawAccount != null) {
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            withDrawAccount.withdraw(amount);
          }else{
            System.out.println("Account not found.");
          }
          break;
        case 4:
          System.out.print("Enter account number: ");
          String balAcc = scanner.nextLine();

          Account balanceAccount = bank.findAccount(balAcc);

          if (balanceAccount != null) {
            System.out.println("Balance: " + balanceAccount.getBalance());
          }else{
            System.out.println("Account not found.");
          }
          break;
        case 5:
          System.out.print("Enter account number: ");
          String histAcc = scanner.nextLine();

          Account historyAccount = bank.findAccount(histAcc);

          if (historyAccount != null) {
            historyAccount.printTransactionHistory();
          }else{
            System.out.println("Account not found.");
          }
          break;
        case 6:
          bank.displayAllAccounts();
          break;
        case 7:
          System.out.println("Thanks for using our bank.");
          scanner.close();
          return;
        default:
          System.out.println("Invalid choice.");
          break;
      }
    }
  }
}