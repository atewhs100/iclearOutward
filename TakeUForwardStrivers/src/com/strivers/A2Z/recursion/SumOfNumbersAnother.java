package com.strivers.A2Z.recursion;

public class SumOfNumbersAnother {

	public static void main(String[] args) {
		int n = 7;
		System.out.println(SumOfNumbersAnother.function(n));
	}

	private static int function(int n) {
		if (n == 0) {
			return 0;
		}

		return n + function(n - 1);
	}

}
