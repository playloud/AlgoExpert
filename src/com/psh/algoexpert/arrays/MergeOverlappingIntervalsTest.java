package com.psh.algoexpert.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeOverlappingIntervalsTest {

    @Test
    public void testMergeOverlapping() {
        var app = new MergeOverlappingIntervals();

        int[][] input = {{1,2},{3,4},{4,7},{6,8},{9,10}};
        var result = app.mergeOverlappingIntervals(input);
        System.out.println(result);
        for (int i = 0; i < result.length; i++) {
            System.out.println(String.format("[%d %d]", result[i][0], result[i][1]));
        }
    }

}