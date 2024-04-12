package com.test.interview;

//Q #18) Write a Java Program to remove all white spaces from a string with using replace().
public class ReplaceWhitespaces {

	public static void main(String[] args) {

		String value = "shweta pratyush prashvita prashu";

		value = value.replace(" ", "");
		System.out.println(value);

		// 2nd

		String[] values = value.split(" ");
		String newValue = "";
		for (String word : values) {
			newValue = newValue + word;
		}
		System.out.println(newValue);

		// 3rd stringbuilder

		StringBuilder sb = new StringBuilder();
		sb.append(value);

		System.out.println(sb);

	}

}
