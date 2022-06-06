package com.psh.leetcode.amazon;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AsteroidCollisionTest {
    @Test
    public void test01 (){
        int[] ast = {5, 10, -5};
        var app = new AsteroidCollision();
        var result = app.asteroidCollision(ast);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test02 (){
        int[] ast = {1, -1, 2, 3, -5, 22};
        var app = new AsteroidCollision();
        var result = app.asteroidCollision(ast);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test03 (){
        int[] ast = {1, -1, 2, 3, -5, 22};
        var app = new AsteroidCollision();
        var result = app.asteroidCollision(ast);
        System.out.println(Arrays.toString(result));
    }

}