package com.leetcode.zalando;

import java.util.ArrayList;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
		ls.add(2);
		ls.add(3);
		ls.add(6);
		ls.add(4);
		
		ls.add(49);

		ls.add(67);
		System.out.println(
				ls.stream().sorted((o1, o2) -> o2.compareTo(o1)).skip(1).max((o1, o2) -> o1.compareTo(o2)).get());

	}

}
