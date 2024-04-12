package com.test.interview;

import java.util.Arrays;

//10. How do you sort an array in Java?
public class SortArray {

	public static void main(String[] args) {

		int[] numbers = new int[] { -2, -4, -1, 0, 4, 78, 2, 34 };

		Arrays.sort(numbers);

		/*
		 * for (int i : numbers) {
		 * 
		 * System.out.println(i); }
		 */

		System.out.println(Arrays.toString(numbers));
	}

}
