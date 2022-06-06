package com.psh.leetcode.amazon;
//https://leetcode.com/problems/the-kth-factor-of-n/
import java.util.*;
public class TheKthFactorOfN {

    public int kthFactor(int n, int k) {
        var arr = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if(n%i == 0) {
                arr.add(i);
            }
        }

        if(arr.size() < (k))
            return -1;

        return arr.get(k-1);
    }
}
