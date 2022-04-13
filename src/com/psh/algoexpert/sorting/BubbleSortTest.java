package com.psh.algoexpert.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] arr = {3,76,2,4,8,4,1};
        var app = new BubbleSort();
        var result = BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(result));
    }

}