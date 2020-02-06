package apcs.lab.lab14;

import java.util.Scanner;

import apcs.lab.lab10.SuitEnum;

public class Main {
	
	public static void main(String[] args) {
		/*
		BankAccount baAl = new BankAccount();
		BankAccount baBob = new BankAccount();
		BankAccount baCarl = new BankAccount();
		
		baAl.setName("Al");
		baBob.setName("BoB");
		baCarl.setName("Carl");

		baAl.setBalance(50.00);
		baBob.setBalance(25.00);
		baCarl.setBalance(44.00);
		
		System.out.println(baAl.getAccountNumber());
		System.out.println(baBob.getAccountNumber());
		System.out.println(baCarl.getAccountNumber());
		System.out.println(baCarl.getAccountsCreated());
		System.out.println(baCarl.toString());
		*/
		
	//	create500();
		
		String s = "Hi";
		String y = s;
		s = "Hey";
		System.out.println("s = " + s);
		System.out.println("y = " + y);
	}
	public static void create500() {
		BankAccount[] baArr = new BankAccount[11];
		for (int i=0; i<baArr.length; i++) {
			baArr[i] = new BankAccount(i, "Acct"+i);
			System.out.println(baArr[i].toString());
		}
		SuitEnum se = SuitEnum.CLUB;
		System.out.println("Suit we have is: " + se);

	}
    
}
