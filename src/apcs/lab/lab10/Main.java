package apcs.lab.lab10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Returns a nice looking String such as "$1.23"
	public static String moneyToString(Money m) {
		return "$" + m.dollar + "." + m.cent;
	}

	// Returns the sum of 2 Money objects
	public static Money add(Money m1, Money m2) {
		// return m1 after adding m2 to it
		m1.dollar = m1.dollar + m2.dollar;
		m1.cent = m1.cent + m2.cent;
		if (m1.cent > 99) {
			m1.dollar++;
			m1.cent -= 100;
		}
		return m1;
	}

	// return the difference 20 - m
	public static Money payWith20(Money m) {
		// convert money to cents and subtract from 2000 cents.
		int d = (2000 - (m.dollar * 100 + m.cent)) / 100;
		int c = (2000 - (m.dollar * 100 + m.cent)) % 100;
		m.dollar = d;
		m.cent = c;
		return m;
	}

	// return money with interest
	public static Money applyInterest(Money m, double interestRate) {
		// convert money to cents and apply interest and convert to dollars and cents

		double withInterest = (m.dollar + (double) m.cent / 100) * (1 + interestRate);
		m.dollar = (int) withInterest / 100;
		m.cent = (int) withInterest % 100;
		return m;
	}

	public static void  testCodeMoney() {
		
		// Create a 100 element array of Money objects with values $0.01 - $1.00, 
		// and compute the sum.
		Money[] money = new Money[100];
		int d = 0;
		int c = 0;
		
		for (int i = 0; i < money.length; i++) {
			Money m = new Money();
			if (i == 99) {
				m.dollar = 1;
				m.cent = 0;
			} else {				
				m.dollar = 0;
				m.cent = c++;
			}
			// add money to array
			money[i] = m;
		}
		// compute sum of money
		int total = 0;
		d = 1;
		// add up all the cents
		for (Money m : money) {
			total += m.cent;
		}
		// convert cents to whole dollars and add 1
		d += total/100;
		
		// get the remaining cents
		c = total%100;
		System.out.println("Total amount: " + d +"."+c);		
	}
	
	/*
	 * b. Simulate a person depositing $10 per day over the course of a year into a 
	 * bank account that pays 1% interest monthly (round down) at the end of each month. 
	 * How much has the person saved?
	 */
	public static void calcSavings() {
		// array to hold total deposit by month
		int[] deposit = {310, 270, 310, 300, 310, 300, 310, 310, 300, 310, 300, 310};
		
		// Compound interest formula, compounded monthly... this is hairy for amounts 
		// by sliding months... did he provide a formula to use?
	}
	/*
	 * c. Go to safeway.com, pick 5 items to purchase, and compute the change if you 
	 * pay with $20. Remember to apply San Ramon's city sales tax rate which you can 
	 * find on bing.com.
	 */
	// pass in an array of Money objects. We expect 5, but could have more.
	public static void changeFor20(Money[] m) {
		double taxRate = .0825;
		int d=0;
		int c=0;
		for (int i=0; i<m.length; i++) {
			// turn dollars to all cents
			c += m[i].dollar * 100 +m[i].cent;
		}
		if (c > 2000) { // items cost more than $20
			System.out.println("Insufficient funds!");
		} else {
			
		}
		
	}

}
