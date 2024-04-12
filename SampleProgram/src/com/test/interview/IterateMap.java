package com.test.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(1, "pratyush");
		hs.put(2, "prashvita");
		hs.put(3, "shweta");

		// 1st way

		Iterator itr = hs.entrySet().iterator();

		while (itr.hasNext()) {

			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());

		}

		// 2nd way
		for (Map.Entry entry : hs.entrySet()) {
			System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
		}
	}

}
