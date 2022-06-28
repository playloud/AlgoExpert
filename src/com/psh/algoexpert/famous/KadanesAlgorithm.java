package com.psh.algoexpert.famous;

public class KadanesAlgorithm {

    public static int kadanesAlgorithm(int[] array) {

        if(array == null || array.length == 0) return 0;

        int curSum = 0; // maxSum so far
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            curSum += value;
            if (maxSum < curSum) maxSum = curSum;// this should be first
            if(curSum < 0) curSum = 0;
        }

        return maxSum;

    }
}
