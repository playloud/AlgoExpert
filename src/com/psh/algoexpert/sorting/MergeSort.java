package com.psh.algoexpert.sorting;

import java.util.ArrayList;

public class MergeSort {

    public static int[] mergeSort(int[] array) {
        if(array.length == 1)
            return array;
        if(array.length == 2) {
            if(array[1] < array[0]) {
                int temp = array[1];
                array[1] = array[0];
                array[0] = temp;
            }
            return array;
        }

        int m = array.length / 2;
        int[] arr1 = new int[m + 1];
        int[] arr2 = new int[array.length - m - 1];
        for (int i = 0; i <= m; i++) {
            arr1[i] = array[i];
        }

        for (int i = m + 1; i < array.length; i++) {
            arr2[i-(m+1)] = array[i];
        }

        var sorted1 = mergeSort(arr1);
        var sorted2 = mergeSort(arr2);
        return merge(sorted1, sorted2);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        if(arr1.length == 1 && arr2.length == 1) {
            if(arr1[0] < arr2[0]) {
                result[0] = arr1[0];
                result[1] = arr2[0];
            } else {
                result[1] = arr1[0];
                result[0] = arr2[0];
            }
            return result;
        }

        int pos1 = 0;
        int pos2 = 0;
        int resultPos = 0;

        while (pos1 < arr1.length && pos2 < arr2.length) {
            int value1 = arr1[pos1];
            int value2 = arr2[pos2];
            if(value1 < value2) {
                pos1++;
                result[resultPos++] = value1;
            } else {
                pos2++;
                result[resultPos++] = value2;
            }
        }
        // means arr1 not empty
        if(pos1 < arr1.length) {
            while(pos1 < arr1.length) {
                result[resultPos++] = arr1[pos1++];
            }
        } else if(pos2 < arr2.length) {
            while(pos2 < arr2.length) {
                result[resultPos++] = arr2[pos2++];
            }
        }
        return result;
    }

}
