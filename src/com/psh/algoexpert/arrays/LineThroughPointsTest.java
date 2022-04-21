package com.psh.algoexpert.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineThroughPointsTest {

    @Test
    public void testLineThorughPoints() {
        int[][] input = {
                {1,1},
                {2,2},
                {3,3},
                {0,4},
                {-2,6},
                {4,0},
                {2,1}
        };

        var app = new LineThroughPoints();
        var result = app.lineThroughPoints(input);
        System.out.println(result);
    }

}