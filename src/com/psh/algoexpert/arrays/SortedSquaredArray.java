package com.psh.algoexpert.arrays;

import java.util.Arrays;

public class SortedSquaredArray {
    public int[] sortedSquaredArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        Arrays.sort(array);
        return array;
    }
}
