package com.psh.algoexpert.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test
    public void testInsertionSort() {
        int[] input = {8,4,5,2,7, 1, 13, 24 ,4};
        var result = InsertionSort.insertionSort(input);
        System.out.println(Arrays.toString(result));
    }

}