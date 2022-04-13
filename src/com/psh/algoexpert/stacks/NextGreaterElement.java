package com.psh.algoexpert.stacks;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] array) {

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = getNextGreat(i, array);
        }

        return result;
    }

    public int getNextGreat(int startIndex, int[] arr) {
        int value = arr[startIndex];
        for (int i = startIndex + 1; i < (startIndex+1)+arr.length ; i++) {
            int index = i % arr.length;
            if(index == startIndex) return -1;
            else if(value< arr[index]) {
                return arr[index];
            }
        }
        return -1;
    }

}
