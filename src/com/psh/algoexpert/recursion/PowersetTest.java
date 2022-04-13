package com.psh.algoexpert.recursion;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.*;

public class PowersetTest {
    @Test
    public void testPowerset() {
        Integer[] input = {1, 2, 3, 4};
        var arr = Arrays.asList(input);
        arr.sort(Comparator.naturalOrder());
        Powerset.powerset(arr);
    }

}