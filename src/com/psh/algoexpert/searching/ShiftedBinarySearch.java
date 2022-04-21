package com.psh.algoexpert.searching;

public class ShiftedBinarySearch {

    static int result = -1;
    public static int shiftedBinarySearch(int[] array, int target) {
        result = -1;
        mySol(0, array.length-1, array, target);
        return result;
    }

    public static void mySol(int l, int r, int[] src, int target) {
        if(result >= 0) return;
        if(r<l) return;
        if(l == r) {
            if(src[r] == target)
                result = r;
            return;
        }

        int lVal = src[l];
        int rVal = src[r];
        int m = (l+r)/2;
        int mVal = src[m];

        if(mVal == target) {
            result = m;
            return;
        }

        // check left part
        // identify broken part
        if(lVal <= mVal) {
            if(lVal<= target && target < mVal) {
                mySol(l, m-1, src, target);
            } else {
                mySol(m+1, r, src, target);
            }
        }

        if(mVal <= rVal) {
            if(mVal <= target && target < rVal) {
                mySol(m+1, r, src, target);
            } else {
                mySol(l, m-1, src, target);
            }
        }
    }


}
