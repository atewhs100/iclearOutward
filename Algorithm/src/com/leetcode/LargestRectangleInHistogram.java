package com.leetcode;

public class LargestRectangleInHistogram {

	public static int largestRectangleArea(int[] heights) {

		int max = 0;

		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != 0)
				heights[i] = heights[i];
		}

		if (heights.length == 1) {
			return heights[0];
		}

		for (int i = 0; i < heights.length - 1; i++) {
			if (heights[i] <= heights[i + 1]) {
				if (max < heights[i] * 2)
					max = heights[i] * 2;
			} else {
				if (max < heights[i + 1] * 2)
					max = heights[i + 1] * 2;
			}
		}

		return max;

	}

	public static void main(String[] args) {
		int[] heights = new int[] { 0,9 };
		System.out.println(largestRectangleArea(heights));

	}

}
