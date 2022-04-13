package com.psh.algoexpert.strings;

import java.util.ArrayList;

public class ReverseWordsInString {

    public String reverseWordsInString(String string) {

        var resultBuf = new StringBuffer();
        var reverseBuf = new StringBuffer();
        for (int i = string.length()-1; i >= 0; i--) {
            char c = string.charAt(i);
            if(c == ' ') {
                if(reverseBuf.length() > 0) {
                    resultBuf.append(reverseBuf);
                    reverseBuf.delete(0, resultBuf.length());
                }
                resultBuf.append(c);
            } else {
                reverseBuf.insert(0,c);
            }
        }
        if(reverseBuf.length() > 0) {
            resultBuf.append(reverseBuf);
        }
        return resultBuf.toString();
    }
}
