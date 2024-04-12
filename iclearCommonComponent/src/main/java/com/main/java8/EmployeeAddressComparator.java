package com.main.java8;

import java.util.Comparator;

public class EmployeeAddressComparator implements Comparator<EmployeeInfo> {

	@Override
	public int compare(EmployeeInfo o1, EmployeeInfo o2) {
		return o1.getAddress().compareTo(o2.getAddress());
	}

}
