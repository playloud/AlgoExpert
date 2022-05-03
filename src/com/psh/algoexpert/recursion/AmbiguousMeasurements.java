package com.psh.algoexpert.recursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class AmbiguousMeasurements {

    boolean globalResult = false;
    public boolean ambiguousMeasurements(int[][] measuringCups, int low, int high) {
        globalResult = false;
        var cache2 = new HashMap<Integer, HashSet<Integer>>();
        mySol(measuringCups, 0, 0, low, high, cache2);
        return globalResult;
    }

    public void mySol(int[][] measures,
                      int low, int high,
                      int targetLow, int targetHigh,
                      HashMap<Integer, HashSet<Integer>> cache) {

        if(globalResult) return;

        if(cache.containsKey(low)){
            if(cache.get(low).contains(high))
                return;
        } else {
            cache.put(low, new HashSet<Integer>());
        }
        cache.get(low).add(high);

        for (int i = 0; i < measures.length; i++) {
            int curLow = measures[i][0];
            int curHigh = measures[i][1];

            int newLow = low + curLow;
            int newHigh = high + curHigh;

            if(targetLow <= newLow && newHigh <= targetHigh) {
                globalResult = true;
            } else {
                if(newHigh > targetHigh) return;
                else mySol(measures, newLow, newHigh, targetLow, targetHigh, cache);
            }
        }
    }
}
