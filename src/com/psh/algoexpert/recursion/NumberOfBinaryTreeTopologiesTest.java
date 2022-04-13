package com.psh.algoexpert.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfBinaryTreeTopologiesTest {

    @Test
    public void testNumOfBintreTops() {
        var result = NumberOfBinaryTreeTopologies.numberOfBinaryTreeTopologies(4);
        System.out.println(result);
    }

}