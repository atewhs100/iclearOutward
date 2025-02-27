package com.strivers.A2Z.countdigits;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrintAllDivisors {

	public static void main(String[] args) {

		int number = 36;
		PrintAllDivisors.findAllDivisors(number);
	}

	private static void findAllDivisors(int number) {

		List<Integer> listOfDivisors = new ArrayList<>();
		
		//divisor <= Math.sqrt(number)
		
		//for (int i = 1; divisor <= Math.sqrt(number); i++) {

		for (int i = 1; i*i <= number; i++) {
			if ((number % i) == 0) {

				if (i == number / i) {
					listOfDivisors.add(i);
					break;
				}
				listOfDivisors.add(i);
				listOfDivisors.add(number / i);
			}

		}
		
		Collections.sort(listOfDivisors);
		listOfDivisors.stream().forEach(x -> System.out.println(x));
	}
}
