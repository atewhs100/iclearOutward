package com.test.interview;

//Q #16) Write a Java Program to find the second-highest number in an array.
public class SecondHighestNumber {

	public static void main(String[] args) {

		int[] numbers = new int[] { 129, 638, 521, 3272, 53, 78 };

		int secondHighestNumber = 0;
		int highestNumber = 0;

		if (numbers[1] > numbers[0]) {
			secondHighestNumber = numbers[0];
			highestNumber = numbers[1];
		} else {
			secondHighestNumber = numbers[1];
			highestNumber = numbers[0];
		}
		for (int i = 2; i < numbers.length; i++) {
			if (numbers[i] > highestNumber && numbers[i] > secondHighestNumber) {
				secondHighestNumber = highestNumber;
				highestNumber = numbers[i];
			} else if (numbers[i] < highestNumber && numbers[i] > secondHighestNumber) {
				secondHighestNumber = numbers[i];
			}
		}

		System.out.println("Second Highest Number : " + secondHighestNumber);
	}

}
