package com.psh.algoexpert.arrays;

public class FirstDuplicateValue {
    public int firstDuplicateValue(int[] array) {

        boolean[] map = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            int index = element-1;
            if(map[index]) return element;
            else map[index] = true;
        }

        return -1;
    }

}
