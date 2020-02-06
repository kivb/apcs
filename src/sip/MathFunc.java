package sip;

import java.util.Arrays;

public class MathFunc {

	// Returns the smaller of a and b
	public int min(int a, int b) {
		if (a >= b) {
			return a;
		}
		return b;
	}

	// Returns the smallest element.

	public int min(int[] a) {
		int rv = a[0];

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i + 1]) {
				rv = a[i];
			}
		}
		return rv;
	}

	/*
	 * Add elements by index. Ex, {1,2,3} + {4,5,6} => {5,7,9}. If the arrays are
	 * different sizes, add corresponding elements and do nothing with the others.
	 * {1,2}+{1,2,3} => {2,4,3}
	 */

	int[] add(int[] a, int[] b) {
		return null;
	}

	// Returns the mode. Returns any value if more than one.
	public int mode(int[] a) {
		int modeIdx = 0; // index that is current mode
		int modeOcc = 1; // number of times the modeIdx value occurs
		// For each value of j, we run through the entire array past j
		for (int j = 0; j < a.length - 1; j++) {
			int occ = 1; // number of current value occurrences to compare to modeOcc
			for (int i = j + 1; i < a.length; i++) {
				if (a[j] == a[i]) {
					occ++;
				}
			}
			if (occ > modeOcc) {
				modeOcc = occ;
				modeIdx = j;
			}
		}
		return a[modeIdx];
	}

	// Returns a nice looking string such as "{1,2,3}"
	public String prettyPrint(int[] a) {
		if (a == null) {
			return null;
		}
		String op = "{", cp = "}";
		for (int i = 0; i < a.length - 1; i++) {
			op += a[i] + ", ";
		}
		return op += a[a.length - 1] + cp;
	}

	// Returns a separate array with the same elements.
	public int[] copy(int[] a) {
		int[] rv = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			rv[i] = a[i];
		}
		return rv;
	}

	/*
	 * int[] resize(int[] a, int newLength); // Returns a new array with extra
	 * spaces added (filled with 0's) or truncated (cut off). Ex, resize(
	 * {1,2,3,4,5} , 8) => {1,2,3,4,5,0,0,0}. Ex, resize( {1,2,3,4,5} , 3) =>
	 * {1,2,3}.
	 */

	public int[] resize(int[] a, int newLength) {
		int[] rv;
		if (a.length > newLength) {
			// truncate to newLength
			rv = new int[newLength];
			for (int i = 0; i < newLength; i++) {
				rv[i] = a[i];
			}
			return rv;
		} else if (a.length < newLength) { // pad to newLength
			// pad the array with zeros
			rv = new int[newLength];
			for (int i = 0; i < newLength; i++) {
				if (i < a.length) {
					rv[i] = a[i];
				} else {
					rv[i] = 0;
				}
			}
			return rv;
		}
		// a.length is same as arrayLength
		return a;
	}

	/*
	 * int[] append(int[] a, int[] b); // Returns a single array with a appended to
	 * b. Remember to consider null!
	 * 
	 */
	public int[] append(int[] a, int[] b) {
		if (a == null && b == null) {
			return null;
		} else if (a == null) {
			return b;
		} else if (b == null) {
			return a;
		}
		// both are not null
		int[] rv = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			rv[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			rv[a.length + i] = b[i];
		}
		return rv;

	}

	/*
	 * int[] remove(int[] a, int index); //Removes a single element from the array
	 */
	public int[] remove(int[] a, int index) {
		int[] rv = new int[a.length];

		if (a == null || index >= a.length) {
			return a;
		}
		for (int i = 0; i < a.length; i++) {
			if (i == index) {
				i++;
			}
			rv[i] = a[i];
		}
		return rv;

	}

	/*
	 * int[] subArray(int[]a, int firstIncluded, int firstExcluded); // Returns a
	 * new array. Like substring, returns the subarray that starts at firstIncluded,
	 * and ends at firstExcluded-1. If the subarray contains no elements, or if the
	 * indexes are out of bounds, return null. Ex, subArray({0,1,2,3,4,5},2,4) =>
	 * {2,3}. subArray({1,2,3},1,1) => null. subArray({1,2,3},1,4) => null.
	 */
	public int[] subArray(int[] a, int firstIncluded, int firstExcluded) {

		int[] rv = new int[firstExcluded - firstIncluded];

		if (firstExcluded >= a.length || firstIncluded == firstExcluded) {
			return null;
		}
		for (int i = 0; i < rv.length; i++) {
			rv[i] = a[i + firstIncluded];
		}
		return rv;
	}

	/*
	 * void makeSorted(int[] a); // Sort ascending using Bubble Sort.
	 * 
	 */

	public void makeSorted(int[] a) {
		int s = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					// move the value of a[i] to the right (i.e. to a[j])
					s = a[j + 1]; // store the value of a[j] before overwriting it.
					a[j + 1] = a[j]; // substitute a[j] with a[i]
					a[j] = s; // set a[i] to the old value of a[j]
				}
			}
		}

		// return a;

	}

	/*
	 * int[] merge(int[] a, int[] b); // ASSUME a AND b ARE SORTED ASCENDING!
	 * Combine a and b 1 element at a time from either a or b. At each step, take
	 * the smaller element from a and b, then remove it from consideration. Repeat
	 * until all elements from a and b are merged. The result should be a new array
	 * that is still sorted.
	 * 
	 */
	public int[] merge(int[] a, int[] b) {

		int aLen = a.length;
		int bLen = b.length;
		int sLen = 0;
		int[] rv = new int[aLen = bLen];
		boolean isMerged = false;
		int aInd = 0, bInd = 0, rvInd = 0;

		if (aLen <= bLen) {
			sLen = aLen;
		} else {
			sLen = bLen;
		}

		while (!isMerged) {
			if (a[aInd] <= b[bInd]) {
				rv[rvInd] = a[aInd];
				rvInd++;
				if (aInd < sLen - 1) {
					aInd++;
				} else { // no more to increment
					isMerged = true;
				}
			} else { // b[bInd] < a[aInd]
				rv[rvInd] = b[bInd];
				rvInd++;
				// bInd++;
				if (bInd < sLen - 1) {
					bInd++;
				} else { // no more to increment
					isMerged = true;
				}
			}
		}

		return rv;
	}
	
	public int[] removeIndx(int[] arr, int indx) {
		int[] rArr = new int[arr.length - 1];
		int j = 0;
		for (int i=0; i<arr.length; i++) {
			if (i == indx) {
				continue;
			}
			rArr[j] = arr[i];
			j++;
			
		}
		return rArr;
	}

	public static void main(String args[]) {
		MathFunc mf = new MathFunc();
		int[] arr1 = { 0, 6, 7, 3, 2, 1, 9, 3, 6, 2, 6, 7, 7, 7, 7 };
		int[] arr2 = { 12, 21, 32, 22, 34, 54, 33, 44, 55 };
		int[] a = { 1, 5, 3, 7, 2, 65, 8 };
		int[] a1 = { 1, 5, 7, 8 };
		int[] a2 = { 2, 6, 10, 11, 12, 14 };
//		System.out.println("subArray(a,3,5)\t{7,2}\t" + mf.prettyPrint(mf.subArray(a, 3, 5)));
//		System.out.println(mf.min(arr1));
//		System.out.println(mf.mode(arr1));
//		System.out.println(mf.prettyPrint(arr1));
//		System.out.println(mf.prettyPrint(mf.copy(arr1)));
//		System.out.println(mf.prettyPrint(mf.resize(arr1, 15)));
//		System.out.println(mf.prettyPrint(mf.append(arr1, arr2)));
//		System.out.println(mf.prettyPrint(mf.subArray(arr2, 3, 7)));
//		System.out.println(mf.prettyPrint(mf.merge(a1, a2)));
		System.out.println(mf.prettyPrint(mf.removeIndx(a1, 0)));
	}
}
