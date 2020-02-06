package apcs.lab.lab14;

public class BankAccount {
	private double balance;
	private String name;
	private int accountNumber;
	private static int accountsCreated;
	
	
	public BankAccount(double b, String n) {
		balance = b;
		name = n;
		accountNumber = 10000000 + accountsCreated;
		accountsCreated++;
		// 100th account gets $100 bonus
		bonus();
	}
	
	public BankAccount() {
		accountsCreated++;
		//name = "default";
		accountNumber = 10000000 + accountsCreated;
		// 100th account gets $100 bonus
		bonus();
	}
	
	private void bonus() {
		if (accountsCreated%100 == 0) {
			this.balance += 100;
		}
	}
	public String toString() {
		return name + "'s account "+ accountNumber + " has a balance of $" + balance;
	}
	
	// Part 7: In the BankAccount class, create a deposit method that only allows positive values to be deposited. 
	// Print a message, "Invalid deposit amount." otherwise. 
	
	public void deposit(double dAmt) {
		if (dAmt < 1) {
			System.out.println("Invalid deposit amount.");
		} else {
			this.balance += dAmt;
		}
	}
	
	/*
	 * Create a withdraw method that returns a double representing the amount of money withdrawn. 
	 * If the withdrawl amount is bigger than the balance, do not withdraw any money, return 0, 
	 * and subtract $10 from the balance representing a bank fee.
	 */
	public double withdrawal(double wAmt) {
		if (wAmt > balance) {
			balance -= 10;
			return 0;
		} else {
			balance -= wAmt;
		}
		return balance;
		
	}
	

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
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

	public int getAccountsCreated() {
		return accountsCreated;
	}

}
