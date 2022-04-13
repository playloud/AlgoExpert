package com.psh.algoexpert.searching;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickselectTest {

    @Test
    public void testQuickselect() {
        int[] arr = {8, 5, 2, 9, 7, 6, 3};
        int k = 3;
        var result = Quickselect.quickselect(arr, k);
        System.out.println(result);
    }

}