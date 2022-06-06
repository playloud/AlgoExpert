package com.psh.leetcode.amazon;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CourseScheduleIITest {

    @Test
    public void test210_00() {
        var app = new CourseScheduleII();
        int[][] input = {
                {1,0},{2,0},{3,1},{3,2}
        };
        var result = app.findOrder(4, input);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test210_01() {
        var app = new CourseScheduleII();
        int[][] input = {
                {1,0}
        };
        var result = app.findOrder(2, input);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test210_02() {
        var app = new CourseScheduleII();
        int[][] input = {
                {1,0}, {0,1}
        };
        var result = app.findOrder(2, input);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test210_03() {
        var app = new CourseScheduleII();
        int[][] input = {
                {0,1}
        };
        var result = app.findOrder(2, input);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test210_04() {
        var app = new CourseScheduleII();
        int[][] input = {
                {0,1}, {1,0}
        };
        var result = app.findOrder(2, input);
        System.out.println(Arrays.toString(result));
    }

}