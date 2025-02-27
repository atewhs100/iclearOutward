package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

	public static List<Integer> majorityElement(int[] nums) {

		// List<Integer> lst = new ArrayList<>();

		int length = nums.length / 3;

		Map<Integer, Integer> numsMap = new HashMap<>();
		List<Integer> numsList = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (numsMap.containsKey(nums[i])) {
				numsMap.put(nums[i], numsMap.get(nums[i]) + 1);
			} else {
				numsMap.put(nums[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
			if (entry.getValue() > length) {
				numsList.add(entry.getKey());
			}

		}
		return numsList;

	}

	public static void main(String[] args) {
		int[] majorityElement = new int[] { 3, 2, 3 };
		List<Integer> listofMajorIntegers = majorityElement(majorityElement);

		listofMajorIntegers.stream().forEach(x -> System.out.print(x));
	}

}
