package com.main.java8;

public class EmployeeInfoComparable implements Comparable<EmployeeInfo> {

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(EmployeeInfo o) {
		return this.getAge()-o.getAge();
	}

}
