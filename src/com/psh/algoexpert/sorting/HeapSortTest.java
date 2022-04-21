package com.psh.algoexpert.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class HeapSortTest {

    @Test
    public void testHeapSort() {
        int[] arr = {8, 5, 2, 9, 5, 6, 3};
        var result = HeapSort.heapSort(arr);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testHeapSort2() {
        int[] arr = {4,5,7,2,4,78,2,6,23,5};
        var result = HeapSort.heapSort(arr);
        System.out.println(Arrays.toString(result));
    }

}