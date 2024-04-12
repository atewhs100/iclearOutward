package com.utils.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Person {

	public static void main(String[] args) {
		/*
		 * MilkMan man = null; System.out.println(MilkMan.hello());
		 */
		List<String> lst = Arrays.asList("code", "decode", "code", "v", "v");

		HashMap<String, Integer> hs = new HashMap<>();

		lst.stream().forEach(x -> {
			if (hs.containsKey(x)) {
				hs.put(x, hs.get(x) + 1);
			} else {
				hs.put(x, 1);
			}
		});

		System.out.println(hs);

	}
}
