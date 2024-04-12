package com.main.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class loopListJava8 {
	public static void loopListJava8() {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add(null);

		// forEach(Consumer<? super T> action)
		// In Java 8, Consumer is a functional interface; it takes an argument and
		// returns nothing.
		list.forEach(x -> System.out.println("list value = " + x));

		list.forEach(System.out::println);

		list.stream().filter(Objects::nonNull).forEach(System.out::println);
	}
}
