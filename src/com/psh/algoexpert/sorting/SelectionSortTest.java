package com.psh.algoexpert.sorting;

import com.psh.algoexpert.Util;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void testSelectionSort() {
        int[] input = {8,4,5,2,7, 1, 13, 24 ,4};
        var result = SelectionSort.selectionSort(input);
        System.out.println(Arrays.toString(result));

    }

}