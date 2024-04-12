package com.test.interview;

//18. How do you get the sum of all elements in an integer array in Java?
public class SumofArray {

	public static void main(String[] args) {

		int[] array1 = new int[] { 1, 2, 3, 1, 1 };

		int sum = 0;
		for (int i = 0; i < array1.length; i++) {
			sum = sum + array1[i];
		}
		System.out.println("sum of array element = " + sum);
	}

}
