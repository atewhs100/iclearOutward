package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeComparator {

	public static void main(String[] args) {

		Employee employee1 = new Employee("radha", 23, new Address("201301", "Grupeellostarsse"));
		Employee employee2 = new Employee("radha", 32, new Address("407254", "Prupeellostarsse"));
		Employee employee3 = new Employee("sonu", 67, new Address("32171", "Prupeellostarsse"));
		Employee employee4 = new Employee("pappu", 25, new Address("62188", "Grupeellostarsse"));
		
		
		List<Employee> le = new ArrayList<>();
		le.add(employee1);
		le.add(employee2);
		le.add(employee3);
		le.add(employee4);
		
	//	List<Employee> le1= le.stream().filter(e -> e.getName().startsWith("r")).collect(Collectors.toList());
		
		
		Collections.sort(le);
		
		System.out.println(le.toString());
		
		
	}

}
