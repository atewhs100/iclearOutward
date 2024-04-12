package com.strivers.A2Z.countdigits;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int number = 35;
		System.out.println(ArmstrongNumber.findArmstrongNumber(number));
	}

	private static boolean findArmstrongNumber(int number) {

		int sum = 0;
		int duplicateNumber = number;

		while (number > 0) {

			int digit = number % 10;
			sum = sum + digit * digit * digit;
			number = number / 10;

		}
		System.out.println(sum);

		if (sum == duplicateNumber)
			return Boolean.TRUE;

		return Boolean.FALSE;
	}
}
