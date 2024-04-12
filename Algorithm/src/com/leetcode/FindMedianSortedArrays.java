package com.leetcode;

import java.util.Arrays;

public class FindMedianSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] nums = new int[nums1.length + nums2.length];

		int i = 0, j = 0, k = 0;

		while (i < nums1.length) {
			nums[k] = nums1[i];
			i++;
			k++;
		}

		while (j < nums2.length) {
			nums[k] = nums2[j];
			j++;
			k++;
		}

		Arrays.sort(nums);

		double median;
		if (nums.length % 2 > 0) {
			median = nums[nums.length / 2];

		} else {
			int mid = nums.length / 2;
			median = (nums[mid - 1] + nums[mid]) / 2.0;
		}
		return median;

	}

	public static void main(String[] args) {
	}

}
