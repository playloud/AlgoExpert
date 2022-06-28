package com.psh.leetcode.ms.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodilityTest2Test {

    @Test
    public void test01() {
        var app = new CodilityTest2();
        int[] input = {1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2};
        var result = app.solution(input);
        System.out.println(result);
    }

    @Test
    public void test02() {
        var app = new CodilityTest2();
        int[] input = {5, 0, 3};
        var result = app.solution(input);
        System.out.println(result);
        //8 expects
    }

    @Test
    public void test02_1() {
        var app = new CodilityTest2();
        int[] input = {5, 0, 3, 2};
        var result = app.solution(input);
        System.out.println(result);
    }

    @Test
    public void test02_2() {
        var app = new CodilityTest2();
        int[] input = {5, 8};
        var result = app.solution(input);
        System.out.println(result);
    }

    @Test
    public void test02_3() {
        var app = new CodilityTest2();
        int[] input = {1, 1, 1, 1};
        var result = app.solution(input);
        System.out.println(result);
    }

    @Test
    public void test02_4() {
        var app = new CodilityTest2();
        int[] input = {1, 1, 1, 1};
        var result = app.solution(input);
        System.out.println(result);
    }

    @Test
    public void test03() {
        var app = new CodilityTest2();
        int[] input = {1, 4, 3, 2, 3, 1};
        var result = app.solution(input);
        System.out.println(result);
    }

    @Test
    public void test04() {
        var app = new CodilityTest2();
        int[] input = {4, 1, 2, 1, 2, 2};
        var result = app.solution(input);
        System.out.println(result);
    }

}