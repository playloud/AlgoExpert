package com.psh.algoexpert.searching;

import java.util.ArrayList;

public class IndexEqualsValue {

    public int indexEqualsValue(int[] array) {
        if(array == null || array.length == 0) return -1;
        var results = new ArrayList<Integer>();
        getIndexValue(array, 0, array.length-1, results);
        if(results.size() == 0) {
            return -1;
        } else {
            return results.get(0);
        }
    }

    public void getIndexValue(int[] src, int left, int right, ArrayList<Integer> result) {

        if(left == right) {
            if(src[left] == left)  result.add(0, left);
            return;
        } else if(left + 1 == right) {
            if(src[left] == left) result.add(0, left);
            else if(src[right] == right) result.add(0, right);
            return;
        }
        int m = (left + right) /2;
        int value = src[m];
        if(src[m] == m) {
            result.add(0, m);
            getIndexValue(src, left, m, result);
        } else if(value < m) {
            getIndexValue(src, m, right, result);
        } else {
            getIndexValue(src, left, m, result);
        }
    }



}
