package com.main.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparatorMain {

	public static void main(String[] args) {
		EmployeeInfo employee1 = new EmployeeInfo(1, 32, "appu", new Address("grupello", 23466));
		EmployeeInfo employee2 = new EmployeeInfo(2, 54, "grapu", new Address("hgrupello", 13466));
		EmployeeInfo employee3 = new EmployeeInfo(3, 52, "mappu", new Address("egrupello", 33466));
		EmployeeInfo employee4 = new EmployeeInfo(4, 54, "bappu", new Address("egrupello", 33466));

		List<EmployeeInfo> lstEMployee = new ArrayList<EmployeeInfo>();
		lstEMployee.add(employee1);
		lstEMployee.add(employee2);
		lstEMployee.add(employee3);
		lstEMployee.add(employee4);

		Collections.sort(lstEMployee, new EmployeeAgeComparator().thenComparing(new EmployeeNameComparator()));
		System.out.println("Compare by Age: " + lstEMployee);
		/*
		 * Collections.sort(lstEMployee, new EmployeeNameComparator());
		 * System.out.println("compare by Name : " + lstEMployee);
		 * 
		 * Collections.sort(lstEMployee, new EmployeeAddressComparator());
		 * System.out.println("compare by Address : " + lstEMployee);
		 */

	}

}

class EmployeeInfo {
	int id;
	int age;
	String name;
	Address address;

	public EmployeeInfo(int id, int age, String name, Address address) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address + "]";
	}

}

class Address implements Comparable<Address> {
	String streetName;
	int pincode;

	public Address(String streetName, int pincode) {
		super();
		this.streetName = streetName;
		this.pincode = pincode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", pincode=" + pincode + "]";
	}

	@Override
	public int compareTo(Address o) {
		return this.getPincode() - o.getPincode();
	}

}