package com.psh.leetcode.ms;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressionTest {
    @Test
    public void test1() {
        var app = new StringCompression();
        String src = "aabbccc";
        char[] input = new char[src.length()];
        for (int i = 0; i < input.length; i++) {
            input[i] = src.charAt(i);
        }
        var result = app.compress(input);
        System.out.println(result);
        System.out.println(input);
    }

    @Test
    public void test2() {
        var app = new StringCompression();
        String src = "aabbbbbbbbbbcccccccccde";
        char[] input = new char[src.length()];
        for (int i = 0; i < input.length; i++) {
            input[i] = src.charAt(i);
        }
        var result = app.compress(input);
        System.out.println(result);
        System.out.println(input);
    }


    @Test
    public void test() {
        var app = new StringCompression();
        String src = "aabbccc";
        char[] input = new char[src.length()];
        for (int i = 0; i < input.length; i++) {
            input[i] = src.charAt(i);
        }
        app.modifyChar(input);
        System.out.println(input);
    }




}