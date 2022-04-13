package com.psh.algoexpert.arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class SubarraySort {

    public static int[] subarraySort(int[] array) {
        var result = new int[2];
        int minLeft = Integer.MAX_VALUE;
        int maxRight = Integer.MIN_VALUE;

        var arr = new LinkedList<Integer>();
        for (int i : array) {
            arr.add(i);
        }

        for (int i = 0; i < arr.size()-1; i++) {
            int cur = arr.get(i);
            int next = arr.get(i+1);

            // rule breaker : i+1
            if(next < cur) {
                for (int j = i; ; j--) {
                    if(j==-1) { // this is better to backword check
                        arr.add(0, arr.remove(i+1)); // replacing
                        if( j+1 < minLeft) minLeft = 0;
                        if(maxRight < i+1) maxRight = i+1;
                        System.out.println(arr);
                        break;
                    }

                    if(arr.get(j) <= arr.get(i+1)) {
                        arr.add(j+1, arr.remove(i+1)); // replacing
                        if( j+1 < minLeft) minLeft = j+1;
                        if(maxRight < i+1) maxRight = i+1;
                        System.out.println(arr);
                        break;
                    }
                }
            }
        }
        System.out.println(arr);
        System.out.println(minLeft+","+maxRight);
        if(minLeft == Integer.MAX_VALUE) minLeft = -1;
        if(maxRight == Integer.MIN_VALUE) maxRight = -1;
        result[0] = minLeft;
        result[1] = maxRight;
        return result;
    }

}
