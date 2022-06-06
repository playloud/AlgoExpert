package com.psh.leetcode.weelyContest;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Contest296Test {

    @Test
    public void test01_1() {
        int[] nums = {1, 3, 5, 2, 4, 8, 2, 2};
        var app = new Contest296();
        var result = app.minMaxGame(nums);
        System.out.println(result);
    }

    @Test
    public void test01_2() {
        int[] nums = {};
        var app = new Contest296();
        var result = app.minMaxGame(nums);
        System.out.println(result);
    }

    @Test
    public void test03_1() {
        var app = new Contest296();
        int[] nums = {1, 2};
        int[][] op = {
                {1, 3}, {2, 1}, {3, 2}
        };
        var result = app.arrayChange(nums, op);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test03_2() {
        var app = new Contest296();
        int[] nums = {1, 2, 4, 6};
        int[][] op = {
                {1, 3}, {4,7}, {6,1}
        };
        var result = app.arrayChange(nums, op);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test03_3() {

    }

    @Test
    public void test03_4() {

    }

}