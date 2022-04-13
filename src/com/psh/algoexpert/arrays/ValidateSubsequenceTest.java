package com.psh.algoexpert.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ValidateSubsequenceTest {

    @Test
    public void testValidateSubSeq() {
        Integer[] arr = new Integer[]{1,1,6,1};
        Integer[] seq = {1,6};

        var result = ValidateSubsequence.isValidSubsequence(Arrays.asList(arr), Arrays.asList(seq));
        System.out.println(result);
    }

}