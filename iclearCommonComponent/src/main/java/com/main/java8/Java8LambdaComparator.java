package com.main.java8;

import java.util.ArrayList;
import java.util.List;

public class Java8LambdaComparator {

	static void java8LambdaComparator() {

	}

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("fox");
		lst.add("things");
		lst.add("tina");
		lst.add("time");

		lst.sort((String l1, String l2) -> {
			return l1.compareTo(l2);
		});

		lst.forEach(x -> System.out.println(x));
		//System.out.println("List of values = " + lst);
	}

}
