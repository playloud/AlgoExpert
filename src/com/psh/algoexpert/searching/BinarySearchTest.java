package com.psh.algoexpert.searching;

import com.psh.algoexpert.binarytrees.BranchSums;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testBinSearch() {
        int[] arr = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        for (int i : arr) {
            var result = BinarySearch.binarySearch(arr, i);
            System.out.println(result);
        }
//        var result = BinarySearch.binarySearch(arr, 73);
//        System.out.println(result);
    }

}