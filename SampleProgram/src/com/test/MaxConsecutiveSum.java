package com.test;

public class MaxConsecutiveSum {

    public static int maxConsecutiveSum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        int startIndex = 0;
        int endIndex = 0;
        int tempStartIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIndex = tempStartIndex;
                endIndex = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStartIndex = i + 1;
            }
        }

        // If all numbers are negative, find the maximum among them
        if (maxSum == 0) {
            maxSum = nums[0];
            for (int num : nums) {
                maxSum = Math.max(maxSum, num);
            }
            startIndex = endIndex = indexOf(nums, maxSum);
        }

        System.out.println("Max Consecutive Sum: " + maxSum);
        System.out.println("Start Index: " + startIndex);
        System.out.println("End Index: " + endIndex);

        return maxSum;
    }

    public static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, -4, 2, -1, 3, -3, 10, -1, -11, -100, 8, -1};
        maxConsecutiveSum(nums);
    }

}

