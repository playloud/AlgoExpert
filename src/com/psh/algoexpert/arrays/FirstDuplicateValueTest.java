package com.psh.algoexpert.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstDuplicateValueTest {

    @Test
    public void testFirstDup() {
        int[] input = {2,1,5,3,3,4};
        var app= new FirstDuplicateValue();
        var result = app.firstDuplicateValue(input);
        System.out.println(result);
    }


}