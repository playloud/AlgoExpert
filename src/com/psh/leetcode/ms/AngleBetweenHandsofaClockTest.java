package com.psh.leetcode.ms;

import org.junit.Test;

import static org.junit.Assert.*;

public class AngleBetweenHandsofaClockTest {

    @Test
    public void testAngle() {
        var app = new AngleBetweenHandsofaClock();
        System.out.println(app.angleClock(3, 15));
        System.out.println(app.angleClock(12, 30));
        System.out.println(app.angleClock(3, 30));
    }

}