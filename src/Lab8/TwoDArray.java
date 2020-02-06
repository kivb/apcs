package Lab8;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 3, 5, 6, 21 };
		int[][] arr2 = { {},{ 1, 2, 3 }, { 7, 5, 3, 5, 6 }, { 3, 2, 4, 5, 6, 2, 1, 10 } };
		int[][] arr3 = {{3,4,5,6},{4,3,2,1},{5,6,7,8},{6,5,4,3}};
		int[][] tt = {{-1,-1,-1},{1,1,0},{1,1,0}};
		TwoDArray twoD = new TwoDArray();
		/*
		 * twoD.ticTacToe(tt); System.out.println(twoD.sumTotal(arr2));
		 * System.out.println(twoD.majorSum(arr3));
		 * System.out.println(twoD.minorSum(arr3)); System.out.println(twoD.min2(arr2));
		 * System.out.println(twoD.arrayToString(twoD.pascalsTriangle(5)));
		 */
		twoD.expandArr(arr3);
		int[][] foo = {null};

	}

	/*
	 * 1. Create a function called arrayToString() that takes an integer array and
	 * returns a string, formatted with commas and curly braces. EX: {1, 2, 3}
	 */
	public String arrayToString(int[] arr) {
		String rv = "{";
		if (arr == null) {
			return "Nothing";
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				rv += arr[i];
			} else {
				rv += "," + arr[i];
			}
			if (i == arr.length - 1) {
				rv += "}";
			}
		}
		return rv;
	}

	/*
	 * 2. Create a function called arrayToString() that takes a 2D integer array and
	 * returns a string, formatted as below. {{1, 2, 3}, {3, 4, 5, 6}, // Notice the
	 * space at the front {7, 8, 9, 9, 9}}
	 */
	public String arrayToString(int[][] arr) {
		// Open brace
		String rv = "{";
		if (arr == null) {
			return "Nothing";
		}
		// send each index to 1D array.
		for (int i = 0; i < arr.length; i++) {
			rv += this.arrayToString(arr[i]);
			if (i == arr.length - 1) {
				// close brace
				rv += "}";
			} else { // add traiing comma and newline
				rv += ",\n ";
			}
		}
		return rv;
	}

	/*
	 * 3. Create a function that takes a 3x3 2d int array and checks for TicTacToe
	 * (3 in a row). Assume blank = 0, x = 1, and o = -1.
	 */

	public void ticTacToe(int[][] ttArr) {
		int[] wArr = new int[3];
		// Fact: In an int array, default value of an index is 0.
		// if first value is zero, no win possible; go to next

		// is first value, x or o? if x look for x es in subsequent else look for o

		// Check horizontal and vertical.
		for (int k = 0; k < 3; k++) {
			if (ttArr[k][0] == 0 || ttArr[k][1] == 0 || ttArr[k][2] == 0 ||
					ttArr[0][k] == 0 || ttArr[1][k] == 0 || ttArr[2][k] == 0	) { // win is not possible
				continue;
			}
			if ((ttArr[k][0] == 1 && ttArr[k][1] == 1 && ttArr[k][2] == 1) ||
					(ttArr[0][k] == 1 && ttArr[1][k] == 1 && ttArr[2][k] == 1)) {
				System.out.println("x won! Horizontal/Vertical");
				return;
			}
			if ((ttArr[k][0] == -1 && ttArr[k][1] == -1 && ttArr[k][2] == -1) ||
					(ttArr[0][k] == -1 && ttArr[1][k] == -1 && ttArr[2][k] == -1)) {
				System.out.println("o won! (Horizontal/Vertical)");
				return;
			}
		}
		// Check for diagonals. E.g. [0][0], [1][1], [2][2] are same
		if ((ttArr[0][0] == 1 && ttArr[1][1] == 1 && ttArr[2][2] == 1) ||
				(ttArr[0][2] == 1 && ttArr[1][1] == 1 && ttArr[2][0] == 1)) {
			System.out.println("x won! (Diagonal)");
			return;
		} else if ((ttArr[0][0] == -1 && ttArr[1][1] == -1 && ttArr[2][2] == -1) ||
				(ttArr[0][2] == -1 && ttArr[1][1] == -1 && ttArr[2][0] == -1)){
			System.out.println("0 won! (Diagonal)");
		}
		System.out.println("It's a tie! Go again!");

	}
	
	/*
	 * 4. Create a function that calculates the total sum of all elements in a 2d
	 * array. Do not assume it is a rectangular 2d array.
	 */
	
	public int sumTotal(int[][] arr1) {
		int rv = 0;
		for (int i=0; i<arr1.length; i++) {
			for (int k=0; k<arr1[i].length; k++) {
				rv += arr1[i][k];
			}
		}
		return rv;
	}
	
	/*
	 * 5. Create a function that calculates the sum of the major diagonal of a 2d
	 * array. May assume square 2d array.
	 */	
	public int majorSum(int[][] arr1) {
		// in a square 2d arr, major diagonal always has same row col index; E.g. [0][0],[1][1],[2][2] etc.
		int rv = 0;
		for (int i=0; i<arr1.length; i++) {
			rv += arr1[i][i];
		}	
		return rv;
	}
	
	/*
	 * 6. Create a function that calculates the sum of the minor diagonal of a 2d
	 * array. May assume square 2d array.
	 */
	public int minorSum(int[][] arr1) {
		// in a square 2d arr, minor diagonal col index is rowIndex-1-i 
		int rv = 0;
		for (int i=0; i<arr1.length; i++) {
			rv += arr1[i][arr1.length-1-i];
		}
		return rv;
	}
	
