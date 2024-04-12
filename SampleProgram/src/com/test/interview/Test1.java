package com.test.interview;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'getMinNumMoves' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY blocks as parameter.
	 */

	public static int[] findMinMaxIndex(List<Integer> list) {
		int[] minMaxIndex = new int[2];
		int minIndex = 0;
		int maxIndex = 0;
		int minValue = list.get(0);
		int maxValue = list.get(0);

		// Find the index of the minimum and maximum values
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) < minValue) {
				minValue = list.get(i);
				minIndex = i;
			}
			if (list.get(i) > maxValue) {
				maxValue = list.get(i);
				maxIndex = i;
			}
		}
		minMaxIndex[0] = minIndex;
		minMaxIndex[1] = maxIndex;
		return minMaxIndex;
	}

	public static int getMinNumMoves(List<Integer> blocks) {

		int[] minMaxIndex = findMinMaxIndex(blocks);
		int minIndex = minMaxIndex[0];
		int maxIndex = minMaxIndex[1];

		int swaps = 0;
		while (minIndex > 0 || maxIndex < blocks.size() - 1) {
			if (minIndex > 0) {
				Collections.swap(blocks, minIndex, minIndex - 1);
				minIndex--;
				swaps++;
			}
			if (maxIndex < blocks.size() - 1) {
				Collections.swap(blocks, maxIndex, maxIndex + 1);
				maxIndex++;
				swaps++;
			}
		}
		return swaps;

	}

}

public class Test1 {
	public static void main(String[] args) throws IOException {
		List<Integer> blocks = new ArrayList<>();
		blocks.add(2);
		blocks.add(1);
		blocks.add(4);
		blocks.add(3);
		blocks.add(6);

		int minMoves = Result.getMinNumMoves(blocks);
		System.out.println("Minimum moves required: " + minMoves);
	}
}
