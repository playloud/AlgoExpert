package com.psh.leetcode.weelyContest;

import java.util.*;

public class Contest299 {


    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (isDiag(i, j, n) && grid[i][j] == 0) return false;
                if (!isDiag(i, j, n) && grid[i][j] != 0) return false;
            }
        }
        return true;
    }

    public boolean isDiag(int i, int j, int n) {
        if (i == j) return true;
        if (j == n - i - 1) return true;
        return false;
    }

    public int countHousePlacements(int n) {
        if (n == 1) return 4;
        int modd = 1000000007;
        double cntA = 1, cntB = 1, prevA, prevB;

        for (int i = 2; i <= n; i++) {
            prevA = cntA;
            prevB = cntB;
            cntB = prevA + prevB;
            cntA = prevB;
        }
        double result = cntB + cntA;
        result = result % modd;
        return (int) (((result) * (result)) % modd);
    }

    //https://leetcode.com/contest/weekly-contest-299/problems/maximum-score-of-spliced-array/
    // PSH 06/26/22 : this is correct
    // twist is here,
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int max = Integer.MIN_VALUE;
        int sum1 = Arrays.stream(nums1).sum();
        int sum2 = Arrays.stream(nums2).sum();
        int[] temp1 = new int[n];
        int[] temp2 = new int[n];

        // try to find the max
        for (int i = 0; i < n; i++) {
            temp1[i] = nums2[i] - nums1[i];
            temp2[i] = nums1[i] - nums2[i];
        }
        // kadane algo to find the max sub
        int cur1 = 0, cur2 = 0;
        int max1_part = 0, max2_part = 0;
        for (int i = 0; i < n; i++) {
            cur1 = Math.max(cur1 + temp1[i], temp1[i]);
            max1_part = Math.max(max1_part, cur1);
            cur2 = Math.max(cur2 + temp2[i], temp2[i]);
            max2_part = Math.max(max2_part, cur2);
        }
        sum1 += max1_part;
        sum2 += max2_part;
        max = Math.max(sum1, sum2);
        return max;
    }


    public int maximumsSplicedArray_timelimit(int[] nums1, int[] nums2) {
        int n = nums1.length;
        ;
        var myMap1 = new HashMap<String, Integer>();
        var myMap2 = new HashMap<String, Integer>();

        int max = Integer.MIN_VALUE;
        int sum1 = Arrays.stream(nums1).sum();
        int sum2 = Arrays.stream(nums2).sum();
        int[] sumMap1 = new int[n];
        int[] sumMap2 = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                if (i == j) {
                    sumMap1[j] = nums1[i];
                    sumMap2[j] = nums2[i];
                } else {
                    sumMap1[j] = sumMap1[j - 1] + nums1[j];
                    sumMap2[j] = sumMap2[j - 1] + nums2[j];
                }

                // now calculate
                // if switch i - j,

                int temp1 = sum1 - sumMap1[j] + sumMap2[j];
                int temp2 = sum2 - sumMap2[j] + sumMap1[j];
                max = Math.max(max, Math.max(temp1, temp2));
            }
        }
        return max;
    }

}
