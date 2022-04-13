package com.psh.algoexpert.dp;

import java.util.*;

public class MinNumberOfJumps {
    public static int minNumberOfJumps(int[] array) {
        int result = 0;
        int curIndex = 0;
        int tempMax = Integer.MIN_VALUE;
        int tempMaxIndex = -1;

        while(curIndex < array.length) {
            int value = array[curIndex];
            tempMax = Integer.MIN_VALUE;

            if( array.length <= curIndex+1+value ) {
                if(curIndex != array.length-1) {
                    result++;
                }
                break;
            }

            // finding maximum values
            for (int i = curIndex+1; i < (curIndex+1+value) ; i++) {
                if(0 < tempMax)
                    --tempMax;
                if(tempMax<0) tempMax = 0;
                // find maxValue
                if(tempMax <= array[i]) {
                    tempMax = array[i];
                    tempMaxIndex = i;
                }
            }
            result++;
            curIndex = tempMaxIndex;

        }

        return result;
    }

}
