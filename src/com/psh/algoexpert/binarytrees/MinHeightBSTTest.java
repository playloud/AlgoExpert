package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MinHeightBSTTest {

    @Test
    public void testMinHeight() {
        var input = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        var result = MinHeightBST.minHeightBst(input);
        System.out.println(result);
    }

    @Test
    public void testMinHeight2() {
        var input = Arrays.asList(1, 2, 3);
        var result = MinHeightBST.minHeightBst(input);
        System.out.println(result);
    }

}