package apcs.lab.lab16;

public class MathClassTester {

	public static void main(String[] args) {
		/*
//		Part 4: Test your code! Create a Main class. Run this code and make sure it makes sense:
		System.out.println("Math.E = " + Math.E);
		System.out.println("MathClass.E = " + MathClass.E);
		System.out.println("Math.PI = " + Math.PI);
		System.out.println("MathClass.PI = " + MathClass.PI);
		MathClass m = new MathClass();
		// You can access static variables through objects and class.
		// But you cannot access nonstatic variables through the class.
		System.out.println("m.E = " + m.E);
		System.out.println("m.PI = " + m.PI);
//	Part 7: Test your code! Run this code in Main and make sure it makes sense:
		
		System.out.println("\n\nPart 7:");
	
		System.out.println("Math.abs(4.0) = " + Math.abs(4.0));
		System.out.println("MathClass.abs(4.0) = " + MathClass.abs(4.0));
		System.out.println("Math.abs(4) = " + Math.abs(4));
		System.out.println("MathClass.abs(4) = " + MathClass.abs(4));

		MathClass m2 = new MathClass();
		System.out.println("m2.absNS(4.0) = " + m2.absNS(4.0));
		System.out.println("m2.abs(4.0) = " + m2.abs(4.0));
		System.out.println("m2.absNS(4) = " + m2.absNS(4));
		System.out.println("m2.abs(4) = " + m2.abs(4));
		
		System.out.println("m2.sqrtNS(5) = " + m2.sqrtNS(5));
		System.out.println("m2.sqrtNS(9) = " + m2.sqrtNS(9));
		System.out.println("m2.sqrtNS(8) = " + m2.sqrtNS(8));
		System.out.println("m2.sqrtNS(-8) = " + m2.sqrtNS(-8));
*/
		System.out.println("\n\nPart 12:");

		MathClass m3 = new MathClass();
		for(int i=0; i<10; i++)
		    System.out.println("m3.sqrtNS(" + i + ") = " + m3.sqrtNS(i));
		// Guess what this will print out before running:
		System.out.println("MathClass.getCount() = " + MathClass.getCount());
		System.out.println("m3.getCount() = " + m3.getCount());
		
		// This is legal
		System.out.println("MathClass.abs(4) = " + MathClass.abs(4));
		
		// This is illegal
//		System.out.println("MathClass.absNS(4) = " + MathClass.absNS(4));

	}

}
