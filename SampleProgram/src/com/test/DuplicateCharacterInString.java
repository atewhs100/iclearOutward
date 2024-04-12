package com.test;

import java.util.HashSet;

public class DuplicateCharacterInString {

	public static void main(String[] args) {

		duplicateCharInString("codedecode");
	}

	private static void duplicateCharInString(String value) {

		HashSet<Character> hs = new HashSet<Character>();
		char[] charString = value.toCharArray();
		HashSet<Character> ds = new HashSet<>();

		for (char c : charString) {

			if (hs.contains(c)) {
				ds.add(c);
			} else {
				hs.add(c);
			}

		}

		ds.stream().forEach(c -> System.out.println(c));

	}

}
