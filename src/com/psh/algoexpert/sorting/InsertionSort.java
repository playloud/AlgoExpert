package com.psh.algoexpert.sorting;

public class InsertionSort {

    public static int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = i;
            while(j>0 && array[j-1] > array[j] ) {
                swap(j, j-1, array);
                j--;
            }
        }

        return array;
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
