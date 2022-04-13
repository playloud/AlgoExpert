package com.psh.algoexpert.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestIncreasingSubseqTest {
    @Test
    public void testLongestInc() {
        int[] arr = {5, 7, -24, 12, 10, 2, 3, 12, 5, 6, 35};
        var result = LongestIncreasingSubseq.longestIncreasingSubsequence(arr);
        System.out.println(result);
    }

    @Test
    public void testLongestInc2() {
        int[] arr = {-1, -2, -3};
        var result = LongestIncreasingSubseq.longestIncreasingSubsequence(arr);
        System.out.println(result);
    }

    @Test
    public void testLongestInc3() {
        int[] arr = {3, -2, -1};
        var result = LongestIncreasingSubseq.longestIncreasingSubsequence(arr);
        System.out.println(result);
    }

}