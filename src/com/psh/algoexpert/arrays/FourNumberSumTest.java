package com.psh.algoexpert.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FourNumberSumTest {

    @Test
    public void testFourSum() {
        int[] arr = {7,6,4,-1,1,2};
        int target = 16;
        FourNumberSum.fourNumberSum(arr, target);
    }

}