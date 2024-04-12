package com.leetcode.zalando;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ZalandoTest2 {

	public static String solution(int AA, int AB, int BB) {
		// int AA, int AB, int BB

		int maxrequiredStr = AA > AB ? (AA > BB ? AA : BB) : (AB > BB ? AB : BB);

		String aa = "AA";
		String ab = "AB";
		String bb = "BB";

		String longestStr = "";

		Map<String, Integer> input = new ConcurrentHashMap<String, Integer>();
		input.put("AA", AA);
		input.put("BB", BB);
		input.put("AB", AB);

		/*
		 * Integer valuesSorted = input.values().stream().max((o1, o2) ->
		 * o1.compareTo(o2)).get(); System.out.println(valuesSorted);
		 */

		for (Map.Entry<String, Integer> entryset : input.entrySet()) {

			if (entryset.getValue() == 0) {
				input.remove(entryset.getKey());
			}
		}
		int sum = AA + AB + BB;
		System.out.println(sum);
		while (sum > 0) {

			// while (entryset.getValue() > 0) {
			for (Map.Entry<String, Integer> entryset : input.entrySet()) {

				longestStr = entryset.getKey() + longestStr;
				input.put(entryset.getKey(), entryset.getValue() - 1);
				if (!longestStr.contains("AAA") && !longestStr.contains("BBB")) {
					longestStr = longestStr + entryset.getKey();
				}
			}
			// }
		}
		System.out.println(longestStr);
		return longestStr;

	}

	public static void main(String[] args) {
		System.out.println(solution(2, 3, 1));
	}

}
