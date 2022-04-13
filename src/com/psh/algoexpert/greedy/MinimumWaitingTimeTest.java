package com.psh.algoexpert.greedy;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MinimumWaitingTimeTest {

    @Test
    public void testMinWaitTime() {
        var app = new MinimumWaitingTime();
        //int[] query = {3,2,1,2,6}; // 17
        int[] query = {1, 2, 3}; //
        //int[] query = {3,2,1,2,6};
        //int[] query = {3,2,1,2,6};
        System.out.println(app.minimumWaitingTime(query));
    }

}