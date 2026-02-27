import java.util.Scanner;

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
          
          break;
      
        default:
          break;
      }
    }
  }
}