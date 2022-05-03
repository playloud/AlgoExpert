package com.psh.algoexpert.sorting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RadixSortTest {

    @Test
    public void testGetDigit() {
        var app = new RadixSort();
        System.out.println(app.getDigit(9, 0));
    }

    @Test
    public void testRadixSort() {
        var arrList = new ArrayList<Integer>();
        arrList.addAll(Arrays.asList(8762, 654, 3008, 345, 87, 65, 234, 12, 2));
        var app = new RadixSort();
        var result = app.radixSort(arrList);
        System.out.println(result);
    }

    @Test
    public void testRadixSort2() {
        var arrList = new ArrayList<Integer>();
        arrList.addAll(Arrays.asList(10000, 0, 100001, 10001, 1, 10, 11, 100, 10101, 101));
        var app = new RadixSort();
        var result = app.radixSort(arrList);
        System.out.println(result);
    }

}