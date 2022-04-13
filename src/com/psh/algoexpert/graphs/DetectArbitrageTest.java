package com.psh.algoexpert.graphs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class DetectArbitrageTest {
    @Test
    public void testDetectArb() {
        var input = new ArrayList<ArrayList<Double>>();
        var line1 = new ArrayList<Double>();
        var line2 = new ArrayList<Double>();
        var line3 = new ArrayList<Double>();
        line1.addAll(Arrays.asList(1.0, 0.8631, 0.5903));
        line2.addAll(Arrays.asList(1.1586, 1.0, 0.6849));
        line3.addAll(Arrays.asList(1.6939, 1.46, 1.0));
        input.add(line1);
        input.add(line2);
        input.add(line3);

        var app = new DetectArbitrage();
        boolean result = app.detectArbitrage(input);
        System.out.println(result);
    }

}