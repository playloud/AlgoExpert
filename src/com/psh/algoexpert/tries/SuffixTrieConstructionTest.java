package com.psh.algoexpert.tries;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuffixTrieConstructionTest {

    @Test
    public void testSuffixTrieConstruction() {
        String input = "afesfei";
        var root = new SuffixTrieConstruction.SuffixTrie(input);
        System.out.println(root.contains("afes"));

    }

}