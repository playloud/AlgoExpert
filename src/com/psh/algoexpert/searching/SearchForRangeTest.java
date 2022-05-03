package com.psh.algoexpert.searching;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SearchForRangeTest {
    @Test
    public void testSearchForRange() {
        int[] arr = {0, 1, 21, 33, 45, 45, 45, 45, 45, 45, 61, 71, 73};
        int target = 33;
        var result = SearchForRange.searchForRange(arr, target);
        System.out.println(Arrays.toString(result));
    }

}