package com.test.interview;

import java.util.LinkedList;

//13. How do you reverse a linked list in Java?
public class ResverseLinkedListJava {

	public static void main(String[] args) {

		LinkedList<String> ls = new LinkedList<>();
		ls.add("A");
		ls.add("B");
		ls.add("C");

		LinkedList<String> ls1 = new LinkedList<>();

		for (String value : ls) {
			ls1.addFirst(value);

		}

		System.out.println(ls);
		System.out.println(ls1);
	}

}
