package com.psh.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SumofSubarrayRanges {

    public long subArrayRanges(int[] nums) {
        long result = 0;
        result = mySol2(nums);
        return result;
    }

    // this is accepted
    public long mySol2(int[] nums) {
        long result = 0;

        int min, max;
        int preMin, preMax;
        for (int i = 0; i < nums.length; i++) {
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            preMin = 0;
            preMax = 0;
            for (int j = i; j < nums.length; j++) {
                int cur = nums[j];
                if(j == i) {
                    min = cur;
                    max = cur;
                } else {
                    min = Math.min(preMin, cur);
                    max = Math.max(preMax, cur);
                }
                preMin = min;
                preMax = max;
                int temp =Math.abs(max - min);
                //System.out.println(temp);
                result += temp;
            }
        }
        return result;
    }

    public long mySol(int[] nums) {
        long result = 0;

        var maxQ = new PriorityQueue<Integer>(Comparator.reverseOrder());
        var minQ = new PriorityQueue<Integer>();

        for (int i = 0; i < nums.length; i++) {
            maxQ.clear();
            minQ.clear();
            for (int count = 1; count <= nums.length-i; count++) {
                //result += search(i, count, maxQ, minQ, nums);
                result += search2(i, count, nums);
            }
        }
        return result;
    }



    public int search(int si, int count, PriorityQueue<Integer> maxQ, PriorityQueue<Integer> minQ, int[] nums) {
        int r = 0;
        maxQ.clear();
        minQ.clear();
        for (int i = si; i < si+count; i++) {
            maxQ.add(nums[i]);
            minQ.add(nums[i]);
        }
        r = maxQ.peek() - minQ.peek();
        return r;
    }

    //this is better 63/71
    public int search2(int si, int count, int[] nums) {
        if(count == 1) return 0;
        int r = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = si; i < si+count; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        r = max - min;
        return r;
    }

}
