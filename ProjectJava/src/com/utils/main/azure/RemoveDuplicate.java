package com.utils.main.azure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicate {

	public static void main(String[] args) {

		Integer[] num = new Integer[] { 2, 3, 45, 2, 1, 5, 45 };

		List<Integer> numlist = Arrays.asList(num);
		Map<Integer, Integer> numberCount = new HashMap<>();

		for (Integer n : numlist) {
			if (numberCount.containsKey(n)) {
				numberCount.put(n, numberCount.get(n) + 1);
			} else {
				numberCount.put(n, 1);
			}
		}
		
		System.out.println(numberCount);
	}

}
