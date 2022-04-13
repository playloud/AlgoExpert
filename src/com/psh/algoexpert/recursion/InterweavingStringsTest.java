package com.psh.algoexpert.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class InterweavingStringsTest {

    @Test
    public void testInterweaving() {
        String one = "algoexpert";
        String two = "your-dream-job";
        String three = "your-algodream-expertjob";
        var result = InterweavingStrings.interweavingStrings(one, two, three);
        System.out.println(result);
    }

    @Test
    public void testInterweaving2() {
        String one = "ab";
        String two = "1234";
        String three = "a1b234";
        var result = InterweavingStrings.interweavingStrings(one, two, three);
        System.out.println(result);
    }

    @Test
    public void testInterweaving3() {
        String one = "aaa";
        String two = "aaa";
        String three = "aaaaaa";
        var result = InterweavingStrings.interweavingStrings(one, two, three);
        System.out.println(result);
    }

}