import java.util.List;
import java.util.ArrayList;

public class Bank {
  private List<Account> accounts;

  public Bank(){
    accounts = new ArrayList<>();
  }

  public void createAccount(String accountNumber, String ownerName){
    if (findAccount(accountNumber) != null) {
      System.out.println("Account already exsists!");
      return;
    }
    Account newAccount = new Account(accountNumber, ownerName);
  }

  public Account findAccount(String accountNumber){
    for (Account acc : accounts) {
      if (acc.getAccountNumber().equals(accountNumber)) {
        return acc;
      }
    }
    return null;
  }
}
