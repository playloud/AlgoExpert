package com.psh.algoexpert.sorting;

import java.util.ArrayList;
import java.util.HashMap;

public class ThreeNumberSort {

    public int[] threeNumberSort(int[] array, int[] order) {

        int num0Cnt = 0;
        int num1Cnt = 0;
        int num2Cnt = 0;

        for (int n : array) {
            if(order[0] == n) num0Cnt++;
            if(order[1] == n) num1Cnt++;
            if(order[2] == n) num2Cnt++;
        }

        int index = 0;
        for (int i = 0; i < num0Cnt; i++) {
            array[index] = order[0];
            index++;
        }
        for (int i = 0; i < num1Cnt; i++) {
            array[index] = order[1];
            index++;
        }
        for (int i = 0; i < num2Cnt; i++) {
            array[index] = order[2];
            index++;
        }
        return array;
    }


    public int[] threeNumberSort_wrong(int[] array, int[] order) {

        var map = new HashMap<Integer, Integer>();
        var result = new ArrayList<Integer>();
        for (int i : order) {
            map.put(i, 0);
        }

        for (int v : array) {
            if(map.containsKey(v)) {
                var count = map.get(v);
                count++;
                map.put(v, count);
            }
        }

        for (Integer key : map.keySet()) {
            int count = map.get(key);
            for (int i = 0; i < count; i++) {
                result.add(key);
            }
        }

        return result.stream().mapToInt(i->i).toArray();
    }

}
