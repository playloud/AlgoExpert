package com.psh.algoexpert.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInStringTest {

    @Test
    public void testReverseWords() {
        String input = "hey common this is it!";
        var app = new ReverseWordsInString();
        var result = app.reverseWordsInString(input);
        System.out.println(result);
    }

    @Test
    public void testReverseWords2() {
        String input = "abc sde  ";
        var app = new ReverseWordsInString();
        var result = app.reverseWordsInString(input);
        System.out.println(result);
    }

}