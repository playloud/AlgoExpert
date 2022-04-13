package com.psh.algoexpert.strings;
import java.util.*;
public class LongestSubstringWithoutDuplication {
    static int maxLength = 0;
    static String maxSub = null;
    public static String longestSubstringWithoutDuplication(String str) {
        maxLength = 0;
        maxSub = null;
        char[] arr = str.toCharArray();
        var sbuf = new StringBuffer();
        var mySet = new HashSet<Character>();
        var ss = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sbuf.delete(0, sbuf.length());
            mySet.clear();

            if((arr.length-i+1) < maxLength )
                break;

            for (int j = i; j < arr.length; j++) {
                char c = arr[j];
                if(mySet.contains(c)) {
                    // update max set
                    if(maxLength < sbuf.length()) {
                        maxLength = sbuf.length();
                        maxSub = sbuf.toString();
                    }
                    break;
                } else {
                    mySet.add(c);
                    sbuf.append(c);
                    if(j==arr.length-1) {
                        if(maxLength < sbuf.length()) {
                            maxLength = sbuf.length();
                            maxSub = sbuf.toString();
                        }
                    }
                }
            }
        }

        return maxSub;
    }
}
