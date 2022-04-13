package com.psh.algoexpert.arrays;

import java.util.*;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // order is important
        var arrQueue = new ArrayDeque<Integer>();
        var seqQueue = new ArrayDeque<Integer>();
        for (Integer num : array) {
            arrQueue.push(num);
        }
        for (Integer num : sequence) {
            seqQueue.push(num);
        }

        while(arrQueue.size() > 0 && seqQueue.size() > 0) {
            int num1 = arrQueue.peek();
            int num2 = seqQueue.peek();
            if(num1 == num2) {
                arrQueue.remove();
                seqQueue.remove();
            } else {
                arrQueue.remove();
            }
        }

        if(seqQueue.size() == 0) return true;
        return false;
    }
}
