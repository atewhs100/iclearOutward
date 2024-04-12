package com.main.java8;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<String> check = s -> s.length() > 6;

		System.out.println(check.test("shwetapathak"));
		

	}

}
