package com.test.interview;

//19. How do you find the second largest number in an array in Java?
public class SecondLargestInArray {

	public static void main(String[] args) {

		int[] array1 = new int[] { 12, 14, 62, 32, 45, 56, 93 };

		int largestNumber = 0;
		int secondLargestNumber = 0;

		for (int i = 0; i < array1.length; i++) {

			if (largestNumber < array1[i]) {
				secondLargestNumber = largestNumber;
				largestNumber = array1[i];
			}
			if (array1[i] > secondLargestNumber && array1[i] < largestNumber) {
				secondLargestNumber = array1[i];
			}
		}

		System.out.println("Largest number = " + largestNumber);
		System.out.println("Second Largest number = " + secondLargestNumber);

	}

}
