package com.psh.leetcode;

import java.util.*;

public class OneEditDistance {

    public boolean isOneEditDistance(String s, String t) {

        if (s == null && t == null) return true;


        if (s.length() == t.length()) {
            // if same length simply check one diff
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();
            int diffCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (arr1[i] != arr2[i]) diffCount++;
            }
            if (diffCount == 1) return true;
            else return false;
        } else {
            String small = null, large = null;
            if (s.length() < t.length()) {
                small = s;
                large = t;
            } else {
                small = t;
                large = s;
            }

            if(Math.abs(t.length() - s.length()) != 1) {
                return false;
            }

            char[] sarr = small.toCharArray();
            char[] larr = large.toCharArray();

            int si = 0, li = 0;
            while (si < sarr.length) {
                boolean isFound = false;
                char sc = sarr[si];
                for (int j = li; j < larr.length; j++) {
                    if (sc == larr[j]) {
                        li = j;
                        isFound = true;
                    }
                }
                if (isFound) {
                    si++;
                    li++;
                } else {
                    System.out.println(String.format("cannot find %c", sc));
                    return false;
                }
            }
        }
        return true;
    }

}
