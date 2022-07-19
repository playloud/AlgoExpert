package com.psh.hackerrank;

import org.junit.Test;

import java.util.Locale;

public class ClockMove {


    public int calculateS(String src) {
        int result = 0;

        char[] arr = src.toLowerCase().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(i==0) continue;

            char from = arr[i-1];
            char to = arr[i];

            int temp = Math.abs(from-to);
            if(temp > 13) {
                temp = 26 - temp;
            }
            System.out.println(temp+"->");
            result += temp;
        }
        return result;
    }

    @Test
    public void test01() {
        var app = new ClockMove();
//        System.out.println(app.calculateS("abc"));
        System.out.println(app.calculateS("azgb"));
    }

}
