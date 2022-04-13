package com.psh.algoexpert.recursion;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {
    // Tip: You can use `element instanceof ArrayList`
    // to check whether an item
    // is an array or an integer.
    public static int productSum(List<Object> array) {
        var s = _pSum(array,1);
        return s;
    }

    public static int _pSum(List<Object> arr, int depth) {
        int sum = 0;

        for (Object n : arr) {
            if(n instanceof ArrayList) {
                sum += depth * _pSum((List<Object>) n, (1+depth));
            } else {
                int value = (int) n;
                sum += depth * value;
            }
        }

        return sum;
    }
}
