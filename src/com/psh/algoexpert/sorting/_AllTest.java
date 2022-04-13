package com.psh.algoexpert.sorting;

import com.psh.algoexpert.Util;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class _AllTest {

    @Test
    public void testThreeNumSort() {
        int[] arr = {1,0,0,-1, -1, 0, 1,1};
        int[] order = {0, 1, -1};
        var app = new ThreeNumberSort();
        var result = app.threeNumberSort(arr,order);
        System.out.println(Arrays.toString(result));

    }

}