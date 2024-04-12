package com.ds.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {

	public static int[] sortArray(int[] nums) {

		Integer[] boxedArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
		List<Integer> numslst = Arrays.asList(boxedArray);
		List<Integer> sortedList = numslst.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());

		int[] result = new int[sortedList.size()];
		for (int i = 0; i < sortedList.size(); i++)
			result[i] = sortedList.get(i);
		return result;

	}

	public static void main(String[] args) {
		int[] nums = new int[] { 5, 2, 3, 1 };
		sortArray(nums);
	}

}
