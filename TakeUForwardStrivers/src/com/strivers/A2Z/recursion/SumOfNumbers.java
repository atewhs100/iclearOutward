package com.strivers.A2Z.recursion;

public class SumOfNumbers {

	public static void main(String[] args) {

		int number = 7;

		int sum = 0;
		int i = number;
		SumOfNumbers.sumOfFirstNNumbers(i, sum);

	}

	private static void sumOfFirstNNumbers(int i, int sum) {

		if (i < 1) {
			System.out.println(sum);
			return;
		}
		sumOfFirstNNumbers(i - 1, sum + i);

	}

}
