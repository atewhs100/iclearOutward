package com.leetcode.zalando;

import java.util.Stack;

public class ZalandoTest3 {

	public static String solution(String S) {

		Stack<Character> stc = new Stack<>();
		for (char c : S.toCharArray()) {
			if (!stc.isEmpty() && stc.peek() == c) {
				stc.pop();
			} else {
				stc.push(c);
			}
		}

		StringBuilder sb = new StringBuilder();
		while (!stc.isEmpty()) {
			sb.append(stc.pop());
		}

		return sb.reverse().toString();

	}

	public static void main(String[] args) {
		System.out.println(solution("CABABD"));
	}

}
