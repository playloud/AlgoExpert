package com.psh.leetcode.string;

import org.junit.Test;

public class LongestHappyString2Test {
    @Test
    public void testLongHappy2() {
        var app = new LongestHappyString2();
        var result = app.longestDiverseString(1,1,7);
        System.out.println(result);
    }

    @Test
    public void testLongHappy2_2() {
        var app = new LongestHappyString2();
        var result = app.longestDiverseString(4,4,3);
        System.out.println(result);
    }

}