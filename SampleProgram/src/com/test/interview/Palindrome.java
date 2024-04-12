package com.test.interview;

//Q #8) Write a Java Program to find whether a string or number is palindrome or not.

public class Palindrome {

	public static void main(String[] args) {

		String value = "nitin";

		palindromeOrNot(value);
	}

	private static void palindromeOrNot(String value) {

		String append = "";
		for (int i = 0; i < value.length(); i++) {

			append = value.charAt(i) + append;
		}

		if (append.equals(value)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");

		}

	}

}
