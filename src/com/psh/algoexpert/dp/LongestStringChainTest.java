package com.psh.algoexpert.dp;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LongestStringChainTest {

    @Test
    public void testLongestChain() {
        var input = Arrays.asList("abde", "abc", "abd", "abcde", "ade", "ae", "1abde", "abcdef");
        var result = LongestStringChain.longestStringChain(input);
        System.out.println(result);
    }

}