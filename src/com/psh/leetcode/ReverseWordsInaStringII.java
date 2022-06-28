package com.psh.leetcode;

import java.util.*;
import java.util.Stack;
//https://leetcode.com/problems/reverse-words-in-a-string-ii/
// 99.2% faster!!
public class ReverseWordsInaStringII {

    public void reverseWords(char[] s) {
        mySol(s, 0);
    }

    public int mySol(char[] src, int si) {

        char[] buf = null;
        int ei = si;
        for (int i = si; i < src.length; i++) {
            ei = i;
            if(src[i] == ' ') {
                ei--;
                break;
            }
        }
        int size = ei-si+1;
        buf = new char[size];
        System.arraycopy(src, si, buf, 0, size);

        if(ei == src.length-1) {
            // need to copy for first
            System.arraycopy(buf, 0, src, 0, size);
            return size;
        } else {
            int lastLocation = mySol(src, ei+2);
            src[lastLocation] = ' ';
            System.arraycopy(buf, 0, src, lastLocation+1, size);
            return lastLocation + size + 1;
        }
    }

}
