package com.psh.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringwithAtMostTwoDistinctCharactersTest {

    @Test
    public void test01() {
        var app = new LongestSubstringwithAtMostTwoDistinctCharacters();
        var result = app.lengthOfLongestSubstringTwoDistinct("eceba");
        System.out.println(result);
    }

    @Test
    public void test02() {
        var app = new LongestSubstringwithAtMostTwoDistinctCharacters();
        System.out.println(app.lengthOfLongestSubstringTwoDistinct("aac"));
        System.out.println(app.lengthOfLongestSubstringTwoDistinct("aa"));
        System.out.println(app.lengthOfLongestSubstringTwoDistinct("aaaaaaaa"));
        System.out.println(app.lengthOfLongestSubstringTwoDistinct("abacc"));
    }

    @Test
    public void test03() {
        var app = new LongestSubstringwithAtMostTwoDistinctCharacters();
        System.out.println(app.lengthOfLongestSubstringTwoDistinct("abcdd")); // 3
        System.out.println(app.lengthOfLongestSubstringTwoDistinct("aabbcccd")); //5
        System.out.println(app.lengthOfLongestSubstringTwoDistinct("abccdd")); //4
        System.out.println(app.lengthOfLongestSubstringTwoDistinct("ab"));//2
        System.out.println(app.lengthOfLongestSubstringTwoDistinct("abaaad"));//5
        System.out.println(app.lengthOfLongestSubstringTwoDistinct("abaaad"));//5

    }

    @Test
    public void test04() {
        var app = new LongestSubstringwithAtMostTwoDistinctCharacters();
        System.out.println(app.lengthOfLongestSubstringTwoDistinct("abaccc"));
    }

}