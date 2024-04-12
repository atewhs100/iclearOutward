package com.test.interview;

public class ReverseString {

	// Q #1) Write a Java Program to reverse a string without using String inbuilt
	// function.
	public static void main(String[] args) {

		String value = "shweta";

		reverseString(value);
	}

	private static void reverseString(String value) {

		String append = "";

		/*
		 * for (int i = 0; i < value.length(); i++) {
		 * 
		 * append = value.charAt(i) + append; }
		 * 
		 * System.out.println(append);
		 */

		StringBuilder sb = new StringBuilder(value);

		System.out.println(sb.reverse());

	}

}
