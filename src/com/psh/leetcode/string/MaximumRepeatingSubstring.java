package com.psh.leetcode.string;

import java.util.ArrayList;
import java.util.HashSet;

//https://leetcode.com/problems/maximum-repeating-substring/
public class MaximumRepeatingSubstring {
    int maxCount = 0;
    public int maxRepeating(String sequence, String word) {
        maxCount = 0;
        var indice = getIndice(sequence, word);
        var mySet = new HashSet<Integer>(indice);
        for (int i = 0; i < indice.size(); i++) {
            int startIndex = indice.get(i);
            updateMaxCount(startIndex, word.length(), 1, mySet);
        }
        return maxCount;
    }

    public void updateMaxCount(int startIndex, int size, int curCount, HashSet<Integer> indice) {
        if(maxCount < curCount) {
            maxCount = curCount;
        }
        if(indice.contains(startIndex+size)){
            updateMaxCount(startIndex+size, size, curCount+1, indice);
        }
    }

    public ArrayList<Integer> getIndice(String src, String sub) {
        ArrayList<Integer> indice = new ArrayList<>();
        int found = -1;
        while(true) {
            found = src.indexOf(sub, found);
            if(found == -1) break;
            else {
                indice.add(found);
            }
            found++;
        }
        return indice;
    }


}
