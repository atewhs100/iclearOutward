package com.main.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class LoopMapClassic {

	public static void loopMapClassic() {
//In Java 8, we can use forEach to loop a Map and print out its entries.
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("E", 50);
		map.put("F", 60);
		map.put(null, null);
		map.put("H", null);

		Map<String, Integer> map1 = null;
		/*
		 * for (Map.Entry<String, Integer> entry : map.entrySet()) {
		 * System.out.println("Key : " + entry.getKey() + ", Value : " +
		 * entry.getValue()); }
		 */

		//forEach(BiConsumer<? super K, ? super V> action) 
		//In Java 8, BiConsumer is a functional interface; it takes two arguments and returns nothing.
		
		map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

		if (map != null) {
			map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
		}

		System.out.println("====================================");

		if (map1 != null) {
			System.out.println("map1 not null");
		}

		System.out.println("((((((((((((((((((((((((((((((((((((((((((((((((((((");
		// filtering key with not null

		map.forEach((k, v) -> {
			if (k != null) {
				System.out.println("key :" + k + ", Value : " + v);
			}

		});

	}
}
