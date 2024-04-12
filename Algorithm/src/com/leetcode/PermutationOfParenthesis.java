package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfParenthesis {

	public static void main(String[] args) {

	}

	ArrayList<String> res = new ArrayList<String>();

	public List<String> generateParenthesis(int n) {
		if (n <= 0)
			return res;
		generating("", n, n);
		return res;
	}

	public void generating(String str, int left, int right) {
		if (left == 0 && right == 0) {
			res.add(str);
			return;
		}

		if (left == right) {
			generating(str + "(", left - 1, right);
		} else {
			if (left > 0) {
				generating(str + "(", left - 1, right);
			}
			generating(str + ")", left, right - 1);
		}
	}

}
