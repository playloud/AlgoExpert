package com.psh.leetcode.amazon;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RangeAdditionTest {

    @Test
    public void testRangeAddtion() {
        int length = 5;
        int[][] updates = {
                {1, 3, 2}, {2, 4, 3}, {0, 2, -2}
        };
        var app = new RangeAddition();
        var result = app.getModifiedArray(length, updates);
        System.out.println(Arrays.toString(result));
    }

}