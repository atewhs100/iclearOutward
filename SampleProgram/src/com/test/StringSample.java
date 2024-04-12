package com.test;

public class StringSample {

	public static void main(String[] args) {
		String s1 = "prashvita";
		System.out.println(s1.hashCode());
		
		String s2 = "de"+s1;
		
		System.out.println(s2.hashCode());
	}

}
