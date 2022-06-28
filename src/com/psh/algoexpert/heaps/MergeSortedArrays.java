package com.psh.algoexpert.heaps;
import java.util.*;
public class MergeSortedArrays {
    // PSH 06/11/22 : working good
    public static List<Integer> mergeSortedArrays(List<List<Integer>> arrays) {
        var myPQ = new PriorityQueue<Integer>();
        var result = new ArrayList<Integer>();

        int arrCount = arrays.size();
        boolean isAllFilled = true;
        int min = 0;
        while (isAllFilled) {
            min = Integer.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < arrCount; i++) {

                var list = arrays.get(i);
                if(list.size() == 0) continue;

                min = Math.min(min, list.get(0));
                if(min == list.get(0))
                    index = i;
            }

            if(index == -1) {
                isAllFilled = false;
            } else {
                result.add(min);
                arrays.get(index).remove(0);
            }
        }

        return result;
    }

    public static List<Integer> mergeSortedArrays_firstTry(List<List<Integer>> arrays) {
        var myPQ = new PriorityQueue<Integer>();
        var result = new ArrayList<Integer>();
        for (List<Integer> array : arrays) {
            for (Integer integer : array) {
                myPQ.add(integer);
            }
        }
        while(myPQ.size() > 0) {
            result.add(myPQ.remove());
        }
        return result;
    }
}
