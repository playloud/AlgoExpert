package com.psh.algoexpert.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonAttackingQueensTest {

    @Test
    public void testNonAttackinqQueen() {
        var app = new NonAttackingQueens();
        int result = app.nonAttackingQueens(10);
        System.out.println(result);
    }

}