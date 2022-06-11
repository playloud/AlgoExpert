package com.psh.leetcode.amazon;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequentialDigitsTest {

    @Test
    public void test01() {
        var app = new SequentialDigits();
        app.sequentialDigits(10, 90000000);
    }

    @Test
    public void test02() {
        var app = new SequentialDigits();
        app.sequentialDigits(1000, 13000);
    }

    @Test
    public void test03() {
        var app = new SequentialDigits();
        app.sequentialDigits(10, 1000000000);
    }

    @Test
    public void test04() {
        var app = new SequentialDigits();
        app.sequentialDigits(8511, 23553);
    }

}