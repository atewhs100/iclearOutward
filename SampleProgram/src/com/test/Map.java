package com.test;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");

		//java 8
		map.forEach((key, value) -> System.out.println(key + value));

		//java 6
		for (Integer key : map.keySet()) {
			System.out.println(key + map.get(key));
		}
	}

}
