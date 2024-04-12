package com.ds.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] data = new int[] { 6, 4, 2, 8, 1 };

		int[] finalResult = data;

		for (int j = 0; j < data.length - 1; j++) {
			for (int i = 0; i < data.length - j - 1; i++) {
				int first = data[i];
				int second = data[i + 1];

				if (first > second) {
					finalResult[i] = second;
					finalResult[i + 1] = first; // 4,6,2
				}
			}
		}

		for (int i = 0; i < finalResult.length; i++) {
			System.out.println(finalResult[i]);
		}

	}

}
