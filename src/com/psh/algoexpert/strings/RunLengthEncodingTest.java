package com.psh.algoexpert.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class RunLengthEncodingTest {

    @Test
    public void testRunLength() {
        var app = new RunLengthEncoding();
        System.out.println(app.runLengthEncoding("AABBBBBBBBBBBCCC"));
        System.out.println(app.runLengthEncoding("AAAAAAAAABBBBBBBBBBBCCC"));
        System.out.println(app.runLengthEncoding("AAAAAAAAABBBBBBBBBBBC"));
    }

}