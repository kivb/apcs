package sip;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(winner2(5,12));
		System.out.println(winner3(5,12,90));

	}
	
	public static int winner2(int a, int b) {
		
		if (a >= b) {
			return a;
		}
		return b;
	}
	
	public static int winner3(int a, int b, int c) {
		
		if (a >= b && a >= c) {
			return a;
		}
		if (b >= a && b >= c) {
			return b;
		}
		return c;
	}
	
	

}
