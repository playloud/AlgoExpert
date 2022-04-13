package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SameBSTsTest {
    @Test
    public void testSameBSTs() {
        var arr1 = Arrays.asList(10, 15, 8, 12, 94, 81, 5, 2, 11);
        var arr2 = Arrays.asList(10, 8, 5, 15, 2, 12, 11, 94, 81);
        var result = SameBSTs.mySol(arr1, arr2);
        System.out.println(result);
    }

}