package apcs.lab.lab20;

public class CreditCard extends Account {
	private double intRate = 0.08;
	private String description;
	
	public CreditCard() {
		// TODO Auto-generated constructor stub
	}
	
	// chargeInterest() that charges 1 month of interest to the account (- interestRate / 12)
	public void chargeInterest() {
		this.withdraw(getBalance() * (1 + this.intRate/12));
		
	}
	
	/* charge() and pay() methods. balance should usually be negative, and charge makes it more negative, 
	 * pay makes it more positive. The balance can go above 0.
	 */
	
	public void charge(double amt) {
		this.withdraw(this.getBalance() + amt);
		System.out.println(this.getBalance());
	}
	
	public void pay(double amt) {
		this.deposit(this.getBalance() + amt);
		System.out.println(this.getBalance());
	}

}