//	7. Create a function that calculates the min of a 1d array. 
	public int min(int[] a) {
		int rv = a[0];
		for (int val : a) {
			if (val < rv) {
				rv = val;
			}
		}
		return rv;
	}
	
//	8. Using 7, create a function that calculates the min of a 2d array. 
	public int min(int[][] a) {
		int rv = Integer.MAX_VALUE;
		int cv = 0;
		for (int[] k : a) {
			cv = min(k);
			if (cv < rv) {
				rv = cv;
			}
		}
		return rv;
	}
//	9. Not using 7, create a function that calculates the min of a 2d array.
	public int min2(int[][] a) {
		// Run a nested for loop. In the inner loop works the inner array values and sets
		// min value in an outer variable. Each iteration of the outer loop returns the next
		// inner array to work on and determine min value. Compare this to the outer variable.
		int rv = Integer.MAX_VALUE;
		for (int[] o : a ) {
			for (int i : o) {
				if (i < rv) {
					rv = i;
				}
			}
		}
		return rv;
	}
	
	/*
	 * 10. Create a function that rotates a square 2d array 90 degrees clockwise.
	 * Modify the original, don't create any new arrays.
	 */
	/*
	 * public void rotate90(int[][] a) { int storage; // determine the number of
	 * square cycles, N/2 for (int i=0; i< a.length/2; i++) { // for each square
	 * cycle, move the corner values clockwise for (int j=0; j<a.length-1; j++) {
	 * storage = a[i][j]; a[i][j] = a } } // for each square cycle }
	 */
	
	/*
	 * 13. Create a function that returns Pascal's Triangle with n rows, where n is
	 * an int argument.
	 */
	public int[][] pascalsTriangle(int n) {
		// the max number of values in the row is the greatest row+1
		int[][] pt = new int[n][n];
		
		pt[0][0]=1;
		pt[1][0]=1;
		pt[1][1]=1;
		// row index is one less than n. Start with index=2 (0 and 1 handled above)
		for (int r=2; r<n; r++) {
			// max col index is one greater than the max row index
			for (int i=0; i<r+1; i++) {
				if(i==0 || i == r) {
					pt[r][i] = 1;
				} else {
					pt[r][i] = pt[r-1][i-1] + pt[r-1][i];
				}	
			}
		}		
		
		return pt;
	}
	
	/*
	 * 11. Create a function that expands a 2d array. Each element of the 2d array
	 * expands into 4.
	 * 
	 */	
	public void expandArr(int[][] a) {
		// determine the length of the outer array
		int ol = a.length;
		int il = 0;
		// get the largest inner array
		for (int i = 0; i<ol; i++) {
			if (a[i].length > il) {
				il = a[i].length;
			}
		}
		// create new array to hold the expansion
		int[][] rvArr = new int[ol*2][il*2];
		
		// expand
		int l = 0;
		for (int i=0; i<ol; i++) {
			int k = 0;
			// double up the inner and outer values
			for (int j=0; j<a[i].length; j++) {
				rvArr[l][k] = a[i][j];
				rvArr[l][k+1] = a[i][j];
				rvArr[l+1][k] = a[i][j];
				rvArr[l+1][k+1] = a[i][j];
				k+=2;
			}
			l+=2;
		}
		// print new array
		System.out.println(this.arrayToString(rvArr));
	
	}
}
