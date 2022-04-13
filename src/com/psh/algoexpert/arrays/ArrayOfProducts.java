//https://www.algoexpert.io/questions/Array%20Of%20Products
package com.psh.algoexpert.arrays;

public class ArrayOfProducts {
    public int[] arrayOfProducts(int[] array) {

        if(array == null|| array.length == 0||array.length ==1)
            return new int[0];

        int[][] mat = new int[array.length][array.length];
        int[] result = new int[array.length];

        // build matrix
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(j-1 < 0 || j-1 < i) {
                    mat[i][j] = array[j];
                } else {
                    mat[i][j] = mat[i][j-1] * array[j];
                }
            }
        }

        // calculate result
        int leng = array.length;
        for (int i = 0; i < array.length; i++) {
            if(i-1 >= 0 && i+1 < leng)
                result[i] = mat[0][i-1] * mat[i+1][leng-1];
            else if(i == 0)
                result[i] = mat[i+1][leng-1];
            else if(i == leng-1)
                result[i] = mat[0][leng-2];
        }


        return result;
    }
}
