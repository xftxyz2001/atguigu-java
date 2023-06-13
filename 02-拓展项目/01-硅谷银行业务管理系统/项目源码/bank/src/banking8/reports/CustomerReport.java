package banking8.reports;

import java.text.NumberFormat;
import java.util.Iterator;

import banking8.domain.*;

public class CustomerReport {
	Bank bank = Bank.getBanking();
	Customer customer;

	public void generateReport() {
		NumberFormat currency_format = NumberFormat.getCurrencyInstance();
		// Generate a report
		System.out.println("\t\t\tCUSTOMERS REPORT");
		System.out.println("\t\t\t================");

		// for (int cust_idx = 0; cust_idx < bank.getNumOfCustomers();
		// cust_idx++) {
		Iterator<Customer> customers = bank.getCustomers();
		while (customers.hasNext()) {

			customer = customers.next();

			System.out.println();
			System.out.println("Customer: " + customer.getLastName() + ", "
					+ customer.getFirstName());

			// for (int acct_idx = 0; acct_idx < customer.getNumOfAccounts();
			// acct_idx++) {
			Iterator<Account> accounts = customer.getAccounts();
			while (accounts.hasNext()) {

				Account account = accounts.next();
				String account_type = "";
				if (account instanceof SavingAccount) {
					account_type = "SavingAccount";
				}
				if (account instanceof CheckingAccount) {
					account_type = "CheckingAccount";
				}
				System.out.println(account_type + ": current balance is "
						+ currency_format.format(account.getBalance()));
			}
		}
	}
}
