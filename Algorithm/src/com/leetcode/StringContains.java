package com.leetcode;

public class StringContains {

	public static boolean rotateString(String s, String goal) {

		String totalS = s.toLowerCase() + s.toLowerCase();
		if (s.length() > 1 && s.length() == goal.length() && totalS.contains(goal.toLowerCase())) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		System.out.println(rotateString("aa", "a"));
	}

}
