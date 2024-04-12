package com.leetcode.zalando;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public String solution(String S) {
       StringBuilder sb = new StringBuilder("CBACD");

		StringBuilder strBuilder = new StringBuilder("");
		// System.out.println((char)(S.charAt(0) - 1));

		int sbLength = sb.length();
		for (int i = 0; i < sb.length(); i++) {
			char value = sb.charAt(sbLength - 1);
			if (value - 1 == (sb.charAt(sbLength - 2)) || value + 1 == (sb.charAt(sbLength - 2))) {
				sb.deleteCharAt(sbLength - 1);
				sb.deleteCharAt(sbLength - 2);
				sbLength = sbLength - 2;
				continue;
			}
            sbLength = sbLength - 1;
            sb.deleteCharAt(sbLength - 1);
			strBuilder.append(sb.charAt(i));
		}
		return sb.toString();
    }
}
