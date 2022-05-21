package com.psh.leetcode.string;

import java.util.ArrayList;

public class LongestHappyString {

    String longStr = null;
    int longestSize = 0;
    public String longestHappyString(int a, int b, int c) {
        var buf = new StringBuffer();
        longestSize = 0;
        longStr = null;
        buildStr(a,b,c, buf);
        return longStr;
    }

    public void buildStr(int a, int b, int c, StringBuffer history) {

        if(longestSize < history.length()) {
            longestSize = history.length();
            longStr = history.toString();
        }

        if(a > 0) {
            if(!(history.length() >= 2 && history.charAt(history.length()-1) == 'a' && history.charAt(history.length()-2) == 'a')){
                history.append('a');
                buildStr((a-1), b, c, history);
                history.deleteCharAt(history.length()-1);
            }
        }

        if(b > 0) {
            if(history.length() >= 2 && history.charAt(history.length()-1) == 'b' && history.charAt(history.length()-2) == 'b'){
                // dont
            } else {
                history.append('b');
                buildStr(a, b-1, c, history);
                history.deleteCharAt(history.length()-1);
            }
        }

        if(c > 0) {
            if(history.length() >= 2 && history.charAt(history.length()-1) == 'c' && history.charAt(history.length()-2) == 'c'){
                // dont
            } else {
                history.append('c');
                buildStr(a, b, c-1, history);
                history.deleteCharAt(history.length()-1);
            }
        }
    }



}
