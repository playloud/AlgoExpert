package com.psh.algoexpert.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpiralTraverseTest {

    @Test
    public void testSpiralTraverse01() {
        int[][] input = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };
        var result = SpiralTraverse.spiralTraverse(input);
        System.out.println(result);
    }

    @Test
    public void testSpiralTraverse02() {
        int[][] input = {
                {1, 2, 3, 4},
                {12, 13, 14, 5}
        };
        var result = SpiralTraverse.spiralTraverse(input);
        System.out.println(result);
    }

    @Test
    public void testSpiralTraverse03() {
        int[][] input = {
                {}
        };
        var result = SpiralTraverse.spiralTraverse(input);
        System.out.println(result);
    }

}