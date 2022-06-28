package com.psh.leetcode.weelyContest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Contest299Test {

    @Test
    public void test01_1() {
        var app = new Contest299();
        int[][] grid = {{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}};
        System.out.println(app.checkXMatrix(grid));
    }

    @Test
    public void test01_2() {
        var app = new Contest299();
        int[][] grid = {{5, 7, 0}, {0, 3, 1}, {0, 5, 0}};
        System.out.println(app.checkXMatrix(grid));
    }

    @Test
    public void test02_1() {
        var app = new Contest299();
        int[] nums1 = {60, 60, 60};
        int[] nums2 = {10, 90, 10};
        System.out.println(app.maximumsSplicedArray(nums1, nums2));
    }

    @Test
    public void test02_2() {
        var app = new Contest299();
        int[] nums1 = {20, 40, 20, 70, 30};
        int[] nums2 = {50, 20, 50, 40, 20};
        System.out.println(app.maximumsSplicedArray(nums1, nums2));
    }

    @Test
    public void test02_3() {
        var app = new Contest299();
        int[] nums1 = {7, 11, 13};
        int[] nums2 = {1, 1, 1};
        System.out.println(app.maximumsSplicedArray(nums1, nums2));
    }

}