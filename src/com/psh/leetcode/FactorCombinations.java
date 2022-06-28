package com.psh.leetcode;

import java.util.*;

public class FactorCombinations {
    List<List<Integer>> res;
    Stack<Integer> temp;

    public List<List<Integer>> getFactors(int n) {
        res = new ArrayList<>();
        if (n < 4) {
            return res;
        }
        temp = new Stack<>();
        backtrack(n, 2);
        return res;
    }

    public void backtrack(int n, int index) {
        if (n > 1) {
            if (temp.size() >= 1) {
                temp.add(n);
                res.add(new ArrayList<>(temp));
                temp.pop();
            }
        }

        for (int i = index; i < n / i; i++) {
            if (n % i == 0) {
                temp.add(i);
                backtrack(n / i, i);
                temp.pop();
            }
        }
    }

}
