package com.test.interview;

//12. How can you find the factorial of an integer in Java?
public class Factorial {

	public static void main(String[] args) {

		int number = 5;
		System.out.println(factorial(number));

	}

	private static int factorial(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1); // 6*5
		}
	}

}
