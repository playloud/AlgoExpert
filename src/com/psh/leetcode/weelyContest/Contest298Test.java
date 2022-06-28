package com.psh.leetcode.weelyContest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Contest298Test {
    @Test
    public void testchar() {
        int num = 9;
        int k = 3;
        int startI = (num - k) / 10;
        for (int i = startI; i >= 0 ; i--) {
            int curNum = i * 10 + k;
            System.out.println(curNum);
        }
    }


    @Test
    public void test01_1() {

        var app = new Contest298();
        System.out.println(app.greatestLetter("AbCdEfGhIjK"));
    }

    @Test
    public void test01_2() {
        var app = new Contest298();

    }

    @Test
    public void test02_1() {
        var app = new Contest298();
        //System.out.println(app.minimumNumbers(4, 0));
//        System.out.println(app.minimumNumbers(37, 2));
//        System.out.println(app.minimumNumbers(12, 2));
//        System.out.println(app.minimumNumbers(24, 2));
        System.out.println(app.minimumNumbers(3000, 1));
        //System.out.println(app.minimumNumbers(18, 3));
    }

    @Test
    public void test02_2() {
        var app = new Contest298();
    }

    @Test
    public void test03_1() {
        var app = new Contest298();
    }

    @Test
    public void test03_2() {
        var app = new Contest298();
    }

}