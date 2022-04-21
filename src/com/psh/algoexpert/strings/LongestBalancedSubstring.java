package com.psh.algoexpert.strings;

import java.util.ArrayList;

public class LongestBalancedSubstring {

    public int maxSize = 0;

    // basically check all the substrings
    public int longestBalancedSubstring(String string) {
        maxSize = 0;
        char[] arr = string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            checkSub(i, arr);
        }
        return maxSize;
    }

    public void checkSub(int startIndex, char[] src) {
        int checkingSize = src.length - startIndex;

        int count = 0;
        for (int i = startIndex; i < src.length; i++) {
            char c = src[i];
            if(c == '(')
                count++;
            else if(c == ')') {
                count--;
            }

            // this is the key
            if(count < 0) break;

            // keep updating maxSize
            if(count == 0) {
                int leng = i-startIndex+1;
                if(leng > maxSize) maxSize = leng;
            }
        }
    }


}
