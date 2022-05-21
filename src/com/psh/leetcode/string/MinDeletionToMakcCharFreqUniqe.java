package com.psh.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;

public class MinDeletionToMakcCharFreqUniqe {

    public int minDeletions(String s) {
        int dCount = 0;
        var cntArr = new HashMap<Integer, ArrayList<Character>>();
        var chLength = new HashMap<Character, Integer>();

        // build two hash maps
        char[] arr = s.toCharArray();

        // chLength=> char : count
        for (char c : arr) {
            if(!chLength.containsKey(c))
                chLength.put(c, 0);
            chLength.put(c, chLength.get(c)+1);
        }

        // cntArr=> count : char (list)
        for (Character c : chLength.keySet()) {
            int length = chLength.get(c);
            if(!cntArr.containsKey(length)) {
                cntArr.put(length, new ArrayList<Character>());
            }
            cntArr.get(length).add(c);
        }

        boolean isAllClear = false;
        while(true) {
            isAllClear = true;
            for (Integer count : cntArr.keySet()) {
                if(cntArr.get(count).size() > 1) {
                    isAllClear = false;
                    int oldCount = count;
                    char chToUpdate = cntArr.get(count).get(0);
                    int newCount = chLength.get(chToUpdate) -1;

                    dCount++;
                    cntArr.get(oldCount).remove(0);

                    if(newCount > 0) {
                        chLength.put(chToUpdate, newCount);
                        if(!cntArr.containsKey(newCount))
                            cntArr.put(newCount, new ArrayList<Character>());
                        cntArr.get(newCount).add(chToUpdate);
                    } else {
                        chLength.remove(chToUpdate);
                    }
                    break;
                }
            }

            if(isAllClear) {
                break;
            }
        }

        return dCount;
    }

}
