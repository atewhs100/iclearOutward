package com.test.interview;

import java.util.Arrays;
import java.util.HashSet;

//17. Write Java program that checks if two arrays contain the same elements.
public class TwoArrayContainSameElement {

	public static void main(String[] args) {

		Integer[] array1 = new Integer[] { 12, 14, 62, 32, 45 };
		Integer[] array2 = new Integer[] { 13, 14, 32, 45 };

		/*
		 * int a = 12;
		 * 
		 * Integer b = Integer.valueOf(a); System.out.println(b);
		 */

		/*
		 * for (int i = 0; i < array1.length; i++) { for (int j = 0; j < array2.length;
		 * j++) { if (array1[i] == array2[j]) { System.out.println(array1[i]); } } }
		 */

		HashSet<Integer> hs1 = new HashSet<>(Arrays.asList(array1));

		HashSet<Integer> hs2 = new HashSet<>(Arrays.asList(array2));

		for (Integer object : hs1) {
			if (hs2.contains(object)) {
				System.out.println(object);
			}

		}
	}

}
