package com.psh.algoexpert.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnderscoifySubstringTest {

    @Test
    public void testUnderScoiify() {
        var input = "testthis is a testtest to see if testestest it works";
        var sub = "test";
        var result = UnderscoifySubstring.underscorifySubstring(input, sub);
        System.out.println(result);
    }

    @Test
    public void testUnderScoiify2() {
        var input = "testthis is a testtest to see if testestest it works";
        var sub = "a;sldkfjklj";
        var result = UnderscoifySubstring.underscorifySubstring(input, sub);
        System.out.println(result);
    }

}