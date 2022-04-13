package com.psh.algoexpert.recursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PermutationsTest {

    @Test
    public void testPermu() {
        var app = new Permutations();
        int[] temp = {1,2,3,4,5,6};
        var input = new ArrayList<Integer>();
        for (int i = 0; i < temp.length; i++) {
            input.add(temp[i]);
        }
        var result = Permutations.getPermutations(input);
        System.out.println(result);
    }

}