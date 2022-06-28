package com.psh.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class OneEditDistanceTest {

    @Test
    public void test01() {
        var app = new OneEditDistance();
        System.out.println(app.isOneEditDistance("abc", "abcd"));
        System.out.println(app.isOneEditDistance("abc", "adbdc"));
        System.out.println(app.isOneEditDistance("bc", "abc"));
        System.out.println(app.isOneEditDistance("abc", "abd"));
    }

}