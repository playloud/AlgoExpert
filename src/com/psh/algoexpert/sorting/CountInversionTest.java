package com.psh.algoexpert.sorting;

import org.junit.Test;

public class CountInversionTest {

    @Test
    public void countInversion() {
        var app = new CountInversion();
        int[] arr = {2, 3, 3, 1, 9, 5, 6};
        int result = app.countInversions(arr);
        System.out.println(result);
    }

    @Test
    public void countInversion2() {
        var app = new CountInversion();
        int[] arr = {3,4,1,2};
        int result = app.countInversions(arr);
        System.out.println(result);
    }

    @Test
    public void countInversion3() {
        var app = new CountInversion();
        int[] arr = {};
        int result = app.countInversions(arr);
        System.out.println(result);
    }

}