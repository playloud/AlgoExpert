package com.psh.algoexpert.recursion;

public class NthFibonacci {


    public static int getNthFib(int n) {
        int result = 0;
        int prev = 0;
        int pprev = 0;
        int cur = 0;
        for (int i = 0; i < n; i++) {

            if(i==1) {
                cur = 1;
            } else {
                cur = prev + pprev;
            }

            //System.out.println(String.format("f%d) => %d", i, cur));
            result = cur;
            // update
            pprev = prev;
            prev = cur;
        }
        return result;
    }
}
