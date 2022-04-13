package com.psh.algoexpert.searching;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {

        if(array == null || array.length == 0) return -1;

        int s, m, e;
        s = 0;
        e = array.length-1;

        while(true) {
            m = (s+e)/2;

            if(s==e || (e-s)==1){
                if(array[m] == target) return m;
                if(array[e] == target) return e;
                break;
            }
            if(array[m] == target) {
                return m;
            } else if(target < array[m]) {
                e = m;
            } else {
                s = m;
            }
        }

        return -1;
    }
}
