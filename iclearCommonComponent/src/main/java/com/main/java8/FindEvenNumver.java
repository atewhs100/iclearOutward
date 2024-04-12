package com.main.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumver {

	public static void main(String[] args) {

		// Q1 Given a list of integers, find out all the even numbers exist in the list
		// using Stream functions?

		List<Integer> numbers = Arrays.asList(1, 1115, 1115, 56, 3, 23, 22, 56, 6, 8);

		// numbers.stream().filter(x -> x%2 == 0).forEach(System.out::println);

		// Q2 Given a list of integers, find out all the numbers starting with 1 using
		// Stream functions?

		// numbers.stream().map(x -> x + "").filter(x ->
		// x.substring(0,1).equals("1")).forEach(System.out::println);

		// Q3 How to find duplicate elements in a given integers list in java using
		// Stream functions?
		// Set<Integer> hs = new HashSet<>();

		// numbers.stream().filter(x -> !hs.add(x)).forEach(System.out::println);

		// Q4 Given the list of integers, find the first element of the list using
		// Stream functions?

		// numbers.stream().findFirst().ifPresent(System.out::println);

		// Q5 Given a list of integers, find the total number of elements present in the
		// list using Stream functions?

		// System.out.println(numbers.stream().count());

		// Q6 Given a list of integers, find the maximum value element present in it
		// using Stream functions?
		//System.out.println(numbers.stream().distinct().max((o1, o2) -> o1 > o2 ? 1 : (o1 < o2 ? -1 : 0)));
		
		//Q7 Given a String, find the first non-repeated character in it using Stream functions?
		
		String str ="this is a new game";
		
		//str.chars().mapToObj(x-> Character.toLowerCase(Character.valueOf((char)x))).collect(Collectors.groupingBy(null))/*
	/*	mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
        .entrySet()*/
		
		numbers.stream().map(x-> {
			return x*2;
					}).collect(Collectors.toSet());
		System.out.println(numbers);
		

	}

}
