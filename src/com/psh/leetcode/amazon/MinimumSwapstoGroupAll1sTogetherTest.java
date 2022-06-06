package com.psh.leetcode.amazon;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSwapstoGroupAll1sTogetherTest {
    @Test
    public void test01() {
        var app = new MinimumSwapstoGroupAll1sTogether();
        int [] data = {1,0,1,0,1};
        int result = app.minSwaps(data);
        System.out.println(result);
    }

    @Test
    public void test02() {
        var app = new MinimumSwapstoGroupAll1sTogether();
        int [] data = {1,0,1,0,1,0,0,1,1,0,1};
        int result = app.minSwaps(data);
        System.out.println(result);
    }

    @Test
    public void test03() {
        var app = new MinimumSwapstoGroupAll1sTogether();
        int [] data = {1,0,0,0,1,1};
        int result = app.minSwaps(data);
        System.out.println(result);
    }

    @Test
    public void test04() {
        var app = new MinimumSwapstoGroupAll1sTogether();
        int [] data = {1,1,1,1,0,1,0,1,1,1,1,0,1,0,0,1,1,0,0,0,1,0,0,1,1,1,0,0,1,0,0,0,1,1,1,1,1,1,0,1,0,0,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,0,0,0,0,0,1,1,1,0,0,1,0,1,0,1,1,1,0,1,1,1,0,0,0,1,1,0,1,1,1,0,1,0,1,0,0,1,0,1,1,0,0,1,0,0,1,0,1,1,0,0,1,0,0,0,0,0,1,1,1,1,0,0,1,0,0,0,0,0,0,1,0,0,1,0,1,0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,1,1,1,1,1,1,1,1,0,1,1,1,0,0,1,0,1,1,1,0,0,0,0,1,0,0,1,0,0,0,0,0,1,1,0,1,0,0,1,0,1,0,1,0};
        int result = app.minSwaps(data);
        System.out.println(result);
    }

    @Test
    public void test05() {
        var app = new MinimumSwapstoGroupAll1sTogether();
        int [] data = {1,1,0,0,0,1};
        int result = app.minSwaps(data);
        System.out.println(result);
    }

}