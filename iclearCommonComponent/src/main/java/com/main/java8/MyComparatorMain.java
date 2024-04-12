package com.main.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyComparatorMain {

	public static void main(String[] args) {

		List<Integer> lstInt = new ArrayList<>();
		lstInt.add(23);
		lstInt.add(78);
		lstInt.add(12);
		lstInt.add(82);
		lstInt.add(2);
		lstInt.add(9);

		System.out.println(lstInt);

		Collections.sort(lstInt, (o1, o2) -> o1 > o2 ? 1 : (o1 < o2) ? -1 : 0);

		lstInt.stream().forEach(System.out::println);
		// lstInt.stream().forEach(x ->System.out.println(x));

		lstInt.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

		List<Integer> newLstEven = lstInt.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(newLstEven);

	}
}
