package com.test.interview;

//Q #9) Write a Java Program for the Fibonacci series.
public class FibonnaciSeries {

	public static void main(String[] args) {

		int value = 0;
		// System.out.print(value + " " + 1);

		/*
		 * int[] fibArr = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; for (int i =
		 * 2; i < 10; i++) {
		 * 
		 * fibArr[i] = fibArr[i - 1] + fibArr[i - 2]; System.out.print(" " + fibArr[i]);
		 * }
		 */

		int a = 0, b = 1, c = 0;

		System.out.print(a);
		for (int i = 2; i < 10; i++) {
			a = b;
			b = c;
			c = a + b;

			System.out.print(" " + c);
		}
	}

}
