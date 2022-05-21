package com.psh.leetcode.string;

import org.junit.Test;

public class LongestHappyStringTest {

    @Test
    public void testLongestHappy() {
        var app = new LongestHappyString();
        var result = app.longestHappyString(1,1,7);
        System.out.println(result);
    }

    @Test
    public void testLongestHappy2() {
        var app = new LongestHappyString();
        var result = app.longestHappyString(7,1,0);
        System.out.println(result);
    }

    @Test
    public void testLongestHappy3() {
//        var app = new LongestHappyString();
//        var result = app.longestHappyString(4,42,7);
//        System.out.println(result);

        var app2 = new LongestHappyString2();
        var result2 = app2.longestDiverseString(4,42,7);
        System.out.println(result2);
    }

    @Test
    public void testLongestHappy4() {
        var app = new LongestHappyString();
        var result = app.longestHappyString(4,42,7);
        System.out.println(result);
    }

}