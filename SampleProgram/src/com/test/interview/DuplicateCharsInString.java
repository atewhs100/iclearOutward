package com.test.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Q #15) Write a Java Program to find the duplicate characters in a string.
public class DuplicateCharsInString {

	public static void main(String[] args) {

		String value = "ssssssssssspuuuuuuuttttsss";

		HashMap duplicateChar = new HashMap<>();

		for (int i = 0; i < value.length(); i++) {
			if (duplicateChar.containsKey(value.charAt(i))) {
				duplicateChar.put(value.charAt(i), (Integer) duplicateChar.get(value.charAt(i)) + 1);
			} else {
				duplicateChar.put(value.charAt(i), 1);

			}
		}

		Iterator itr = duplicateChar.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();

			if ((int) entry.getValue() > 1) {

				System.out.println(entry.getKey());
			}

		}
	}
}
