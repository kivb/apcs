package apcs.lab.lab17;

public class Fraction {

	// Constants (Final Static Variables)

	// Static/Class Variables
	private static int objectCount = 0; // Number of Fractions created
	private static int methodCount = 0; // Number of times methods have been called.

	// Nonstatic/Instance Variables
	private int numerator;
	private int denominator;

	// Constructors

	// Part 4: Create the following 3 constructors, remember to count each object:

	public Fraction() {
		super();
		objectCount++;
	}

	public Fraction(int n, int d) {
		this.numerator = n;
		this.denominator = d;
		objectCount++;
	}

	// This creates the Fraction as a copy of another Fraction.
	public Fraction(Fraction f) { // Ex, Fraction f = new Fraction(new Fraction(1,2))
		this.numerator = f.getNumerator();
		this.denominator = f.getDenominator();
		objectCount++;
	}

	// Getters/Setters

	// Part 3: Create getters for all 4 variables in Part 2. Create setters for
	// numerator and denominator.
	public static int getObjectCount() {
		return objectCount;
	}

	public static int getMethodCount() {
		return methodCount;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	// Create a toString() method:
	// Returns a nice looking fraction like "3/4". Your fractions should look NICE.
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}

	// Static Methods
	public static int integerPart(Fraction f) {
		return f.numerator / f.denominator;
	}

	// Absolute value.
	public static int abs(int a) {
		if (a < 0) {
			return a * -1;
		}
		return a;
	}

	// Return the smaller/bigger of the 2 Fractions. Return copies, not pointers to
	// the original!
	public static Fraction min(Fraction a, Fraction b) {
		if ((double) a.getNumerator() / a.getDenominator() < (double) b.getNumerator() / b.getDenominator()) {
			return new Fraction(a.getNumerator(), a.getDenominator());
		}
		return new Fraction(b.getNumerator(), b.getDenominator());

	}

	public static Fraction max(Fraction a, Fraction b) {
		if ((double) a.getNumerator() / a.getDenominator() > (double) b.getNumerator() / b.getDenominator()) {
			return new Fraction(a.getNumerator(), a.getDenominator());
		}
		// either b > a or b == a. Either case we return b.
		return new Fraction(b.getNumerator(), b.getDenominator());
	}

	// Nonstatic Methods
	// Returns in mixed number format. Ex, 5/3 => "1 2/3".
	// Please consider all cases! Ex, "30 1/2", "4", "1/51"

	public String toMixedNumber() {
		if (this.numerator > this.denominator) {
			return this.numerator / this.denominator + " " + this.numerator % this.denominator + "/" + this.denominator;
		}
		return this.toString();
	}

	public int integerPart() {
		return this.numerator / this.denominator;
	}

	public int remainder() {
		return this.numerator % this.denominator;
	}

	// Returns true if it's divide by 0 error.
	public boolean isError() {
		return this.denominator == 0;
	}

	// Return true if it's positive, false otherwise.
	public boolean isPositive() {
		return this.numerator / this.denominator > 0;
	}

	// Returns true if the fractions have the same value, false otherwise.
	// Ex, f = 2/4, g = 3,6, f.equals(g) => true.
	public boolean equals(Fraction f) {
		return ((double) this.numerator / this.denominator == (double) f.getNumerator() / f.getDenominator());
	}

	// To determine if a fraction is simplified, look at values 2,3,4,...,
	// and see if any of them divide both the numerator and denominator.
	// Ex, 6/15 is not simplified because 3 divides both 6 and 15.
	// If both the numerator and denominator are negative,
	// the Fraction is not simplified.
	public boolean isSimplified() {
		int divisor = 0;

		if (abs(this.numerator) - abs(this.denominator) > 0) {
			divisor = this.denominator;
		} else {
			divisor = this.numerator;
		}
		while (divisor > 1) {
			if (this.numerator % divisor == 0 && this.denominator % divisor == 0) {
				return false; // fraction is not simplified
			}
			divisor--;
		}
		return true; // fraction is simplified

	}

	// The simplify() function should simplify the Fraction you are calling
	// it from.
	public void simplify() {
		if (!this.isSimplified()) {
			// first simplify without changing signs
			int divisor = 0;

			if (abs(this.numerator) - abs(this.denominator) > 0) {
				divisor = this.denominator;
			} else {
				divisor = this.numerator;
			}
			while (divisor > 1) {
				if (this.numerator % divisor == 0 && this.denominator % divisor == 0) {
					this.numerator /= divisor;
					this.denominator /= divisor;
				}
				divisor--;
			}

		}
	}

	// The simplified() function should return a new simplified version of the
	// Fraction, and not change the original Fraction.
	public Fraction simplified() {
		Fraction simplifiedFraction = new Fraction(this.numerator, this.denominator);
		simplifiedFraction.simplify();
		return simplifiedFraction;
	}

	// Returns the sum of this Fraction and a.
	public Fraction sum(Fraction a) {
		Fraction f = new Fraction();
		f.numerator = this.numerator * a.getDenominator() + a.getNumerator() * this.denominator;
		f.denominator = this.denominator * a.getDenominator();
		f.simplify();
		return f;
	}

	// Returns the sum of all Fractions in an array of Fractions. Use sum().
	public static Fraction sum(Fraction[] a) {
		if (a.length == 1) {
			return a[0];
		}
		Fraction arrFraction = a[0].sum(a[1]);
		for (int i = 2; i < a.length; i++) {
			arrFraction = arrFraction.sum(a[i]);
		}
		return arrFraction;

	}

}
