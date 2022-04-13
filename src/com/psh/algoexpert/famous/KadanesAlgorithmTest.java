package com.psh.algoexpert.famous;

import org.junit.Test;

import static org.junit.Assert.*;

public class KadanesAlgorithmTest {

    @Test
    public void testKadane() {
        int[] input = {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
        var result = KadanesAlgorithm.kadanesAlgorithm(input);
        System.out.println(result);
    }

    @Test
    public void testKadane2() {
        int[] input = {-1, -2, -3, -4};
        var result = KadanesAlgorithm.kadanesAlgorithm(input);
        System.out.println(result);
    }

    @Test
    public void testKadane3() {
        int[] input = {-4, -2, -1, -4};
        var result = KadanesAlgorithm.kadanesAlgorithm(input);
        System.out.println(result);
    }

}