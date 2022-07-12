package com.psh.leetcode.citrix;

//https://leetcode.com/problems/minimum-suffix-flips/
//Runtime: 9 ms, faster than 54.62% of Java online submissions for Minimum Suffix Flips.
//Memory Usage: 47.7 MB, less than 19.75% of Java online submissions for Minimum Suffix Flips.
public class MinimumSuffixFlips {

    public int minFlips(String target) {
        int result = 0;
        // check groups
        char[] arr = target.toCharArray();
        int gcount = 0;

        boolean isStart1 = false;
        boolean isZeroEnd = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                if ((i >= 1 && arr[i - 1] == '0') || i == 0) {
                    gcount++;
                }
                if (i == 0 && arr[i] == '1') isStart1 = true;
            }
        }

        if (gcount == 1 && isStart1) {
            return 2;
        } else if (gcount == 1)
            return 1;

        if (arr[arr.length - 1] == '0') isZeroEnd = true;

        if (isZeroEnd) {
            if (gcount == 0) return 0;
            return gcount * 2;
        } else {
            return gcount * 2 - 1;
        }
    }
}
