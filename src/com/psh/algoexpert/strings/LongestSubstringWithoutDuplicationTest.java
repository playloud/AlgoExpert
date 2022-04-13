package com.psh.algoexpert.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutDuplicationTest {
    @Test
    public void testLongestSubstr01() {
        String input = "clementisacap";
        var result = LongestSubstringWithoutDuplication.longestSubstringWithoutDuplication(input);
        System.out.println(result);
    }

    @Test
    public void testLongestSubstr02() {
        String input = "abacacacaaabacaaaeaaafa";
        var result = LongestSubstringWithoutDuplication.longestSubstringWithoutDuplication(input);
        System.out.println(result);
    }

}