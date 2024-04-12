package com.ds.sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int[] data = new int[] { 6, 4, 2, 8, 1 };
//1st iteration
		// 4,6,2,8,1
		// 4,2,6,8,1
		// 4,2,6,8,1
		// 4,2,6,1,8

		// 2nd iteration
		//2,4,6,1,8
		//2,4,6,1,8
		//2,4,1,6,8
		//2,4,1,6,8
		
		//3rd iteration
		//2,4,1,6,8
		//2,1,4,6,8
		//2,1,4,6,8
		//2,1,4,6,8
		
		//4th iteration
		//1,2,4,6,8
		// same 
		
		int[] finalResult = data;

		for (int j = 0; j < data.length - 1; j++) {
			for (int i = 0; i < data.length - 1; i++) {
				int first = data[i];
				int second = data[i + 1];

				if (first > second) {
					finalResult[i] = second;
					finalResult[i + 1] = first;

				}
			}
		}

		for (

				int i = 0; i < finalResult.length; i++) {

			System.out.println(finalResult[i]);
		}
	}

}
