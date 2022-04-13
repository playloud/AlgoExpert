package com.psh.algoexpert.graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumPassessOfMatrixTest {

    @Test
    public void testMinPasses() {
        int[][] input = {
            {0, -1, -3, 2, 0},
            {1, -2, -5, -1, -3},
            {3, 0, 0, -4, -1}
        };

        var app = new MinimumPassessOfMatrix();
        var result = app.minimumPassesOfMatrix(input);
        System.out.println(result);

    }

}