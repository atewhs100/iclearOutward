package com.test.interview;

import java.util.HashMap;

public class WordsInString {

	// Q #5) Write a Java Program to count the number of words in a string using
	// HashMap.

	public static void main(String[] args) {

		String value = "Hello Prashvita I am fine I am good I";

		findWordsInString(value);
	}

	private static void findWordsInString(String value) {

		String[] words = value.split(" ");
		HashMap<String, Integer> wordsMap = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			if (wordsMap.containsKey(words[i])) {
				wordsMap.put(words[i], wordsMap.get(words[i]) + 1);

			} else {
				wordsMap.put(words[i], 1);
			}
		}
		System.out.println(wordsMap);
	}

}
