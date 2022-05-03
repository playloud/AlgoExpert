package com.psh.algoexpert.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumAreaRectangleTest {
    @Test
    public void testMinAreaRec() {
        int[][] points = {
                {1, 5},
                {5, 1},
                {4, 2},
                {2, 4},
                {2, 2},
                {1, 2},
                {4, 5},
                {2, 5},
                {-1, -2}
        };
        var app = new MinimumAreaRectangle();
        var result = app.minimumAreaRectangle(points);
        System.out.println(result);
    }

    @Test
    public void testMinAreaRec2() {
        int[][] points = {
                {1, 5},
                {5, 1},
                {4, 2},
                {2, 4},
                {2, 2},
                {1, 2},
                {4, 5},
                {2, 5},
                {-1, -2}
        };
        var app = new MinimumAreaRectangle();
        var result = app.minimumAreaRectangle(points);
        System.out.println(result);
    }

    @Test
    public void testMinAreaRec3() {
        int[][] points = {
                {0, 0},
                {4, 4},
                {8, 8},
                {0, 8},
                {0, 4},
                {6, 0},
                {6, 4}
        };
        var app = new MinimumAreaRectangle();
        var result = app.minimumAreaRectangle(points);
        System.out.println(result);
    }

    @Test
    public void testMinAreaRec4() {
        var p1 = new MinimumAreaRectangle.Point(0,0);
        var p2 = new MinimumAreaRectangle.Point(0,4);
        var p3 = new MinimumAreaRectangle.Point(6,4);
        var p4 = new MinimumAreaRectangle.Point(6,0);

        var app = new MinimumAreaRectangle();
        System.out.println(app.isRectangle(p1, p2, p3, p4));;

    }

    @Test
    public void testMinAreaRec5() {
        int[][] points = {
                {1, 5},
                {5, 1},
                {4, 2},
                {2, 4},
                {2, 2},
                {1, 2},
                {4, 5},
                {2, 5},
                {-1, -2}
        };
        var app = new MinimumAreaRectangle2();
        var result = app.minimumAreaRectangle(points);
        System.out.println(result);
    }

    @Test
    public void testMinAreaRec6() {
        int[][] points = {
                {0, 0},
                {4, 4},
                {8, 8},
                {0, 8},
                {0, 4},
                {6, 0},
                {6, 4}
        };
        var app = new MinimumAreaRectangle2();
        var result = app.minimumAreaRectangle(points);
        System.out.println(result);
    }

}