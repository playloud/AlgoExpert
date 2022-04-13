package com.psh.algoexpert.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {

    @Test
    public void testLongestCommonSub() {
        String str1 = "zxvvyzw";
        String str2 = "xkykzpw";
        var result = LongestCommonSubsequence.longestCommonSubsequence(str1, str2);
        System.out.println(result);
    }

}