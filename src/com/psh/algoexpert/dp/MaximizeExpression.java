package com.psh.algoexpert.dp;

public class MaximizeExpression {

    //brutal force => simply not an answer
    public int maximizeExpression(int[] array) {

        if(array == null || array.length < 4) {
            return 0;
        }

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length-3; i++) {
            for (int j = i+1; j < array.length-2; j++) {
                for (int k = j+1; k < array.length-1; k++) {
                    for (int l = k+1; l < array.length; l++) {
                        int value = array[i] - array[j]+array[k] - array[l];
                        if(maxValue < value) {
                            maxValue = value;
                        }
                    }
                }
            }
        }
        return maxValue;
    }
}
