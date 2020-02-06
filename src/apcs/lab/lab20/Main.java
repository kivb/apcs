package apcs.lab.lab20;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard acc = new CreditCard();
		acc.charge(120.32);
		acc.chargeInterest();
		Account acc2 = new Account();
		Account acc3 = new Account();
		System.out.println(acc.toString());
		System.out.println("Account number: " + acc.getAccountNumber() +"\n$"+ acc.getBalance());
		System.out.println("Account2 number: " + acc2.getAccountNumber() );
		System.out.println("Account3 number: " + acc3.getAccountNumber() );

	}
	

}
