package se.lexicon;


import se.lexicon.model.BankAccount;
import se.lexicon.model.Customer;

public class App
{
    public static void main( String[] args )
    {
        Customer customer1= new Customer("Mehrdad","Javan", "123456789","mehrdad.javan@lexicon.se");
        BankAccount bankAccount= new BankAccount(1, 0, customer1);

        bankAccount.deposit(500);
        System.out.println("Balance: " + bankAccount.getBalance());
        bankAccount.withdraw(100);
        System.out.println("Balance: " + bankAccount.getBalance());
//        bankAccount.withdraw(-1);

        Customer customer2= new Customer("Simon","Elbrink", "123456789","simon.elbrink@lexicon.se");
        BankAccount bankAccount2= new BankAccount(2, 100, customer2);
        bankAccount2.deposit(1000);
        System.out.println("Balance: " + bankAccount2.getBalance());




    }
}
