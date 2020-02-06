package apcs.lab.lab20;

public class SavingsAccount extends Account {
	private double intRate = 0;
	
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	
	// applyInterest() that applies 1 month of interest to the account
	public void applyInterest() {
		this.deposit(getBalance() * (1 + this.intRate/12));
		
	}
	
	public String toString() {
		return "Name: "+ this.getName()+", Savings Acct: "+ this.getAccountNumber()+", Balance: $"+ this.getBalance()+ ", Interest: " + this.intRate*100 +"%";

	}

}
