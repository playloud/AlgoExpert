package com.psh.algoexpert.arrays;

import org.junit.Test;

import java.util.Arrays;

public class LargestRangeTest {
    @Test
    public void testLargestRange() {
        int[] input = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        var result = LargestRange.largestRange(input);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testLargestRange2() {
        int[] input = {1};
        var result = LargestRange.largestRange(input);
        System.out.println(Arrays.toString(result));

    }

    @Test
    public void testLargestRange3() {
        int[] input = {3,1,2};
        var result = LargestRange.largestRange(input);
        System.out.println(Arrays.toString(result));

    }

    @Test
    public void testLargestRange4() {
        int[] input = {3,0,2};
        var result = LargestRange.largestRange(input);
        System.out.println(Arrays.toString(result));

    }

    @Test
    public void testLargestRange5() {
        int[] input = {19, -1, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, 8, 7, 6, 15, 12, 12, 2, 1, 6, 13, 14};
        var result = LargestRange.largestRange(input);
        System.out.println(Arrays.toString(result));

    }

}