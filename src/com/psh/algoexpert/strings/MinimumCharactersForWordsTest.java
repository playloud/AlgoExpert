package com.psh.algoexpert.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumCharactersForWordsTest {

    @Test
    public void testMinChars() {
        String[] input = {"this", "that", "did", "deed", "them!", "a"};
        var app = new MinimumCharactersForWords();
        var result = app.minimumCharactersForWords(input);
        System.out.println(result);
    }

}