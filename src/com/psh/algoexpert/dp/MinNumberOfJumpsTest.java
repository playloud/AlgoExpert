package com.psh.algoexpert.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinNumberOfJumpsTest {

    @Test
    public void testMinNumberOfJumps() {
        int[] arr = {3, 4, 2, 1, 2, 3, 7, 1, 1, 1, 3};
        var result = MinNumberOfJumps.minNumberOfJumps(arr);
        System.out.println(result);
    }

    @Test
    public void testMinNumberOfJumps02() {
        int[] arr = {1};
        var result = MinNumberOfJumps.minNumberOfJumps(arr);
        System.out.println(result);
    }

    @Test
    public void testMinNumberOfJumps03() {
        int[] arr = {3,1};
        var result = MinNumberOfJumps.minNumberOfJumps(arr);
        System.out.println(result);
    }

    @Test
    public void testMinNumberOfJumps04() {
        int[] arr = {3, 4, 2, 1, 2, 3, 7, 1, 1, 1, 3, 2, 3, 2, 1, 1, 1, 1};
        var result = MinNumberOfJumps.minNumberOfJumps(arr);
        System.out.println(result);
    }

}