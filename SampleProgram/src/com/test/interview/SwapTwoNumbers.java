package com.test.interview;

public class SwapTwoNumbers {

	// Q #3) Write a Java Program to swap two numbers without using the third variable.

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a= " + a + " ,b= " + b);

	}

}
