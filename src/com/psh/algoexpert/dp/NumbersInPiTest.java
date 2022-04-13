package com.psh.algoexpert.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersInPiTest {

    @Test
    public void testNumbersInPi() {
        String pi = "3141592653589793238462643383279";
        String[] numbers = {"314159265358979323846", "26433", "8", "3279", "314159265", "35897932384626433832", "79"};
        var result = NumbersInPi.numbersInPi(pi, numbers);
        System.out.println(result);
    }

    @Test
    public void testNumbersInPi2() {
        String pi = "3141592653589793238462643383279";
        String[] numbers = {"3", "314", "49", "9001", "15926535897", "14", "9323", "8462643383279", "4", "793"};
        var result = NumbersInPi.numbersInPi(pi, numbers);
        System.out.println(result);
    }

    @Test
    public void testOcc() {
        var result = NumbersInPi.getAllOccurs("bc","abcabcabcaaaaa" );
        System.out.println(result);
    }

}