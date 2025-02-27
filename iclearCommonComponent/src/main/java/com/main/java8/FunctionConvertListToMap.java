package com.main.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionConvertListToMap {

	public static void functionConvertListToMap() {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Tina"));
		emp.add(new Employee(2, "Nina"));

		Map<Integer, String> map = new HashMap<>();

		emp.forEach(e -> {
			map.put(e.getId(), e.getName());

		});
		System.out.println(map);

	}

	public static void main(String[] args) {
		FunctionConvertListToMap.functionConvertListToMap();
	}

}

class Employee {
	Integer id;
	String name;

	public Employee(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
