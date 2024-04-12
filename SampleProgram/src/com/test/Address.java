package com.test;

import java.util.Comparator;

public class Address implements Comparator<Address> {

	String pincode;
	String street;

	public Address(String pincode, String street) {
		super();
		this.pincode = pincode;
		this.street = street;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public int compare(Address o1, Address o2) {

		return o2.getPincode().compareTo(o1.getPincode());
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", street=" + street + "]";
	}

}
