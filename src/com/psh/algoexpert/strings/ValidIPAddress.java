package com.psh.algoexpert.strings;

import java.util.ArrayList;

public class ValidIPAddress {
    public ArrayList<String> validIPAddresses(String string) {
        var result = new ArrayList<String>();
        char[] arr = string.toCharArray();
        for (int i = 0; i < 3; i++) {
            if(i >= arr.length) continue;
            String token1 = getStr(arr, 0, i);
            if(!isValidIpNum(token1)) continue;

            for (int j = i+1; j < i+4; j++) {
                if(j >= arr.length) continue;
                var token2 = getStr(arr, i+1, j);
                if(!isValidIpNum(token2)) continue;

                for (int k = j+1; k < j + 4; k++) {
                    if(k >= arr.length) continue;
                    var token3 = getStr(arr, j+1, k);
                    if(!isValidIpNum(token3)) continue;

                    for (int l = k+1; l < k + 4; l++) {
                        if(l >= arr.length) continue;
                        var token4 = getStr(arr, k+1, l);
                        if(!isValidIpNum(token4)) continue;
                        if(l != arr.length-1) continue; // KEY POINT, l should touch last index
                        result.add(String.format("%s.%s.%s.%s", token1, token2, token3, token4));
                    }
                }
            }
        }
        return result;
    }

    StringBuffer sbuf = new StringBuffer();
    private String getStr(char[] arr, int from, int to) {
        sbuf.delete(0, sbuf.length());
        for (int i = from; i <= to; i++) {
            sbuf.append(arr[i]);
        }
        return sbuf.toString();
    }

    private boolean isValidIpNum(String token) {
        int value = Integer.parseInt(token);
        if(token.length() != (value+"").length()) return false; // Key Point
        if(value > 255) return false;
        return true;
    }
}
