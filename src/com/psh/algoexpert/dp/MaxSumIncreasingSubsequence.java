package com.psh.algoexpert.dp;

import java.util.*;

public class MaxSumIncreasingSubsequence {

    public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {

        if(array.length == 1) {
            return new ArrayList<List<Integer>>() {
                {
                    add(List.of(array[0])); // Example max sum
                    add(List.of(array[0])); // Example max sequence
                }
            };
        }

        int maxValue = Integer.MIN_VALUE;
        int maxIndex = -1;
        int[] maxArr = new int[array.length];
        int[] route = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if(i == 0) {
                maxArr[i] = array[i];
                route[i] = -1;
                //continue;
            }
            int curValue = array[i];
            maxArr[i] = array[i];
            for (int j = 0; j < i; j++) {
                int compareValue = array[j];
                if(compareValue < curValue) {
                    if(maxArr[i] < maxArr[j] + curValue) {
                        route[i] = j;
                        maxArr[i] = maxArr[j] + curValue;

                    }
                }
            }

            if(maxArr[i] == array[i]) {
                route[i] = -1;
            }
            // updating max index, value
            if(maxValue < maxArr[i]) {
                maxValue = maxArr[i];
                maxIndex = i;
            }
        }
        System.out.println(String.format("max index %d, max value %d", maxIndex, maxValue));
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(maxArr));
        System.out.println(Arrays.toString(route));

        var valuesToFind = new ArrayList<Integer>();
        while(maxIndex != -1) {
            valuesToFind.add(array[maxIndex]);
            maxIndex = route[maxIndex];
        }

        System.out.println(valuesToFind);
        var maxValueAsList = new ArrayList<Integer>();
        maxValueAsList.add(maxValue);
        valuesToFind.sort(Comparator.naturalOrder());

        return new ArrayList<List<Integer>>() {
            {
                add(maxValueAsList);
                add(valuesToFind);
            }
        };
    }
}
