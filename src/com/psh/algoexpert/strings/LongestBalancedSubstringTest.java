package com.psh.algoexpert.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestBalancedSubstringTest {
    @Test
    public void testLongestBalanced() {
        String input = "(()))(";
        var app = new LongestBalancedSubstring();
        int result = app.longestBalancedSubstring(input);
        System.out.println(result);
    }

    @Test
    public void testLongestBalanced2() {
        String input = "())()(()())";
        var app = new LongestBalancedSubstring();
        int result = app.longestBalancedSubstring(input);
        System.out.println(result);
    }

    @Test
    public void testLongestBalanced3() {
        String input = "))())(())((())(())((";
        var app = new LongestBalancedSubstring();
        int result = app.longestBalancedSubstring(input);
        System.out.println(result);
    }

}