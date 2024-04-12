package com.strivers.A2Z.countdigits;

public class ReverseOfNumbers {

	public static void main(String[] args) {
		int number = 12345;

		System.out.println("reversed Number = " + ReverseOfNumbers.ReverseOfDigits(number));
	}

	private static int ReverseOfDigits(int number) {

		int newNumber = 0;

		while (number > 0) {
			newNumber = newNumber * 10 + number % 10;
			number = number / 10;
		}

		return newNumber;
	}

}
