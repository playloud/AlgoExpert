package com.psh.algoexpert.graphs;
import java.util.*;

public class BoggleBoard {
    public static List<String> boggleBoard(char[][] board, String[] words) {
        var result = new ArrayList<String>();
        // loop against words
        for (String word : words) {
            char[] arr = word.toCharArray();
            boolean[][] mat = new boolean[board.length][board[0].length];
            // find start point
            workingLoop: for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    search(word, 0, mat, board, i, j, result);
                }
            }
        }
        return result;
    }

    public static void search(String word, int index, boolean[][] mat, char[][] board, int i, int j, ArrayList<String> result) {
        if(i<0 || i>=board.length) return;
        if(j<0 || j>=board[i].length) return;
        if(mat[i][j]) return;
        if(result.lastIndexOf(word) != -1) return;

        if(word.charAt(index) == board[i][j]) {
            if(index == word.length()-1) {
                mat[i][j] = true;
                result.add(word);
                mat[i][j] = false;
            } else {
                mat[i][j] = true;
                search(word,(index+1), mat, board, (i+1),(j-1), result);
                search(word,(index+1), mat, board, (i+1),(j), result);
                search(word,(index+1), mat, board, (i+1),(j+1), result);

                search(word,(index+1), mat, board, (i-1),(j-1), result);
                search(word,(index+1), mat, board, (i-1),(j), result);
                search(word,(index+1), mat, board, (i-1),(j+1), result);

                search(word,(index+1), mat, board, (i),(j+1), result);
                search(word,(index+1), mat, board, (i),(j-1), result);
                mat[i][j] = false;
            }
        }
    }
}
