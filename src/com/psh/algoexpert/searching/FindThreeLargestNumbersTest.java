package com.psh.algoexpert.searching;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class FindThreeLargestNumbersTest {
    @Test
    public void testFindThree() {
        int size = 4;
        int[] arr = new int[size];
        var rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
        }

        // print out created arr
//        for (int e : arr) {
//            System.out.print(e+" ");
//        }
//        System.out.println();


        var target = FindThreeLargestNumbers.findThreeLargestNumbers(arr);

        Arrays.sort(arr);

        for (int e : arr) {
            System.out.print(e+" ");
        }
        System.out.println();

        for (int e : target) {
            System.out.print(e+" ");
        }
        System.out.println();




//        Assert.assertEquals(arr[arr.length-1], target[0]);
//        Assert.assertEquals(arr[arr.length-2], target[1]);
//        Assert.assertEquals(arr[arr.length-3], target[2]);
    }


}