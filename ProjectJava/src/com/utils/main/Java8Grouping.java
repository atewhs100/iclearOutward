package com.utils.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Grouping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employeelst = new ArrayList<>();

		employeelst.add(new Employee(1, "shweta", 33));
		employeelst.add(new Employee(2, "Pratyush", 37));
		employeelst.add(new Employee(2, "Prashvita", 5));
		employeelst.add(new Employee(2, "Prashvita2", 5));

		Map<Integer, List<Employee>> empMap = employeelst.stream().collect(Collectors.groupingBy(e -> e.getAge()));
		
		System.out.println(empMap);

	}

}
