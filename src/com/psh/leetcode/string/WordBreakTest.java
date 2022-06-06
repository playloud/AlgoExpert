package com.psh.leetcode.string;

import org.junit.Test;

import java.util.Arrays;

public class WordBreakTest {

    @Test
    public void testWordBreak01() {
        var app = new WordBreak();
        var dict = Arrays.asList("a");
        var result = app.wordBreak_old("a", dict);
        System.out.println(result);
    }

    @Test
    public void testWordBreak02() {
        var app = new WordBreak();
        var dict = Arrays.asList("pear","apple","peach");
        var result = app.wordBreak_old("apple", dict);
        System.out.println(result);
    }

    @Test
    public void testWordBreak03() {
        var app = new WordBreak();
        var dict = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        var result = app.wordBreak_old("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", dict);
        System.out.println(result);
    }

    @Test
    public void testWordBreak04() {
        var app = new WordBreak();
        var dict = Arrays.asList("a");
        var result = app.wordBreak("a", dict);
        System.out.println(result);
    }

    @Test
    public void testWordBreak05() {
        var app = new WordBreak();
        var dict = Arrays.asList("pear","apple","peach");
        var result = app.wordBreak("apple", dict);
        System.out.println(result);
    }

    @Test
    public void testWordBreak06() {
        var app = new WordBreak();
        var dict = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        var result = app.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", dict);
        System.out.println(result);
    }

    @Test
    public void testWordBreak07() {
        var app = new WordBreak();
        var dict = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        var result = app.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", dict);
        System.out.println(result);
    }

    @Test
    public void testWordBreak08() {
        var app = new WordBreak();
        var dict = Arrays.asList("car", "ca", "rs");
        var result = app.wordBreak("cars", dict);
        System.out.println(result);
    }

}