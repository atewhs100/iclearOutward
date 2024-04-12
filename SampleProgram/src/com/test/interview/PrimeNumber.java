package com.test.interview;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 445;

		findPrimeNumberOrNot(num);
	}

	private static void findPrimeNumberOrNot(int num) {

		int temp;
		boolean isPrime = false;

		if (num == 1 || num == 0) {
			System.out.println(" Not a Prime Number");
		}

		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime)
			System.out.println(num + "number is prime");
		else
			System.out.println(num + "number is not a prime");

	}

}
