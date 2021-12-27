package se.lexicon.model;

public class BankAccount {
  //Fields
  private int accountNumber;
  private double balance;
  public Customer customer;

  //Constructors
  public BankAccount(int accountNumber, double balance, Customer customer) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customer = customer;
  }

  // Methods
  public void deposit(double amount){
    // step1: validate params
    if (amount < 0){
      throw new IllegalArgumentException("Amount was negative");
    }
    /*if (amount > 7000){
      throw new IllegalArgumentException("Deposit denied: above limit: " + 2000);
    }*/
    // step2: perform deposit logic
    this.balance = this.balance + amount;
  }

  public void withdraw(double amount){
    if (amount < 0){
      throw new IllegalArgumentException("Amount was negative");
    }
    if (amount > balance){
      throw new IllegalArgumentException("Amount is grater than the balance");
    }
    this.balance = this.balance - amount;
  }

  // Getters and Setters

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
