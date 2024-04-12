package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PositiveNumber {

	public static int solution(int[] A) {

		Integer[] numArray = Arrays.stream(A).boxed().toArray(Integer[]::new);

		List<Integer> num = Arrays.asList(numArray);

		Set<Integer> setNum = num.stream().sorted().collect(Collectors.toSet());
		int i = 1;

		for (Integer integer : setNum) {

			if (Integer.signum(integer) > 0 && Integer.valueOf(i).equals(integer)) {
				i++;
			}
		}
		System.out.println(i);

		return i;

	}

	public static void main(String[] args) {
		int[] A = new int[] { -1, -3 };
		solution(A);

	}

}
