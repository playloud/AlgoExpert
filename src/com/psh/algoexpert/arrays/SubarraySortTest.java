package com.psh.algoexpert.arrays;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SubarraySortTest {

    @Test
    public void testSubarrSort() {
//        int[] input = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
//        int[] input = {1, 2};
//        int[] input = {2,1};
//        int[] input = {2, 1, 4, 5, 67};
        int[] input = {-41, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 11, 57};
        var result = SubarraySort.subarraySort(input);
        System.out.println(Arrays.toString(result));
    }

}