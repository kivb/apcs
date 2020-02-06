package apcs.lab.lab16;

// Part 1: Create a MathClass class.
public class MathClass {
	// Static/Class Variables
	// Create a private static int called count initialized to 0
	private static int count = 0;
	

	// Constants (Final Static Variables)
	// Part 2: Create finals variables for E and PI.
	public static final double E = 2.72;
	public static final double PI = 3.14;

	// Nonstatic/Instance Variables

	// Constructors
	public MathClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters/Setters

	public static int getCount() {
		return count;
	}

	// Static Methods
	/*
	 * Part 5: Create the following 2 functions. The functions have the same name,
	 * but different argument types. This is called function overloading.
	 */
	public static double abs(double value) {
		count++;
		return Math.abs(value);
	}

	public static String abs(int value) {
		count++;
		return "|"+value+"|";
	}

	// Nonstatic Methods
	
	/*
	 * Part 6: In order to investigate static/nonstatic, create nonstatic versions of these 2 functions.
	 * 
	 */
	public double absNS(double value) {
		count++;
		return Math.abs(value);
	}
	
	public String absNS(int value) {
		count++;
		return "|"+value+"|";
	}
	
//	Part 8: Create a nonstatic sqrt function for ints. 
	
	public int sqrtNS(int value) {
		count++;
		
		int rv = 0;
		// cast int argument to a double, pass it to abs; get back double, 
		// pass it to Math.sqrt; cast result to int, return int.
		
		//return (int) Math.sqrt(abs((double) value)); 
		while (rv * rv <= (int) abs((double) value)) {
			rv++;
		}
		return --rv;
		
	}




}
