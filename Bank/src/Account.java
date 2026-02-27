import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Account {
  private String accountNumber;
  private String ownerName;
  private double balance;
  private List<Transaction> transactions;
  
  public Account(String accountNumber, String ownerName){
    this.accountNumber = accountNumber;
    this.ownerName = ownerName;
    this.balance = 0;
    this.transactions = new ArrayList<>();
  }

  public static class Transaction {
    private String type;
    private double amount;
    private LocalDateTime timeStamp;

    public Transaction(String type, double amount){
      this.type = type;
      this.amount = amount;
      this.timeStamp = LocalDateTime.now();
    }

    @Override
    public String toString(){
      return type + " | " + amount + " | " + timeStamp ;
    }
  }

  

  public String getAccountNumber(){
    return accountNumber;
  }
  
  public String getOwnerName(){
    return ownerName;
  }

  public double getBalance(){
    return balance;
  }

  public void deposit(double amount){
    if(amount <= 0){
      System.out.println("Amount must be greater than 0");
      return;
    }
    balance += amount;

    transactions.add(new Transaction("DEPOSIT", amount));

    System.out.println("Deposit Successful");
  }

  public void withdraw(double amount){
    if (amount <= 0) {
      System.out.println("Amount must be greater than 0");
      return;
    }
    if (amount > balance) {
      System.out.println("Insufficient balance");
      return;
    }
    balance -= amount;
    transactions.add(new Transaction("WITHDRAW", amount));
    System.out.println("Withdraw Successful");
  }

  public void printTransactionHistory() {
    if (transactions.isEmpty()) {
      System.out.println("No transactions yet.");
      return;
    }

    for (Transaction t : transactions) {
      System.out.println(t);
    }

  }
}
