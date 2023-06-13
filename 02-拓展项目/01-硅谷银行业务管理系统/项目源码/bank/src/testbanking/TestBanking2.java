package testbanking;
/*
 * This class creates the program to test the banking classes.
 * It creates a new Bank, sets the Customer (with an initial balance),
 * and performs a series of transactions with the Account object.
 */

import banking2.Customer;
import banking2.Account;

public class TestBanking2 {

  public static void main(String[] args) {
    Customer customer;
    Account  account;

    // Create an account that can has a 500.00 balance.
    account = new Account(500.00);
    System.out.println("Creating the customer Jane Smith.");
    customer = new Customer("Jane","Smith");
    
    customer.setAccount(account);
    //code
    System.out.println("Creating her account with a 500.00 balance.");
    //code
    
    customer.getAccount().withdraw(150.00);
    System.out.println("Withdraw 150.00");
   
	//code
    customer.getAccount().deposit(22.50);
    System.out.println("Deposit 22.50");
  	//code
    customer.getAccount().withdraw(47.62);
    System.out.println("Withdraw 47.62");
   	//code
    // Print out the final account balance
    System.out.println("Customer [" + customer.getLastName()
		       + ", " + customer.getFirstName()
		       + "] has a balance of " + customer.getAccount().getBalance());
  }
}
