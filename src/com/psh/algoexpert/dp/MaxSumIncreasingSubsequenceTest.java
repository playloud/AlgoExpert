package com.psh.algoexpert.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumIncreasingSubsequenceTest {
    @Test
    public void testMaxSumIncreaseSub() {
        int[] arr = {10, 70, 20, 30, 50, 11, 30};
        var result = MaxSumIncreasingSubsequence.maxSumIncreasingSubsequence(arr);
        System.out.println(result);
    }

    @Test
    public void testMaxSumIncreaseSub02() {
        int[] arr = {-1, 1};
        var result = MaxSumIncreasingSubsequence.maxSumIncreasingSubsequence(arr);
        System.out.println(result);
    }

    @Test
    public void testMaxSumIncreaseSub03() {
        int[] arr = {5,4,3,2,1};
        var result = MaxSumIncreasingSubsequence.maxSumIncreasingSubsequence(arr);
        System.out.println(result);
    }

}