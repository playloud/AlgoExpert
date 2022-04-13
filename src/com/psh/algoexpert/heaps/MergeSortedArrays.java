package com.psh.algoexpert.heaps;
import java.util.*;
public class MergeSortedArrays {
    public static List<Integer> mergeSortedArrays(List<List<Integer>> arrays) {

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
