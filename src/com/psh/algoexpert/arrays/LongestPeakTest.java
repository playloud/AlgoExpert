package com.psh.algoexpert.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPeakTest {

    @Test
    public void testLongestPeak() {
        //int[] input = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        int[] input = {1, 3, 2};
        var result = LongestPeak.longestPeak(input);
        System.out.println(result);
    }

}