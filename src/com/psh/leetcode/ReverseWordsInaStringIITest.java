package com.psh.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReverseWordsInaStringIITest {

    @Test
    public void testCopy() {
        char[] temp = {'a','b','c'};
        char[] temp2 = new char[2];


        System.arraycopy(temp, 0, temp2, 0, 2);
    }

    @Test
    public void test01() {
        String input = "this is something okebary";
        var app = new ReverseWordsInaStringII();
        char[] arr = input.toCharArray();
        app.reverseWords(arr);
        System.out.println(Arrays.toString(arr));
    }

}