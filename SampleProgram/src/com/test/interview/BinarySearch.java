package com.test.interview;

import java.util.Arrays;

//14. How do you implement a binary search in Java?
public class BinarySearch {

	public static void main(String[] args) {

		int[] values = new int[] { 2, 56, 34, 98, 12, 54 };

		Arrays.sort(values);

		int start = 0;
		int end = values.length - 1;
		int element = 12;
		binarySearch(values, start, end, element);
	}

	private static void binarySearch(int[] values, int start, int end, int element) {

		System.out.println(values[(values.length - 1) / 2]);

		int mid = (start + end) / 2;
		while (start <= end) {

			if (values[mid] == element) {
				System.out.println("element is present");
				break;

			} else if (values[mid] > element) {
				end = mid - 1;

			} else {
				start = mid + 1;
			}

			mid = (start + end) / 2;

		}

		if (start > end) {
			System.out.println("Element is not found!");
		}

	}

}
