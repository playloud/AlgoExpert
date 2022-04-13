package com.psh.algoexpert.searching;

public class Quickselect {

    public static int quickselect(int[] array, int k) {
        mySol(0, array.length-1, array);
        return array[k-1];
    }

    public static void mySol(int start, int end, int[] src) {
        if(end < 0) return;
        if(end < start) return;
        if(start == end) return;

        if(end-start == 1) {
            if(src[start] > src[end]){
                swap(start, end, src);
            }
            return;
        }

        int l = start;
        int r = end -1;
        int p = end;
        int pval = src[p];
        while(true) {
            if(l == r) {
                if(src[l] >= src[p]) {
                    swap(l,p,src);
                    p = l;
                    break;
                } else {
                    //continue;
                    l++;
                }
            } else if(src[l] < pval) {
                ++l;
            } else if(src[r] >= pval) {
                --r;
            } else if(src[l] >= pval && src[r] < pval && l < r){
                swap(l,r, src);
            } else if(l == p) {
                break;
            }
        }
        mySol(start, p -1, src);
        mySol(p+1, end, src);
    }

    public static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
