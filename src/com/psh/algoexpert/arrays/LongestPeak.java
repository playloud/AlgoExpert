package com.psh.algoexpert.arrays;

import java.util.ArrayList;

public class LongestPeak {

    public static int longestPeak(int[] array) {
        var states = new ArrayList<String>();
        for (int i = 0; i < array.length-1; i++) {
            int cur = array[i];
            int next = array[i+1];

            if(cur < next) {
                states.add("I");
            } else if (cur == next) {
                states.add("S");
            } else {
                states.add("D");
            }
        }
        int maxStreamSize = Integer.MIN_VALUE;

        for (int i = 0; i < states.size()-1; i++) {
            String state = states.get(i);
            String nextState = states.get(i+1);

            if(state == "I" && nextState == "D") {
                //indexFound
                int leftMost = -1;
                int rightMost = -1;

                // go Left
                int peakValue = array[i+1];
                for (int j = i; j >= 0 ; j--) {
                    int value = array[j];
                    if(value >= peakValue) {
                        break;
                    } else {
                        leftMost = j;
                        peakValue = value;
                    }
                }

                // go right
                peakValue = array[i+1];
                rightMost = i+1;
                for (int j = i+2; j < array.length; j++) {
                    int value = array[j];
                    if(value >= peakValue){
                        break;
                    } else {
                        rightMost = j;
                        peakValue = value;
                    }
                }
                int size = (rightMost-leftMost)+1;
                if(maxStreamSize < size) maxStreamSize = size;
            }
        }
        //System.out.println(maxStreamSize);
        if(maxStreamSize == Integer.MIN_VALUE) maxStreamSize = 0;
        return maxStreamSize;
    }
}
