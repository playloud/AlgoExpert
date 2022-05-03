package com.psh.algoexpert.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void testMerge() {
        int[] arr1 = {2, 3, 7, 10};
        int[] arr2 = {6, 7, 9};
        var result = MergeSort.merge(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testMergeSort() {
        int[] arr1 = {4,2,1,3, 2, 6, 3, 8, 12, 23, 24, 17};
        var result = MergeSort.mergeSort(arr1);
        System.out.println(Arrays.toString(result));
    }

}