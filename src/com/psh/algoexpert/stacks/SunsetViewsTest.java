package com.psh.algoexpert.stacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class SunsetViewsTest {

    @Test
    public void testSunsetViews() {
        int[] input = {3, 5, 4, 4, 3, 1, 3, 2};
        var app = new SunsetViews();
        var result = app.sunsetViews(input, "EAST");
        System.out.println(result);
    }

    @Test
    public void testSunsetViews2() {
        int[] input = {3, 5, 4, 4, 3, 1, 3, 2};
        var app = new SunsetViews();
        var result = app.sunsetViews(input, "WEST");
        System.out.println(result);
    }

    @Test
    public void testSunsetViews3() {
        int[] input = {};
        var app = new SunsetViews();
        var result = app.sunsetViews(input, "EAST");
        System.out.println(result);
    }

}