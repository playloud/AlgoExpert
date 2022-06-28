package com.psh.leetcode.string;

import org.junit.Test;

import java.util.Arrays;

public class WordBreakTest {

    @Test
    public void test01() {
        var app = new WordBreak();
        var dict = Arrays.asList("apple","pen");
        var result = app.wordBreak_j12NW("applepenapple", dict);
        System.out.println(result);
    }

    @Test
    public void test02() {
        var app = new WordBreak();
        var dict = Arrays.asList("cats","dog","sand","and","cat");
        var result = app.wordBreak_j12NW("catsandog", dict);
        System.out.println(result);
    }

    @Test
    public void test03() {
        var app = new WordBreak();
        var dict = Arrays.asList("car","ca","rs");
        var result = app.wordBreak_j12NW("cars", dict);
        System.out.println(result);
    }

    @Test
    public void testWordBreak01() {
        var app = new WordBreak();
        var dict = Arrays.asList("a");
        var result = app.wordBreak_j12NW("a", dict);
        System.out.println(result);
    }

    @Test
    public void testWordBreak02() {
        var app = new WordBreak();
        var dict = Arrays.asList("pear","apple","peach");
        var result = app.wordBreak_j12NW("apple", dict);
        System.out.println(result);
    }

    @Test
    public void testWordBreak03() {
        var app = new WordBreak();
        var dict = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        var result = app.wordBreak_j12NW("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", dict);
        System.out.println(result);
    }

    @Test
    public void testWordBreak04() {
        var app = new WordBreak();
        var dict = Arrays.asList("a");
        var result = app.wordBreak_notwork("a", dict);
        System.out.println(result);
    }

    @Test
    public void testWordBreak05() {
        var app = new WordBreak();
        var dict = Arrays.asList("pear","apple","peach");
        var result = app.wordBreak_notwork("apple", dict);
        System.out.println(result);
    }

    @Test
    public void testWordBreak06() {
        var app = new WordBreak();
        var dict = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        var result = app.wordBreak_notwork("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", dict);
        System.out.println(result);
    }

    @Test
    public void testWordBreak07() {
        var app = new WordBreak();
        var dict = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        var result = app.wordBreak_notwork("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", dict);
        System.out.println(result);
    }

    @Test
    public void testWordBreak08() {
        var app = new WordBreak();
        var dict = Arrays.asList("car", "ca", "rs");
        var result = app.wordBreak_notwork("cars", dict);
        System.out.println(result);
    }

}