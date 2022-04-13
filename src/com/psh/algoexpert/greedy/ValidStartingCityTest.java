package com.psh.algoexpert.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidStartingCityTest {

    @Test
    public void testValidStartingCity() {
        int[] dist = {5, 25, 15, 10, 15};
        int[] fuel = {1,2,1,0,3};
        int mgp = 10;
        var app = new ValidStartingCity();
        var result = app.validStartingCity(dist, fuel, mgp);
        System.out.println(result);

    }

    @Test
    public void testValidStartingCity2() {
        int[] dist = {1, 3, 10, 6, 7, 7, 2, 4};
        int[] fuel = {1, 1, 1, 1, 1, 1, 1, 1};
        int mgp = 5;
        var app = new ValidStartingCity();
        var result = app.validStartingCity(dist, fuel, mgp);
        System.out.println(result);

    }

    @Test
    public void testValidStartingCity3() {
        int[] dist = {30, 40, 10, 10, 17, 13, 50, 30, 10, 40};
        int[] fuel = {1, 2, 0, 1, 1, 0, 3, 1, 0, 1};
        int mgp = 25;
        var app = new ValidStartingCity();
        var result = app.validStartingCity(dist, fuel, mgp);
        System.out.println(result);

    }


}