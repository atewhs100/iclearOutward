package com.utils.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * 
 * Given an array of integers, find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order. 

Examples:  

Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
Output: 4
Explanation: The subsequence 1, 3, 4, 2 is the longest subsequence of consecutive elements

Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
Output: 5
Explanation: The subsequence 36, 35, 33, 34, 32 is the longest subsequence of consecutive elements.
 * 
 * 
 * @author patha
 *
 */

public class SequenceLongest {

	private static int longestConsecutive(int[] nums) {

		Integer[] array = Arrays.stream(nums).boxed().toArray(Integer[]::new);

		List<Integer> listArray = Arrays.asList(array);
		Collections.sort(listArray);

		List<Integer> newList = listArray.stream().distinct().collect(Collectors.toList());

		System.out.println(newList);

		int count = 1;

		if (newList.size() == 0) {
			return 0;
		}

		if (newList.size() == 1)
			return 1;

		List<Integer> countList = new ArrayList<>();

		for (int i = 0; i < newList.size() - 1; i++) {
			if (newList.get(i).equals(newList.get(i + 1) - 1)) {
				count++;
			} else {
				count = 1;
			}
			countList.add(count);

		}
		System.out.println(countList);
		return Collections.max(countList);

	}

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 0 };
		System.out.println(longestConsecutive(nums));
	}

}
