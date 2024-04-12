package com.leetcode;

public class ReverseSigned {

	public static int reverse(int x) {

		String xStr = String.valueOf(x);
		String xl = "";
		for (int i = xStr.length(); i >0 ; i++) {
			xl=xl+xStr.substring(i);
		}
		return ;
		// -2^31 <= x <= 2^(31 - 1)

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
