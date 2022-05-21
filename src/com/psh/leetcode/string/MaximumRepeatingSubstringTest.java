package com.psh.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumRepeatingSubstringTest {

    @Test
    public void testIndice() {
        var app = new MaximumRepeatingSubstring();
        var result = app.getIndice("zzz", "ab");
        System.out.println(result);
    }

    @Test
    public void testMax() {
        var app = new MaximumRepeatingSubstring();
        var result = app.maxRepeating("abcabababcab" , "ab");

        System.out.println(result);
    }

}