package com.psh.algoexpert.greedy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ClassPhotosTest {

    @Test
    public void testClassPhotos() {
        var app = new ClassPhotos();
        var blue = new ArrayList<Integer>();
        blue.addAll(Arrays.asList(5, 8, 1, 3, 4));
        var red = (new ArrayList<Integer>());
        red.addAll(Arrays.asList(6, 9, 2, 4, 5));
        var result = app.classPhotos(blue,red );
        System.out.println(result);
    }

}