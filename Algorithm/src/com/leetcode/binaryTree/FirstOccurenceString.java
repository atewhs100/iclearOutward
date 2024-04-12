package com.leetcode.binaryTree;

public class FirstOccurenceString {

	public static int strStr(String haystac, String needl) {

		String haystack = "sadbutsad";
		String needle = "sad";
		int j;

		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.indexOf(needle.charAt(i)) < 0) {
				break;
			} else {
				j = haystack.indexOf(needle.charAt(i));
				if (haystack.charAt(i) == needle.charAt(j)) {
					for (int k = 0; k < needle.length(); k++) {
						if (needle.charAt(k) == haystack.charAt(j)) {
							j++;

						}
					}
				}

			}

		}

		return -1;

	}

	public static void main(String[] args) {

	}

}
