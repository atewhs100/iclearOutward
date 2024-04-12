package com.test.interview;

//15. Write a Java program that illustrates merge sort.
public class MergeSort {

	public static void main(String[] args) {

		int[] values = new int[] { 10, 32, 43, 51, 21, 34 };

		int n = values.length;

		int firstIndex = 0;
		int lastIndex = values.length-1;
		divide(values, firstIndex, lastIndex);

	}

	private static void conquer(int[] values, int firstIndex, int midIndex, int lastIndex) {

	}

	private static void divide(int[] values, int firstIndex, int lastIndex) {
		if (firstIndex >= lastIndex) {
			return;
		}
		int midIndex = (lastIndex + firstIndex) / 2;

		divide(values, firstIndex, midIndex);
		divide(values, midIndex, lastIndex);

		conquer(values, firstIndex, midIndex, lastIndex);
	}

	/**
	 * while (index > 0) { int midIndex = (lastIndex + firstIndex) / 2; int[]
	 * splitvalue1 = new int[index];
	 * 
	 * for (int i = 0; i < index; i++) { splitvalue1[i] = values[i]; }
	 * 
	 * int index2 = values.length - index; int[] splitvalue2 = new int[index2];
	 * 
	 * /* for(int i = index2 ;i< values.length;i++) { splitvalue2[i]=
	 * values[index2]; }
	 */

	// System.out.println(index);

	// }*/
}
