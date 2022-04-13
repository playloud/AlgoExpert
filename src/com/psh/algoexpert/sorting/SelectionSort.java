package com.psh.algoexpert.sorting;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {

        int minValue = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            minValue = Integer.MAX_VALUE;
            for (int j = i; j < array.length; j++) {
                if(minValue >= array[j]) {
                    minValue = array[j];
                    temp = j;
                }
            }
            if(i != temp) swap(i,temp,array);
        }
        return array;
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
