package com.psh.algoexpert.arrays;

import java.util.HashSet;

public class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {

        int[] result = new int[2];
        var myset = new HashSet<Integer>();
        for (int i : array) {
            if(!myset.contains(i))
                myset.add(i);
        }
        for (int num : array) {
             int pair = targetSum - num;
             if ( pair != num && myset.contains(pair)) {
                 result[0] = num;
                 result[1] = pair;
                 return result;
             }
        }
        int[] empty = {};
        return empty;
    }

}
