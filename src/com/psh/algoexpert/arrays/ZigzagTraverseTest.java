package com.psh.algoexpert.arrays;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ZigzagTraverseTest {

    @Test
    public void testZigzag() {
        var input = new ArrayList<List<Integer>>();
        input.add(Arrays.asList(1, 3, 4, 10));
        input.add(Arrays.asList(2, 5, 9, 11));
        input.add(Arrays.asList(6, 8, 12, 15));
        input.add(Arrays.asList(7, 13, 14, 16));

        var result = ZigzagTraverse.zigzagTraverse(input);
        System.out.println(result);

    }

}