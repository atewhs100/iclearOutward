package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {

	/*
	 * public static String longestPalindrome(String s) { int i = 0; List<String>
	 * palindromelst = new ArrayList<>(); while (i < s.length()) { char firstch =
	 * s.charAt(i); int lastindex = s.lastIndexOf(firstch); String palindString= "";
	 * for (int j = lastindex; j > i; j--) { if(s.charAt(i) != s.charAt(lastindex))
	 * { palindString = ""+s.substring(i,j+1); i++;
	 * System.out.println(palindString); } } palindromelst.add(palindString);
	 * 
	 * }
	 * 
	 * return "";
	 * 
	 * }
	 */

	public static String longestPalindrome(String s) {
		int max = 0;
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			if (i != 0 && s.charAt(i) == s.charAt(i - 1)) {
				int cur = fun(i - 2, i + 1, s) + 2;
				if (max < cur) {
					max = cur;
					answer = s.substring(i - cur / 2, i + cur / 2);
				}
			}
			int cur = fun(i - 1, i + 1, s) + 1;
			if (max < cur) {
				max = cur;
				answer = s.substring(i - cur / 2, i + 1 + cur / 2);
			}
		}
		return answer;
	}

	private static int fun(int l, int r, String s) {
		if (l < 0 || r >= s.length() || s.charAt(l) != s.charAt(r))
			return 0;
		return 2 + fun(l - 1, r + 1, s);
	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome("babdb"));

	}

}
