package com.psh.algoexpert.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {
    @Test
    public void testLongestPaln() {
        String input = "avexuioppoiussff";
        var result = LongestPalindromicSubstring.longestPalindromicSubstring(input);
        System.out.println(result);

    }

    @Test
    public void testLongestPaln2() {
        String input = "ac";
        var result = LongestPalindromicSubstring.longestPalindromicSubstring(input);
        System.out.println(result);

    }

}