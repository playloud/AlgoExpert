package com.psh.algoexpert.graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class RiverSizesTest {

    @Test
    public void testRiverSize() {
        int[][] mat =   {
                {1, 0, 0, 1, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 0}
        };

        var result = RiverSizes.riverSizes(mat);
        System.out.println(result);
    }

}