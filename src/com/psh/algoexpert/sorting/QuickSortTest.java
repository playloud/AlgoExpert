package com.psh.algoexpert.sorting;

import com.psh.algoexpert.Util;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] input = {8, 4, 5, 1, 2, 3, 24, 10};
        var result = QuickSort.quickSort(input);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testQuickSort2() {
        int[] input = {8, 2};
        var result = QuickSort.quickSort(input);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testQuickSort3() {
        int[] input = {1, 2};
        var result = QuickSort.quickSort(input);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testQuickSort4() {
        for (int i = 0; i < 200; i++) {
            var input = Util.generateRand(100, 0, 100);
            var input2 = input.clone();
            System.out.println(Arrays.toString(input));
            var result = QuickSort.quickSort(input);
            System.out.println(Arrays.toString(result));
            Arrays.sort(input2);
            System.out.println(Arrays.toString(input2));
            Assert.assertArrayEquals(input, input2);
        }


    }

    @Test
    public void testQuickSort5() {
        //int[] input = {9, 61, 43, 81, 29, 53, 55, 58, 20, 98};
        //int[] input = {97, 30, 1, 13, 43, 1, 25, 31, 36, 98};
        //int[] input = {75, 37, 82, 52, 86, 37, 95, 34, 70, 15};
        //int[] input = {74, 70, 30, 60, 45, 83, 30, 69, 60, 99};
        int[] input = {75, 64, 58, 39, 22, 19, 70, 70, 50, 11};
        //int[] input = {64, 70, 70, 58};
        var result = QuickSort.quickSort(input);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testQuickSort6() {
        //int[] input = {9, 61, 43, 20, 98};
        //int[] input = {4,5,2,2};
        //int[] input = {2,5,6,3};
//        int[] input = {5, 2, 6, 7};
//        int[] input = {9, 61, 43, 20, 98};
//        int[] input = {9, 61, 43, 20, 98};
        //int[] input = {99, 86, 70, 73, 86};
        int[] input = {58, 64, 59, 25, 29, 39, 91, 9, 82, 56, 47, 16, 41, 93, 26, 58, 78, 96, 35, 26, 87, 78, 94, 39, 35, 70, 13, 30, 50, 81, 14, 99, 2, 81, 75, 62, 48, 48, 52, 86, 93, 67, 92, 26, 77, 0, 79, 12, 69, 42, 57, 15, 21, 44, 0, 61, 29, 61, 9, 19, 57, 3, 8, 25, 92, 21, 21, 73, 74, 63, 71, 2, 59, 10, 32, 99, 68, 18, 52, 79, 85, 46, 19, 29, 24, 86, 42, 13, 24, 30, 30, 84, 26, 98, 56, 10, 58, 74, 56, 42};
        //int[] input = {12, 34, 54, 18, 17, 67, 78, 8, 6, 47, 86, 63, 88, 38, 23, 10, 3, 8, 52, 75, 92, 70, 83, 9, 90, 18, 99, 79, 47, 59, 93, 93, 75, 68, 95, 53, 24, 96, 12, 13, 17, 41, 21, 23, 92, 82, 78, 21, 80, 82, 28, 33, 56, 94, 60, 90, 18, 94, 2, 73, 52, 0, 19, 26, 73, 18, 85, 89, 10, 0};
        var result = QuickSort.quickSort(input);
        System.out.println(Arrays.toString(result));
    }



}