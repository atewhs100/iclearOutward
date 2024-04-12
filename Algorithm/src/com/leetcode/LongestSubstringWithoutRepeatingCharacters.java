package com.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static int lengthOfLongestSubstring(String s) {

		/*
		 * if(s.isEmpty() ) { return 0; } if(s.isBlank() || s.length() == 1) { return 1;
		 * }
		 */
		Map<String, Integer> hs = new HashMap<>();
		String s1 = "";
		String s2 = "";
		for (int j = 0; j < s.length(); j++) {
			for (int i = j; i < s.length(); i++) {
				s1 = s.substring(i, i + 1);
				if (s2.contains(s1)) {
					hs.put(s2, s2.length());
					s2 = "";
					break;
				} else {
					s2 = s2 + s1;
				}
			}
			if (s2.length() > 0) {
				hs.put(s2, s2.length());
				s2 = "";
			}
		}
		List<Integer> ls = new ArrayList<>(hs.values());
		ls.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		return ls.size() > 0 ? ls.get(0) : 0;

	}

	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("aab"));

	}

}
