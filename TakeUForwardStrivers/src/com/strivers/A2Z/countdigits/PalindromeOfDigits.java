package com.strivers.A2Z.countdigits;

public class PalindromeOfDigits {

	public static void main(String[] args) {

		int number = 131;
		System.out.println(PalindromeOfDigits.findPalindrome(number));
	}

	private static boolean findPalindrome(int number) {

		int newNumber = 0;
		int originalNumber = number;

		while (number > 0) {
			newNumber = newNumber * 10 + number % 10;
			number = number / 10;
		}

		if (newNumber == originalNumber)
			return Boolean.TRUE;

		return Boolean.FALSE;
	}

}
