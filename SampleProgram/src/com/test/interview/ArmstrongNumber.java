package com.test.interview;

//Q #17) Write a Java Program to check Armstrong number.

/*
 * Armstrong number is the number which is the sum of the cubes of all its unit, tens and hundred digits for three-digit numbers.

153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153

If you have a four-digit number lets say

1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1 + 1296 + 81 + 256 = 1634


 */
public class ArmstrongNumber {

	public static void main(String[] args) {

		int number = 153;
		int temp, c = 0, a = number;

		while (a > 0) { // 153>0 //15>0 --1>0
			temp = a % 10; // 3 --5 --1
			a = a / 10; // --15 --1 --0
			c = c + temp * temp * temp; // 3*3*3 --5*5*5 --1*1*1
			// System.out.println(c);// 27 --27+125 = 152 --153
		}
		if (number == c)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");

	}

}
