package com.psh.leetcode.amazon;

import org.junit.Test;

import static org.junit.Assert.*;

public class PairsofSongsWithTotalDurationsDivisibleby60Test {

    @Test
    public void testPairOf01() {
        int[] time = {30, 20, 150, 100, 40};
        var app = new PairsofSongsWithTotalDurationsDivisibleby60();
        var result = app.numPairsDivisibleBy60(time);
        System.out.println(result);
    }

    @Test
    public void testPairOf02() {
        int[] time = {60, 60, 60};
        var app = new PairsofSongsWithTotalDurationsDivisibleby60();
        var result = app.numPairsDivisibleBy60(time);
        System.out.println(result);
    }

}