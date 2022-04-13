package com.psh.algoexpert.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LevenshteinDistanceTest {
    @Test
    public void testLevenshtein() {
        var result = LevenshteinDistance.levenshteinDistance("abcsfes", "yabdslekf");
        System.out.println(result);
    }

}