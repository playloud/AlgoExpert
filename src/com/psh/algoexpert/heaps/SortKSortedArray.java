package com.psh.algoexpert.heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class SortKSortedArray {

    public int[] sortKSortedArray(int[] array, int k) {

        var result = new ArrayList<Integer>();

        var pq = new PriorityQueue<Integer>(k*2);
        for (int i = 0; i < array.length; i++) {
            if(pq.size() == k) {
                result.add(pq.remove());
            }
            pq.add(array[i]);
        }
        while(pq.size() > 0) {
            result.add(pq.remove());
        }

        int[] resultArr = new int[array.length];
        for (int i = 0; i < result.size(); i++) {
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }
}
