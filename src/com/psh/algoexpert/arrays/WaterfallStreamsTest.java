package com.psh.algoexpert.arrays;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class WaterfallStreamsTest {

    @Test
    public void testWaterfallStrea() {
        double[][] arr = {
                {0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int source = 3;

        var app = new WaterfallStreams();
        var result = app.waterfallStreams(arr, source);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testWaterfallStrea2() {
        double[][] arr = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        int source = 8;

        var app = new WaterfallStreams();
        var result = app.waterfallStreams(arr, source);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void printTest() {
        double d = 123.12;
        System.out.println(String.format("%f", d));
        System.out.println(String.format("%.1f", d));
        System.out.println(String.format("%.2f", d));
        System.out.println(String.format("%.4f", d));
        System.out.println(String.format("%.6f", d));
        System.out.println(String.format("%10.2f", d));
    }

}