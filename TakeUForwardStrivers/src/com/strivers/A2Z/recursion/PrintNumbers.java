package com.strivers.A2Z.recursion;

public class PrintNumbers {

	// print 1 to N
	public static void main(String[] args) {
		int i = 1;
		PrintNumbers.printNumbers(i, 5);
	}

	private static void printNumbers(int i, int number) {

		if (i > number) {
			return;
		}
		System.out.println(i);
		printNumbers(i + 1, 5);
	}

}