package com.psh.leetcode.amazon;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheKthFactorOfNTest {

    @Test
    public void test01() {
        var app = new TheKthFactorOfN();
        System.out.println(app.kthFactor(12, 3));;
        System.out.println(app.kthFactor(4, 3));;
    }

    @Test
    public void test02() {
        var app = new TheKthFactorOfN();
        System.out.println(app.kthFactor(4, 3));;
    }

}