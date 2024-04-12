package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Sample {

	public static void main(String[] args) {

		// fibonnacci series -- 0,1,1,2,3,5,8,13,21,33

		int position = 9;

		// System.out.println(findfibonacciSeriesElement(position));

		// string is isogram

		/*
		 * String stringtocheck = "pensdcc";
		 * System.out.println(checkStringIsIsogram(stringtocheck));
		 */

	}

	private static boolean checkStringIsIsogram(String stringtocheck) {

		char[] isogram = stringtocheck.toCharArray();

		boolean check = Boolean.FALSE;
		HashSet<Character> hs = new HashSet<>();
		for (char ch : isogram) {
			if(hs.contains(ch)) {
				check = Boolean.TRUE;
			}else
				hs.add(ch);
		}

		return check;

	}

	private static int findfibonacciSeriesElement(int position) {

		int[] fibbonnacciArray = new int[position];

		fibbonnacciArray[0] = 0;
		fibbonnacciArray[1] = 1;

		for (int i = 2; i < position; i++) {

			fibbonnacciArray[i] = fibbonnacciArray[i - 1] + fibbonnacciArray[i - 2];
		}

		return fibbonnacciArray[position - 1];
	}

}
