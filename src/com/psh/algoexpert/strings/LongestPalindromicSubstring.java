package com.psh.algoexpert.strings;

public class LongestPalindromicSubstring {
    static int maxSize = 0;
    static String answer = "";
    public static String longestPalindromicSubstring( String str) {
        maxSize = 0;
        answer = "";
        if(str.length() == 1)
            return str;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                checkPaln(i, j, arr, str);
            }
        }

        return answer;
    }

    public static void checkPaln(int i, int j, char[] arr, String src) {
        int size = (j-i+1);
        if(size < maxSize) return;

        int start = i;
        int end = j;
        boolean isPalindron = true;
        while(start < end) {
            if(arr[start] != arr[end]) {
                isPalindron = false;
                break;
            }
            ++start;
            --end;
        }
        if(isPalindron) {
            maxSize = size;
            answer = src.substring(i,j+1);
        }
    }

}
