package com.psh.algoexpert.dp;
import java.util.*;
public class LongestIncreasingSubseq {
    static int maxSize = 0;
    static ArrayList<Integer> result = new ArrayList<>();
    public static List<Integer> longestIncreasingSubsequence(int[] array) {
        maxSize = 0;
        result = null;
        var subSeq = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            subSeq.clear();
            subSeq.add(array[i]);
            if(maxSize < subSeq.size()) {
                maxSize = subSeq.size();
                result = (ArrayList<Integer>) subSeq.clone();
            }
            mySol( array[i], i+1, subSeq, array);
        }
        return result;
    }

    public static void mySol(int initValue, int startIndex, ArrayList<Integer> subSeq, int[] array) {
        if(startIndex >= array.length) {
            return;
        }
        for (int i = startIndex; i < array.length; i++) {
            if(initValue < array[i]) {
                subSeq.add(array[i]);
                if(maxSize < subSeq.size()) {
                    maxSize = subSeq.size();
                    result = (ArrayList<Integer>) subSeq.clone();
                }
                mySol(array[i], i+1, subSeq, array);
                subSeq.remove(subSeq.size()-1);
            }
        }
    }
}
