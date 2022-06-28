package com.psh.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordDistanceTest {

    @Test
    public void test1() {
        String[] dicts = {"practice", "makes", "perfect", "coding", "makes"};
        var app = new WordDistance(dicts);
        System.out.println(app.shortest("coding", "practice"));
        System.out.println(app.shortest("makes", "coding"));

    }

}