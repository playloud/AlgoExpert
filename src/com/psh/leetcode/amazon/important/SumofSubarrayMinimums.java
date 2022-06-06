package com.psh.leetcode.amazon.important;
//https://leetcode.com/problems/sum-of-subarray-minimums/
//// PSH 05/31/22 : failed
import java.util.*;

public class SumofSubarrayMinimums {
    int sum = 0;

    public int sumSubarrayMins (int[] arr) {

        return sum;
    }

    public int sumSubarrayMins_timeLimit(int[] arr) {
        sum = 0;
        var hist = new HashSet<Integer>();
        int minValue = Integer.MAX_VALUE;
        for (int size = 1; size <= arr.length; size++) {
            for (int i = 0; i < arr.length; i++) {
                hist.clear();
                minValue = Integer.MAX_VALUE;
                //System.out.println("startIndex:"+i);
                search(i, size, arr, hist, minValue);
            }
        }
        return sum;
    }

    public void search(int si, int count, int[] arr, HashSet<Integer> hist, int minNumber) {
        if(si >= arr.length) return;
        for (int i = si; i < arr.length; i++) {
            if(hist.contains(i))
                continue;
            hist.add(i);
            minNumber = Math.min(minNumber, arr[i]);
            // check count
            if(hist.size() == count) {
                //System.out.println(hist);
                sum += minNumber;
                //hist.remove(hist.size()-1);
            } else if(hist.size() < count) {
                search(i+1, count, arr, hist, minNumber);
                //hist.remove(hist.size()-1);
            }
        }
    }

}
