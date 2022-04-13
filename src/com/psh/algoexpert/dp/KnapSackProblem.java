package com.psh.algoexpert.dp;
import com.psh.algoexpert.Util;

import java.util.*;

public class KnapSackProblem {

    static int maxValue = Integer.MIN_VALUE;
    static boolean[] snapShot = null;

    public static List<List<Integer>> knapsackProblem(int[][] items, int capacity) {
        maxValue = Integer.MIN_VALUE;
        snapShot = null;
        var result = new ArrayList<List<Integer>>();
        boolean[] history = new boolean[items.length];
        findOpt(items, history, capacity, 0);

        var maxList = new ArrayList<Integer>();
        if(maxValue == Integer.MIN_VALUE)
            maxValue = 0;
        maxList.add(maxValue);
        var indice = new ArrayList<Integer>();
        if(snapShot != null ) {
            for (int i = 0; i < snapShot.length; i++) {
                if(snapShot[i]) {
                    indice.add(i);
                }
            }
        }

        result.add(maxList);
        result.add(indice);

        return result;
    }

    public static void findOpt(int[][] items, boolean[] history, int remainingWeight, int value) {

        for (int i = 0; i < items.length; i++) {
            if(!history[i]) {

                int currentValue = items[i][0];
                int currentWeight = items[i][1];

                if(currentWeight <= remainingWeight) {
                    history[i] = true;
                    // update weight
                    if(maxValue < (value + currentValue)) {
                        maxValue = (value + currentValue);
                        // save map
                        if(snapShot == null){
                            snapShot = new boolean[items.length];
                        }
                        System.out.println("maxValue:"+maxValue);
                        System.out.println(Arrays.toString(history) +" rWeight"+remainingWeight+ " value:"+value);
                        System.arraycopy(history, 0, snapShot, 0, snapShot.length);
                    }
                    if(remainingWeight - currentWeight > 0)
                        findOpt(items, history, (remainingWeight - currentWeight), (value + currentValue));
                    history[i] = false;
                }
            }
        }
    }
}
