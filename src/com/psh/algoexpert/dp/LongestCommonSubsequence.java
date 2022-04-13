package com.psh.algoexpert.dp;

import java.util.*;

public class LongestCommonSubsequence {

    public static List<Character> longestCommonSubsequence(String str1, String str2) {

        if(str1 == null || str2 == null ) {
            return new ArrayList<Character>();
        } else if(str1.length() == 0 || str2.length() == 0){
            return new ArrayList<Character>();
        }

        String answer = "";
        String[][] mat = new String[str1.length()+1][str2.length()+1];
        char[] carr1 = str1.toCharArray();
        char[] carr2 = str2.toCharArray();
        for (int i = 0; i < str1.length() + 1; i++) {
            for (int j = 0; j < str2.length() + 1; j++) {
                char c1 = ' ';
                char c2 = ' ';
                if(i>0) c1 = carr1[i-1];
                if(j>0) c2 = carr2[j-1];

                if(c1 == ' ' || c2 == ' ') {
                    mat[i][j] = "";
                } else if(c1 == c2) {
                    mat[i][j] = mat[i-1][j-1] + c1;
                    if(answer.length() < mat[i][j].length()) answer = mat[i][j];
                } else {
                    if(mat[i][j-1].length() > mat[i-1][j].length())
                        mat[i][j] = mat[i][j-1];
                    else
                        mat[i][j] = mat[i-1][j];
                    if(answer.length() < mat[i][j].length()) answer = mat[i][j];
                }
            }
        }
        var result = new ArrayList<Character>();
        for (char c : answer.toCharArray()) {
            result.add(c);
        }
        return result;
    }
}
