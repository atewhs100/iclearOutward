package com.strivers.A2Z.countdigits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 17;
		PrimeNumber.primeOrNot(number);
	}

	private static void primeOrNot(int number) {

		List<Integer> listOfDivisors = new ArrayList<>();

		// divisor <= Math.sqrt(number)

		// for (int i = 1; divisor <= Math.sqrt(number); i++) {

		for (int i = 1; i * i <= number; i++) {
			if ((number % i) == 0) {

				if (i == number / i) {
					listOfDivisors.add(i);
					break;
				}
				listOfDivisors.add(i);
				listOfDivisors.add(number / i);
			}

		}

		if (listOfDivisors.size() == 2) {
			System.out.println(number + " is prime no.");
		} else {
			System.out.println(number + " is not a prime no.");
		}

	}

}