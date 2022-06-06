package com.psh.leetcode.amazon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReorganizeStringTest {

    @Test
    public void testReorgaStr01() {
        var app = new ReorganizeString();
        var result = app.reorganizeString("aab");
        System.out.println(result);
    }

    @Test
    public void testReorgaStr02() {
        var app = new ReorganizeString();
        String input = "aabbbbccb";
        var result = app.reorganizeString(input);
        Assert.assertEquals(result.length(), input.length());
        System.out.println(result);
    }

}