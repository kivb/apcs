package sip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int[] arr1 = { 0, 6, 7, 3, 2, 1, 9, 3, 6, 2, 5 };
		int[] arr2 = { 5, 6, 3, 1 };
//		Test csTest = new Test();
//		csTest.cardShuffle();
//		System.out.println(Arrays.toString(csTest.bubbleSort(arr1)));
//		sort(arr2);

		// Create a file object
		File fo = new File("/Users/Vik/test.txt");
		int f;
		try {
			FileInputStream is = new FileInputStream(fo);
			try {
				while ((f = is.read()) != -1) {
					System.out.print((char) f);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cardShuffle() {
		int c1 = 1, c2 = 2, c3 = 3, storage = 0;
		// swap c1 and c2
		storage = c1;
		c1 = c2;
		c2 = storage;

		// swap c2 and c3
		storage = c2;
		c2 = c3;
		c3 = storage;

		System.out.println(c1 + " " + c2 + " " + c3);

	}

	public int[] bobbleSort(int[] a) {
		int s = 0;
		if (a == null || a.length == 1) {
			return a;
		}
		for (int j = 1; j < a.length; j++) {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					s = a[i + 1];
					a[i + 1] = a[i];
					a[i] = s;
				}
			}
		}
		return a;
	}

	public int[] bubbleSort(int[] a) {
		int s = 0;

		/*
		 * For each value in the array, compare with next value. If first value is
		 * greater than the second, swap the two. Then compare the next one with the one
		 * after it; and so on, till you reach the end of the array. The largest value
		 * will be at the end.
		 * 
		 * You need to run through the array repeatedly, a total of arrayLength - 1
		 * times. To do this, use an outer loop. Like so:
		 */

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

		return a;

	}

	public static void sort(int[] input) {

		int inputLength = input.length;
		int temp;
		boolean is_sorted;

		for (int i = 0; i < inputLength; i++) {

			is_sorted = true;

			for (int j = 1; j < (inputLength - i); j++) {

				if (input[j - 1] > input[j]) {
					temp = input[j - 1];
					input[j - 1] = input[j];
					input[j] = temp;
					is_sorted = false;
				}

			}

			// is sorted? then break it, avoid useless loop.
			if (is_sorted)
				break;

			System.out.println("\n");

		}

	}

}
