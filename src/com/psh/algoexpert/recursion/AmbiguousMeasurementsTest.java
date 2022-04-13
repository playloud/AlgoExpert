package com.psh.algoexpert.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class AmbiguousMeasurementsTest {

    @Test
    public void testAmbiguous() {
        var app = new AmbiguousMeasurements();
        int[][] measures = {
                {200, 210},
                {450, 465},
                {800, 850},
        };
        int low = 2100;
        int high = 2300;
        var result = app.ambiguousMeasurements(measures, low, high);
        System.out.println(result);
    }

    @Test
    public void testAmbiguous2() {
        var app = new AmbiguousMeasurements();
        int[][] measures = {
                {1,2},
                {3,4},
                {5,6},
        };
        int low = 100;
        int high = 101;
        var result = app.ambiguousMeasurements(measures, low, high);
        System.out.println(result);
    }

    @Test
    public void testAmbiguous3() {
        var app = new AmbiguousMeasurements();
        int[][] measures = {
                {50, 60},
            {100, 120},
            {20, 40},
            {10, 15},
            {400, 500}
        };
        int low = 1000;
        int high = 1050;
        var result = app.ambiguousMeasurements(measures, low, high);
        System.out.println(result);
    }

    @Test
    public void testAmbiguous4() {
        var app = new AmbiguousMeasurements();
        int[][] measures = {
                {50, 60},
                {100, 120},
                {20, 40},
                {10, 15},
                {400, 500}
        };
        int low = 1000;
        int high = 1200;
        var result = app.ambiguousMeasurements(measures, low, high);
        System.out.println(result);
    }

    @Test
    public void testAmbiguous5() {
        var app = new AmbiguousMeasurements();
        int[][] measures = {
                {50, 60},
                {100, 120},
                {20, 40},
                {10, 15},
                {400, 500},
                {300, 350},
        {10, 25}
        };
        int low = 3000;
        int high = 3300;
        var result = app.ambiguousMeasurements(measures, low, high);
        System.out.println(result);
    }

}