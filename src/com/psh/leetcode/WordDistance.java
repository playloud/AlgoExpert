package com.psh.leetcode;
//https://leetcode.com/problems/shortest-word-distance-ii/
//Runtime: 43 ms, faster than 56.21% of Java online submissions for Shortest Word Distance II.
//Memory Usage: 59.4 MB, less than 49.45% of Java online submissions for Shortest Word Distance II.
import java.util.ArrayList;
import java.util.HashMap;

public class WordDistance {

    HashMap<String, ArrayList<Integer>> myMap = new HashMap<>();
    public WordDistance(String[] wordsDict) {
        myMap.clear();
        for (int i = 0; i < wordsDict.length; i++) {
            String cur = wordsDict[i];
            if(!myMap.containsKey(cur)) myMap.put(cur, new ArrayList<>());
            myMap.get(cur).add(i);
        }
    }

    public int shortest(String word1, String word2) {
        var arr1 = myMap.get(word1);
        var arr2 = myMap.get(word2);
        if(arr1 == null || arr2 == null) return -1;

        int min = Integer.MAX_VALUE;
        for (Integer i1 : arr1) {
            for (Integer i2 : arr2) {
                min = Math.min(min, Math.abs(i2-i1));
            }
        }
        return min;
    }
}
