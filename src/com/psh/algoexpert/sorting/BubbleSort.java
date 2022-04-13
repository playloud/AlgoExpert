package com.psh.algoexpert.sorting;

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {

        if(array.length == 1)
            return array;

        boolean isSwap = false;
        while(true) {
            isSwap = false;
            for (int i = 0; i < array.length -1; i++) {
                if(array[i] > array[i+1]) {
                    isSwap = true;
                    swap(i, i+1, array);
                }
            }
            if(!isSwap) break;
        }
        // Write your code here.
        return array;
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
