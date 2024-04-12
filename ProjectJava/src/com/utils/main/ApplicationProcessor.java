package com.utils.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ApplicationProcessor {

	public static void main(String[] args) {
		int[] a = new int[] { 3, 4, 5, 6, 3, 4 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1, "emp1", 0));
		emp.add(new Employee(5, "tinA", 0));
		emp.add(new Employee(2, "shweta", 0));

		Collections.sort(emp, (o1, o2) -> {
			return o1.getId() - o2.getId();
		});

		emp.forEach(x -> System.out.println(x.toString()));
		
		//Predicate<String> p = (a)->{};
	}

}
