package com.strivers.A2Z.recursion;

public class FactorialOfNumber {

	public static void main(String[] args) {

		int number = 5;

		System.out.println(FactorialOfNumber.factorial(number));
	}

	private static int factorial(int number) {

		if (number == 1) {
			return 1;
		}

		return number * factorial(number - 1);
	}

}
