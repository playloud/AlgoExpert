package com.psh.leetcode.amazon;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DailiyTemperaturesTest {
    @Test
    public void test01() {
        int[] arr = {73,74,75,71,69,72,76,73};
        var app = new DailiyTemperatures();
        var result = app.dailyTemperatures(arr);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test02() {
        int[] arr = {30,40,50,60};
        var app = new DailiyTemperatures();
        var result = app.dailyTemperatures(arr);
        System.out.println(Arrays.toString(result));
    }

}