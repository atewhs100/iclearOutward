package com.strivers.A2Z.recursion;

public class PrintNumbersReverseOrder {

	public static void main(String[] args) {

		int number = 7;
		int i = number;
		PrintNumbersReverseOrder.printNumber(i, number);
	}

	private static void printNumber(int i, int number) {

		if (i < 1) {
			return;
		}
		System.out.println(i);
		printNumber(i - 1, number);
	}

}
