package com.psh.algoexpert.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonitonicArrayTest {

    @Test
    public void testMonotic() {
        int[] arr = {-1, -5, -10, -1100, -1100, -1101};
        var result = MonitonicArray.isMonotonic(arr);
        System.out.println(result);
    }

}