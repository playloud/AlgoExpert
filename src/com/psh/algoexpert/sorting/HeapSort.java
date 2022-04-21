package com.psh.algoexpert.sorting;

public class HeapSort {

    public static int[] heapSort(int[] array) {
        pshHeapfy(array, array.length-1);
        int lastIndex = array.length -1;
        while(lastIndex > 0) {
            swap(array, 0, lastIndex);
            lastIndex--;
            pshHeapfy(array, lastIndex);
        }
        return array;
    }

    private static boolean isSwap = false;
    public static void pshHeapfy(int[] src, int maxIndex) {
        while(true) {
            isSwap = false;
            heapify(src, 0, maxIndex);
            if(!isSwap)
                break;
        }
    }

    public static void heapify(int[] src, int startIndex, int maxIndex) {
        if(startIndex > maxIndex)
            return;
        int value = src[startIndex];
        int leftIndex = startIndex * 2 +1;
        int rightIndex = startIndex * 2 +2;
        if(leftIndex <= maxIndex) {
            if(rightIndex <= maxIndex) {
                int left = src[leftIndex];
                int right = src[rightIndex];
                if(left > value || right > value) {
                    if(left < right) {
                        swap(src, rightIndex, startIndex);
                        isSwap = true;
                    } else {
                        swap(src, leftIndex, startIndex);
                        isSwap = true;
                    }
                }
            } else {
                int left = src[leftIndex];
                if(left > value) {
                    swap(src, leftIndex, startIndex);
                    isSwap = true;
                }
            }
        }
        heapify(src, leftIndex, maxIndex);
        heapify(src, rightIndex, maxIndex);
    }

    public static void swap(int[] src, int i, int j) {
        int temp = src[i];
        src[i] = src[j];
        src[j] = temp;
    }
}
