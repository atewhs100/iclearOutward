package com.test.interview;

import java.util.ArrayList;
import java.util.Iterator;

//Q #10) Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("Prashu");
		al.add("pratyush");
		al.add("shweta");

		// for loop
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// foreach
		for (String value : al) {
			System.out.println(value);
		}

		// iterator
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
