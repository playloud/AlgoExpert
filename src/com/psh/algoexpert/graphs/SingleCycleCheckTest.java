package com.psh.algoexpert.graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleCycleCheckTest {

    @Test
    public void testSingleCycle() {
//        int[] input = {2,3,1,-4,-4,2};
//        int[] input = {1, 1, 1, 1, 2};
        int[] input = {1, 2, 3, 4, -2, 3, 7, 8, -26};
        var result = SingleCycleCheck.hasSingleCycle(input);
        System.out.println(result);
    }

}