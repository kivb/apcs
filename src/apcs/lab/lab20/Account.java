package apcs.lab.lab20;

import java.util.Arrays;

public class Account {
	private String name;
	private int accountNumber = 0;
	private static int currAccNum = 10000000;
	private double balance = 0;
	private String transactions[] = null;
	
	public Account() {
		// TODO Auto-generated constructor stub
		this.accountNumber = Account.currAccNum++;
		
	}
	
	public String toString() {
		return "Name: "+ this.name+", Acct: "+ this.accountNumber+", Balance: $"+this.balance;
	}
	
	public void deposit(double amt) {
		this.balance += amt;
	}
	
	public double withdraw(double amt) {
		/*
		 * if (amt > this.balance) {
		 * System.out.println("Withdrawal amount $"+amt+" exceeds available balance $"
		 * +this.balance); return 0; }
		 */
		this.balance -= amt;
		if (transactions.length == 0) {
			// no transactions exist
			transactions = new String[1];
			transactions[1] = "withdraw " + amt;			
		} else { // we have prior transactions
			transactions = Arrays.copyOf(transactions, transactions.length+1);
			
			
		}
		return this.balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

}
