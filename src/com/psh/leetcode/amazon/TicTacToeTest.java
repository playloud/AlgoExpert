package com.psh.leetcode.amazon;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {

    @Test
    public void test01() {
        var app = new TicTacToe(3);
        System.out.println(app.move(0, 0, 1));
        System.out.println(app.move(0, 2, 2));
        System.out.println(app.move(2, 2, 1));
        System.out.println(app.move(1, 1, 2));
        System.out.println(app.move(2, 0, 1));
        System.out.println(app.move(1, 0, 2));
        System.out.println(app.move(2, 1, 1));


    }

    @Test
    public void test02() {
        var app = new TicTacToe(2);
        System.out.println(app.move(0, 0, 2));
        System.out.println(app.move(0, 1, 1));
        System.out.println(app.move(1, 1, 2));

    }

}