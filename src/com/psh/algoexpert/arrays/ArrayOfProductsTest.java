package com.psh.algoexpert.arrays;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayOfProductsTest {

    @Test
    public void testArrayOfProd() {
        //int[] arr = {5,1,4,2};
        int[] arr = {5};
        var app = new ArrayOfProducts();
        var result = app.arrayOfProducts(arr);
        for (int a : result) {
            System.out.println(a);
        }
    }

}