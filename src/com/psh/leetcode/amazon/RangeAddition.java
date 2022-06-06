package com.psh.leetcode.amazon;
import java.util.*;
//https://leetcode.com/problems/range-addition/submissions/
// passed
public class RangeAddition{

    public int[] getModifiedArray(int length, int[][] updates) {
        int[] result = new int[length];

        for (int i = 0; i < updates.length; i++) {
            var cur = updates[i];
            int start = cur[0];
            int end = cur[1];
            int value = cur[2];
            for (int j = start; j <= end; j++) {
                result[j] += value;
            }
        }
        return result;
    }
}
