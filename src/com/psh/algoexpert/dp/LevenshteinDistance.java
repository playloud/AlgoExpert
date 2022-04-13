//https://www.algoexpert.io/questions/Levenshtein%20Distance
// not easy question, need an intuition for find pattern
package com.psh.algoexpert.dp;

import com.psh.algoexpert.Util;

public class LevenshteinDistance {
    public static int levenshteinDistance(String str1, String str2) {

        if(str1 == null || str2 == null) {
            return 0;
        } else if((str2.length() == 0 && str1.length() > 0) || (str1.length() == 0 && str2.length() > 0)) {
            return Math.max(str1.length(), str2.length());
        }

        char[] carr1 = str1.toCharArray();
        char[] carr2 = str2.toCharArray();
        int[][] mat = new int[str1.length()+1][str2.length()+1];

        // build matrix
        for (int i = 0; i < str1.length()+1; i++) {
            for (int j = 0; j < str2.length()+1; j++) {
                if(i == 0) {
                    mat[i][j] = j;
                } else if(j ==0) {
                    mat[i][j] = i;
                } else {
                    if(carr1[i-1] == carr2[j-1]) {
                        mat[i][j] = mat[i-1][j-1];
                    } else {
                        mat[i][j] = 1 + Math.min(mat[i][j-1], Math.min(mat[i-1][j-1], mat[i-1][j]));
                    }
                }
            }
        }

        // test purpose
        //Util.print2D(mat);

        // do find the last element
        return mat[str1.length()][str2.length()];
    }
}
