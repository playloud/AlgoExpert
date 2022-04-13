package com.psh.algoexpert.heaps;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortKSortedArrayTest {
    @Test
    public void testSortKSortedArr() {
        //int[] input = {3, 2, 1, 5, 4, 7, 6, 5};
        int[] input = {-1, -3, -4, 2, 1, 3};
        var app = new SortKSortedArray();
        var result = app.sortKSortedArray(input, 2);
        System.out.println(Arrays.toString(result));
    }

}