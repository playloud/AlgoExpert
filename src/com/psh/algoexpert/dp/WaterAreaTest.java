package com.psh.algoexpert.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class WaterAreaTest {


    @Test
    public void testWaterArea() {
        int[] heights = {0, 8, 0, 0, 5, 0, 0, 10, 0, 0, 1, 1, 0, 3};
        //int[] heights = {4,0,4};
        var result = WaterArea.waterArea(heights);
        System.out.println(result);
    }

}