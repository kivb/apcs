package lab6;

public class Stock {

	public static void main(String[] args) {
		// int rounding test
		System.out.println((93 + (5/2))/5);

		Staque stack = new Staque();
		int[] sharesStack = stack.createStack();
		int[] priceStack = stack.createStack();

		// To simulate buying 100 shares for $200.00 per share:

		stack.push(sharesStack, 14);
		stack.push(sharesStack, 50);
		stack.push(sharesStack, 500);
		stack.push(sharesStack, 120);
		stack.push(priceStack, 20000);
		stack.push(priceStack, 21000);
		stack.push(priceStack, 11000);
		stack.push(priceStack, 12000);

		System.out.println(stack.prettyPrintStack(sharesStack));
		Stock stock = new Stock();
//		System.out.println(stock.sellFILO(sharesStack, priceStack, 93, 22000));
		System.out.println(stock.averageFILO(sharesStack, priceStack));
		stock.printReportFILO(sharesStack, priceStack);

	}

	// printReportFILO() should print out a nice looking summary of stock
	// purchases.

	public void printReportFILO(int[] shares, int[] price) {
		System.out.println("Shares \t Price");
		for (int i = 1; i <= shares[0]; i++) {
			System.out.println(shares[i] + "\t $" + price[i] / 100 + ".00");
		}
	}

	// buyFILO() puts the trade data (numShares and pricePerShare) into our
	// stacks.
	public void buyFILO(Staque st, int[] shares, int[] price, int numShares, int pricePerShare) {
		st.push(shares, numShares);
		st.push(price, pricePerShare);
	}

	/*
	 * sellFILO() sells the appropriate number of shares based on the trade data
	 * (numShares and pricePerShare) and returns how much money was made or lost in
	 * pennies total. Please remember to consider odd lots, meaning you may not
	 * assume you will always buy and sell a matching number of shares. Example, you
	 * can buy 100 shares, then immediately sell 1 share. You should have 99 shares
	 * remaining.
	 */

	public int sellFILO(int[] shares, int[] price, int numShares, int pricePerShare) {
		int profit = 0;
		
		// Add logic to handle attempts to sell more shares than you have.
		int totalShares = 0;
		for (int i = 1; i<= shares[0]; i++) {
			totalShares += shares[i];
		}
		if (numShares > totalShares) { // we don't got enough shares to sell numshares!
			return 0;
		}

		while (numShares >= shares[shares[0]]) {
			numShares -= shares[shares[0]];
			profit += (pricePerShare - price[price[0]]) * shares[shares[0]];
			shares[0]--;
			price[0]--;
		}
		 if (numShares == 0) {
			 return profit;
		 }
		 // numShares is less than shares[0]
		 shares[shares[0]] -= numShares;
		 profit = (pricePerShare - price[price[0]]) * numShares;

		return profit;
	}
	
	/*
	 * averageFILO() returns the average purchase price of all shares purchased. By the end of this 
	 * function, all information should match what was stored before. Round to the nearest penny, do not 
	 * always round down.
	 * 
	 * Float --> Int rounding algorithm: (dividend + (divisor / 2)) / divisor
	 */
	public int averageFILO(int[] shares, int[] price) {
		int totalPrice = 0;
		int totalShares = 0;

		// get total price paid
		for (int i=1; i <= price[0]; i++) {
			totalPrice += price[i] * shares[i];
		}
		
		// get total Shares we have
		for (int i = 1; i<= shares[0]; i++) {
			totalShares += shares[i];
		}
		
		// round pennies up/down and return
		return (totalPrice + (totalShares/2))/totalShares;
	}
	

}
