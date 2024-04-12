package com.leetcode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		int[] input = new int[] { 1, 3, 6, 4, 1, 2 };
		System.out.println(solution(input));

	}

	private static int solution(int[] primitiveArray) {

		Integer[] input = Arrays.stream(primitiveArray).boxed().toArray(Integer[]::new);
		List<Integer> inputLst = Arrays.asList(input);

		Set<Integer> inputSet = inputLst.stream().sorted().collect(Collectors.toSet());

		Iterator<Integer> itr = inputSet.iterator();
		int i = 1;
		while (itr.hasNext()) {
			Integer nextValue = itr.next();
			if (i != nextValue) {
				return i;
			}
			i++;
		}
		return i;
	}

}
