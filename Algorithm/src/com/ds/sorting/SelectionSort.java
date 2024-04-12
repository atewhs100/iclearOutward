package com.ds.sorting;

public class SelectionSort {

	public static void main(String[] args) {

		int[] data = new int[] { 6, 4, 2, 8, 1 };

		int x = 0;
		for (int j = 0; j < data.length; j++) {
			int smallest = data[j];
			for (int i = j + 1; i < data.length; i++) {

				if (smallest > data[i]) {
					smallest = data[i];
					x = i;
				}
			}
			int temp = data[j];
			data[j] = smallest;
			data[x] = temp;

			for (int i = 0; i < data.length; i++) {
				System.out.println(data[i]);
			}

		}

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

	}

}
