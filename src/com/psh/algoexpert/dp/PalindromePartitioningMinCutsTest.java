package com.psh.algoexpert.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePartitioningMinCutsTest {
    @Test
    public void testPalnPart() {
        String input = "noonabbad";
        int result = PalindromePartitioningMinCuts.palindromePartitioningMinCuts(input);
        System.out.println(result);
    }

}