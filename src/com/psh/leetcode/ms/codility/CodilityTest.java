package com.psh.leetcode.ms.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// PSH 06/15/22 : for ms test
public class CodilityTest {

    public int solution(int n) {
        long result = 0;

        // n to string
        String nStr = n+"";
        char[] carr = nStr.toCharArray();


        var myList = new ArrayList<Integer>();
        for (char c : carr) {
            myList.add(Integer.parseInt(c+""));
        }
        myList.sort(Comparator.reverseOrder());
        var buf = new StringBuffer();
        for (Integer integer : myList) {
            buf.append(integer);
        }

        result = Long.parseLong(buf.toString());
        if(result > Integer.MAX_VALUE) return -1;
        return (int)result;
    }

    public int solution_demo(int[] arr) {
        Arrays.sort(arr);

        if (1 < arr[0]) return 1;
        if (arr[arr.length - 1] < 0) return 1;

        int prev = -1;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                prev = arr[i];
            } else {
                int cur = arr[i];
                if ((cur - prev) > 1) {
                    if (prev + 1 > 0) {
                        return (prev + 1);
                    }
                }
                prev = arr[i];
            }
        }

        return arr[arr.length - 1] + 1;
    }


}
