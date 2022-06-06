package com.psh.leetcode.amazon;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumHealthtoBeatGameTest {
    @Test
    public void MinHealthTest01() {
        int[] damages = {2, 7, 4, 3};
        int armor = 4;
        var app = new MinimumHealthtoBeatGame();
        var result = app.minimumHealth(damages, armor);
        System.out.println(result);
    }

    @Test
    public void MinHealthTest02() {
        int[] damages = {2, 5, 3, 4};
        int armor = 7;
        var app = new MinimumHealthtoBeatGame();
        var result = app.minimumHealth(damages, armor);
        System.out.println(result);
    }

    @Test
    public void MinHealthTest03() {
        int[] damages = {3, 3, 3};
        int armor = 0;
        var app = new MinimumHealthtoBeatGame();
        var result = app.minimumHealth(damages, armor);
        System.out.println(result);
    }

    @Test
    public void MinHealthTest04() {
        int[] damages = {3};
        int armor = 1;
        var app = new MinimumHealthtoBeatGame();
        var result = app.minimumHealth(damages, armor);
        System.out.println(result);
    }

}