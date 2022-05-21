package com.psh.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlipStringToMonitonIncreasingTest {

    @Test
    public void testMonotone01() {
        var app = new FlipStringToMonitonIncreasing();
        var result = app.minFlipsMonoIncr("00110");
        System.out.println(result);
    }

    @Test
    public void testMonotone02() {
        var app = new FlipStringToMonitonIncreasing();
        var result = app.minFlipsMonoIncr("010110");
        System.out.println(result);
        //2
    }

    @Test
    public void testMonotone03() {
        var app = new FlipStringToMonitonIncreasing();
        var result = app.minFlipsMonoIncr("00011000");
        System.out.println(result);
        // 2
    }

    @Test
    public void testMonotone04() {
        var app = new FlipStringToMonitonIncreasing();
        var result = app.minFlipsMonoIncr("01110");
        System.out.println(result);
        //expects 1
    }

    @Test
    public void testMonotone05() {
        var app = new FlipStringToMonitonIncreasing();
        var result = app.isMonoton("111".toCharArray());
        System.out.println(result);
        //expects 1
    }



}