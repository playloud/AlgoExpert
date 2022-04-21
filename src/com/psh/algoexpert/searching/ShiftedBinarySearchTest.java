package com.psh.algoexpert.searching;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShiftedBinarySearchTest {

    @Test
    public void testShiftedBinSearch() {
        int[] arr = {72, 73, 0, 1, 21, 33, 37, 45, 61, 71};
        int target = 72;
        var result = ShiftedBinarySearch.shiftedBinarySearch(arr, target);
        System.out.println(result);
    }
    //45, 61, 71, 72, 73, 0, 1, 21, 33, 37
    @Test
    public void testShiftedBinSearch2() {
        int[] arr = {45, 61, 71, 72, 73, 0, 1, 21, 33, 37};
        int target = 38;
        var result = ShiftedBinarySearch.shiftedBinarySearch(arr, target);
        System.out.println(result);
    }
}