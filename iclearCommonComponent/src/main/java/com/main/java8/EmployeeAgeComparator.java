package com.main.java8;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<EmployeeInfo> {

	@Override
	public int compare(EmployeeInfo o1, EmployeeInfo o2) {

		if (o1.getAge() < o2.getAge()) {
			return -1;
		} else if (o1.getAge() < o1.getAge()) {
			return 1;
		}
		return 0;
	}

}
