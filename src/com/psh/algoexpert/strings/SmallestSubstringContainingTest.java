package com.psh.algoexpert.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestSubstringContainingTest {

    @Test
    public void testSmallestSub() {
        String big = "abcd$ef$axb$c$";
        String sub = "$$abf";
        var result = SmallestSubstringContaining.smallestSubstringContaining(big, sub);
        System.out.println(result);
    }

    @Test
    public void testSmallestSub2() {
        String big = "abcdef";
        String sub = "fa";
        var result = SmallestSubstringContaining.smallestSubstringContaining(big, sub);
        System.out.println(result);
    }

    @Test
    public void testSmallestSub3() {
        String big = "abcdef";
        String sub = "d";
        var result = SmallestSubstringContaining.smallestSubstringContaining(big, sub);
        System.out.println(result);
    }

    @Test
    public void testSmallestSub4() {
        String big = "abcdefghijklmnopqrstuvwxyz";
        String sub = "aajjttwwxxzz";
        var result = SmallestSubstringContaining.smallestSubstringContaining(big, sub);
        System.out.println(result);
    }

}