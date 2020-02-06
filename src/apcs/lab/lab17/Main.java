package apcs.lab.lab17;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Fraction f1 = new Fraction(33,7);
		Fraction f2 = new Fraction(f1);
		Fraction f3 = new Fraction();
		f3.setNumerator(5);
		f3.setDenominator(9);
		
		System.out.println(f1.toMixedNumber());
		System.out.println(f2.toMixedNumber());
		System.out.println(f3.toMixedNumber());
		System.out.println(f1.integerPart());
		System.out.println(Fraction.integerPart(f1));
		System.out.println(f1.remainder());
		
		System.out.println((double) 5/3);
		*/
		Fraction f = new Fraction(26,3);
		Fraction f1 = new Fraction(26,13);
		Fraction f2 = new Fraction(2,5);
		Fraction f3 = new Fraction(3,5);
		Fraction g = new Fraction(4,0);
		Fraction h = new Fraction(3,-7);
		System.out.println("8 2/3:\t" + f.toMixedNumber());
		System.out.println("8:\t" + f.integerPart());
		System.out.println("2:\t" + f.remainder());
		System.out.println("true:\t" + g.isError());
		System.out.println("false:\t" + h.isPositive());
		System.out.println("26/3:\t" + Fraction.max(f,h).toString());
		
		System.out.println("26/3:\t" + f.isSimplified());
		System.out.println("Simplified 26/13:\t" + f1.simplified());
		System.out.println("Sum 3/5:\t" + f2.sum(h));
		
		Fraction[] fArr = {f1,f2,f3,h,f};
		System.out.println("Sum of f1, f2, f3:\t" + Fraction.sum(fArr));
	}

}
