package com.test;

import java.util.Arrays;
import java.util.Optional;

public class JavaSmallestNumber {

	public static void main(String[] args) {

		int[] array1 = new int[] { 2, 5, 3, 87, 7, 6 };
		int[] array2 = new int[] { 25, 3, 87, 7, 6, 2, 2 };

		// Arrays.stream(array1).sorted().distinct().skip(1).forEach(x ->
		// System.out.println(x));

		// second smallest
		// System.out.println(Arrays.stream(array1).sorted().distinct().skip(1).findFirst());

		// Set<Integer> hs = Arrays.stream(numbers).boxed().collect(Collectors.toSet());

		/*
		 * Set<Integer> hs = Arrays.stream(array1).boxed() .filter(num1 ->
		 * Arrays.stream(array2).boxed().anyMatch(num2 -> num1.equals(num2)))
		 * .collect(Collectors.toSet());
		 * 
		 * System.out.println(hs);
		 */

		/*
		 * IntStream.range(0, array1.length / 2).forEach(i -> { int temp = array1[i];
		 * array1[i] = array1[array1.length - i - 1]; array1[array1.length - i - 1] =
		 * temp;
		 * 
		 * });
		 * 
		 * System.out.println(Arrays.toString(array1));
		 * 
		 */

		String[] strarray = new String[] { "apple", "banana", "orsdcfvfeede", "orange" };

		Optional<String> LongestStr = Arrays.asList(strarray).stream()
				.max((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		if (LongestStr.isPresent()) {
			System.out.println(LongestStr.get().length());
		} else {
			System.out.println("Empty string array");
		}
		;

		Arrays.asList(strarray).stream().forEach(x -> {
			if (Arrays.asList(strarray).contains(x)) {
				Arrays.asList(strarray).remove(x);
			}
		});
		
		System.out.println(strarray);
	}

}