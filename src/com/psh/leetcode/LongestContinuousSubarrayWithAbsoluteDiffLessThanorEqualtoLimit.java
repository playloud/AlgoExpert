package com.psh.leetcode;
//https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/

import java.util.*;

public class LongestContinuousSubarrayWithAbsoluteDiffLessThanorEqualtoLimit {

    public int longestSubarray(int[] nums, int limit) {
        int result = 0;
        int left = 0, right = 0;

        var minPQ = new PriorityQueue<Integer>(Comparator.naturalOrder());
        var maxPQ = new PriorityQueue<Integer>(Comparator.reverseOrder());

        while (right < nums.length) {

            int cur = nums[right];
            maxPQ.add(cur);
            minPQ.add(cur);

            int curMax = maxPQ.peek();
            int curMin = minPQ.peek();
            if (Math.abs(curMin - curMax) <= limit) {
                result = Math.max(result, (right - left + 1));
            } else {
                // limit is not enough, left needs to move till limit meet
                while (left <= right) {
                    int toDelete = nums[left];
                    left++;
                    //delete from minQ, maxQ;
                    minPQ.remove(toDelete);
                    maxPQ.remove(toDelete);

                    if (Math.abs(maxPQ.peek() - minPQ.peek()) <= limit) {
                        result = Math.max(result, (right - left + 1));
                        break;
                    }
                }
            }
            right++;
        }
        return result;
    }


    public int longestSubarray_notSure(int[] nums, int limit) {
        var biggest = new ArrayDeque<Integer>();
        var smallest = new ArrayDeque<Integer>();
        int n = nums.length;
        int best = 0;
        int left = 0, right = 0;

        while (right < n) {
            int v = nums[right];

            while (biggest.size() > 0 && biggest.peek() < v) {
                biggest.pop();
            }
            biggest.push(v);

            while (smallest.size() > 0 && smallest.peek() > v) {
                smallest.pop();
            }
            smallest.push(v);

            while (biggest.getFirst() - smallest.getFirst() > limit) {
                if (biggest.getFirst() == nums[left]) {
                    biggest.removeFirst();
                }
                if (smallest.getFirst() == nums[left]) {
                    smallest.removeFirst();
                }
                left++;
            }

            best = Math.max(best, right - left + 1);
            right++;
        }
        return best;

    }

}
