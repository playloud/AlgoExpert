package com.psh.algoexpert.recursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class AmbiguousMeasurements {

    boolean globalResult = false;
    public boolean ambiguousMeasurements(int[][] measuringCups, int low, int high) {
        globalResult = false;
        var cache = new HashSet<String>();
        mySol(measuringCups, 0, 0, low, high, cache);
        return globalResult;
    }

    public void mySol(int[][] measures, int low, int high, int targetLow, int targetHigh, HashSet<String> cache) {
        if(globalResult) return;

        String k = String.format("%d_%d", low, high);


        if(cache.contains(k)) return;
        cache.add(k);
        System.out.println(k);

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
