package com.psh.algoexpert.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSubsetSumNoAdjacentTest {

    @Test
    public void testMaxSubset() {
        int[] arr = {75, 105, 120, 75, 90, 135};

        System.out.println(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(arr));
    }

}