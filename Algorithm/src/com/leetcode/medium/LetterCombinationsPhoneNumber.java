package com.leetcode.medium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumber {

	public static void printPermutn(String str, String ans) {

		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the ith character
			String ros = str.substring(0, i) + str.substring(i + 1);

			// Recursive call
			printPermutn(ros, ans + ch);
		}
	}

	public static List<String> letterCombinations(String digits) {

		Map<Integer, String> mp = new HashMap<>();
		mp.put(2, "abc");
		mp.put(3, "def");
		mp.put(4, "ghi");
		mp.put(5, "jkl");
		mp.put(6, "mno");
		mp.put(7, "pqrs");
		mp.put(8, "tuv");
		mp.put(9, "wxyz");

		char[] digitnum = digits.toCharArray();
		String[] alpha = new String[digitnum.length];

		for (int i = 0; i < digitnum.length; i++) {
			if (mp.keySet().contains(Integer.parseInt(String.valueOf(digitnum[i])))) {
				alpha[i] = mp.get(Integer.parseInt(String.valueOf(digitnum[i])));
			}
		}

		for (String value : alpha) {

		}

		return null;

	}

	public static void main(String[] args) {
		letterCombinations("23");
	}

}
