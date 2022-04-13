package com.psh.algoexpert.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ThreeNumberSortTest {

    @Test
    public void testThreeNum() {
        int[] arr = {1, 0, 0, -1, -1, 0, 1, 1};
        int[] order = {0, 1, -1};

        var app = new ThreeNumberSort();
        var result = app.threeNumberSort(arr, order);
        System.out.println(Arrays.toString(result));

    }

}