package com.psh.algoexpert;

import java.util.*;
import java.util.stream.Collectors;

public class Util {

    public static void print2D(int mat[][]) {
        // Loop through all rows
        for (int[] row : mat)
            System.out.println(Arrays.toString(row));
    }

    public static void print2D(double mat[][]) {
        // Loop through all rows
        for (double[] row : mat)
            System.out.println(Arrays.toString(row));
    }

    public static void print2D(double mat[][], int pad) {
        // Loop through all rows
        var buf = new StringBuffer();
        int digits = 3;
        String rule = "%"+pad+"."+digits+"f";
        for (double[] row : mat){
            for (double d : row) {
                buf.append(String.format(rule,d));
            }
            buf.append(System.lineSeparator());
        }
        System.out.println(buf.toString());
    }

    public static void print2D(String mat[][]) {
        // Loop through all rows
        for (String[] strings : mat) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public static List<Integer> toList(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    public static int[] generateRand(int size, int min, int max) {
        Random rand = new Random();
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(max);
        }
        return result;
    }
}
