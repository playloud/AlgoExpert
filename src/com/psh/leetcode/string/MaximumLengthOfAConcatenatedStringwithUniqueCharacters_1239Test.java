package com.psh.leetcode.string;

import org.junit.Test;

import java.util.Arrays;

public class MaximumLengthOfAConcatenatedStringwithUniqueCharacters_1239Test {
    @Test
    public void testMaxLength() {
        var myList = Arrays.asList("cha","r","act","ers");
        var app = new MaximumLengthOfAConcatenatedStringwithUniqueCharacters_1239();
        var result = app.maxLength(myList);
        System.out.println(result);
    }

    @Test
    public void testMaxLength2() {
        var myList = Arrays.asList("abcd");
        var app = new MaximumLengthOfAConcatenatedStringwithUniqueCharacters_1239();
        var result = app.maxLength_notWork(myList);
        System.out.println(result);
    }

    @Test
    public void testMaxLength3() {
        var myList = Arrays.asList("aa", "bb");
        var app = new MaximumLengthOfAConcatenatedStringwithUniqueCharacters_1239();
        var result = app.maxLength(myList);
        System.out.println(result);
    }

    @Test
    public void testMaxLength4() {
        var myList = Arrays.asList("a", "b", "c", "d", "e");
        var app = new MaximumLengthOfAConcatenatedStringwithUniqueCharacters_1239();
        var result = app.maxLength(myList);
        System.out.println(result);
    }

    @Test
    public void testMaxLength5() {
        var myList = Arrays.asList("a", "abc", "d", "de", "def");
        var app = new MaximumLengthOfAConcatenatedStringwithUniqueCharacters_1239();
        var result = app.maxLength(myList);
        System.out.println(result);
    }

}