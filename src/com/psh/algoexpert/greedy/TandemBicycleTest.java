package com.psh.algoexpert.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TandemBicycleTest {
    @Test
    public void testTandem() {
        int[] reds = {5,5,3,9,2};
        int[] blues = {3,6,7,2,1};
        var app = new TandemBicycle();
        var result = app.tandemBicycle(reds, blues, true);
        System.out.println(result);
    }

}