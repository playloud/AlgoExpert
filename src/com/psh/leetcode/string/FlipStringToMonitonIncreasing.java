package com.psh.leetcode.string;
//https://leetcode.com/problems/flip-string-to-monotone-increasing/
public class FlipStringToMonitonIncreasing {
    public int minFlipsMonoIncr(String s) {
        return mySol2(s.toCharArray());
    }

    public int mySol2(char[] arr) {
        int one = 0;
        int flip =0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]=='1')
                one++;
            else
                flip++;
            flip = Math.min(one,flip);
        }
        return flip;
    }

    public int mySol(char[] arr) {

        if(isMonoton(arr))
            return 0;

        int zeroCount = 0;
        int oneCount = 0;

        int firstIndexOne = -1;
        int lastIndexZero = -1;

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if(c=='0') {
                zeroCount++;
                lastIndexZero = i;
            }
            else {
                oneCount++;
                if(firstIndexOne == -1) {
                    firstIndexOne = i;
                }
            }
        }

        if(zeroCount == 0 || oneCount == 0)
            return 0;

        if(oneCount <= zeroCount) {
            if(lastIndexZero == -1)
                lastIndexZero = arr.length-1;
            int inBetweenCnt = 0;
            int inBetOncCnt = 0;
            for (int i = firstIndexOne; i <= lastIndexZero; i++) {
                if(arr[i] == '0')
                    inBetweenCnt++;
                if(arr[i] == '1')
                    inBetOncCnt++;
            }
            return Math.min(inBetweenCnt, inBetOncCnt);
        } else {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == '0') {
                    arr[i] = '1';
                } else {
                    arr[i] = '0';
                }
            }
            return mySol(arr);
        }
    }

    public boolean isMonoton(char[] arr) {

        if(arr.length == 1) return true;

        boolean isChanged = false;
        for (int i = 0; i < arr.length-1; i++) {

            if(arr[i] == '1' && arr[i+1] == '0') return false;

            if(!isChanged && arr[i] != arr[i+1]) {
                isChanged = true;
            } else if(isChanged && arr[i] != arr[i+1]) {
                return false;
            }
        }
        return true;
    }


}
