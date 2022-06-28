package com.psh.leetcode.weelyContest;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Contest297Test {

    @Test
    public void test01_1() {
        var app = new Contest297();
        int[][] brackets = {
                {3,50},{7,10},{10,25}
        };
        int income = 10;
        var result = app.calculateTax(brackets, income);
        System.out.println(result);
        //2.65
    }

    @Test
    public void test01_2() {
        var app = new Contest297();
        int[][] brackets = {
                {1,0},{4,25},{5,50}
        };
        int income = 2;
        var result = app.calculateTax(brackets, income);
        System.out.println(result);
        //0.25
    }

    @Test
    public void test01_3() {
        var app = new Contest297();
        int[][] brackets = {
                {2,50}
        };
        int income = 0;
        var result = app.calculateTax(brackets, income);
        System.out.println(result);
        //0
    }

    @Test
    public void test02_1() {
        var app = new Contest297();
        int[][] grid = {
                {5,3},{4,0},{2,1}
        };
        int[][] moveCost = {
                {9,8},{1,5},{10,12},{18,6},{2,4},{14,3}
        };
        var result = app.minPathCost(grid, moveCost);
        System.out.println(result);
        //17
    }

    @Test
    public void test02_2() {
        var app = new Contest297();
        int[][] grid = {
                {5,1,2},{4,0,3}
        };
        int[][] moveCost = {
                {12,10,15},{20,23,8},{21,7,1},{8,1,13},{9,10,25},{5,3,2}
        };
        var result = app.minPathCost(grid, moveCost);
        System.out.println(result);
        //6
    }

    @Test
    public void test02_3() {
        var app = new Contest297();
    }

    @Test
    public void test03_1() {
        var app = new Contest297();
        int[] temp = {6,1,3,2,2,4,1,2};
        Arrays.stream(temp).sorted().forEach(a-> System.out.print(a+" "));

    }

    @Test
    public void test03_2() {
        var app = new Contest297();
    }

    @Test
    public void test03_3() {
        var app = new Contest297();
    }

    @Test
    public void test04_1() {
        var app = new Contest297();

    }

    @Test
    public void test04_2() {
        var app = new Contest297();
    }

    @Test
    public void test04_3() {
        var app = new Contest297();
    }



}