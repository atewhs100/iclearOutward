package com.test.interview;

import java.util.*;

public class SwapsToMinMax {
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

    public static int countSwaps(List<Integer> list) {
        int[] minMaxIndex = findMinMaxIndex(list);
        int minIndex = minMaxIndex[0];
        int maxIndex = minMaxIndex[1];

        int swaps = 0;
        while (minIndex > 0 || maxIndex < list.size() - 1) {
            if (minIndex > 0) {
                Collections.swap(list, minIndex, minIndex - 1);
                minIndex--;
                swaps++;
            }
            if (maxIndex < list.size() - 1) {
                Collections.swap(list, maxIndex, maxIndex + 1);
                maxIndex++;
                swaps++;
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 5, 2, 4));
        int swaps = countSwaps(list);
        System.out.println("Swaps required: " + swaps);
        System.out.println("List after swaps: " + list);
    }
}
