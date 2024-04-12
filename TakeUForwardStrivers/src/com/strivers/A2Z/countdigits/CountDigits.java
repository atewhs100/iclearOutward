package com.strivers.A2Z.countdigits;

public class CountDigits {

	public static void main(String[] args) {

		int number = 12345;

		System.out.println("Digits in Number = " + CountDigits.findCountDigits(number));
	}

	private static int findCountDigits(int number) {

		int count = 0;

		while (number > 0) {
			count++;
			number = number / 10;
		}

		return count;
	}

}
