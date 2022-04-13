package com.psh.algoexpert.dp;
import java.util.*;
public class SquareOfZeros {

    // idea: simply check all 0 points then find square
    public static boolean squareOfZeroes(List<List<Integer>> matrix) {
        // init board
        int[][] board = new int[matrix.size()][];
        for (int i = 0; i < matrix.size(); i++) {
            var m = matrix.get(i);
            board[i] = new int[m.size()];
            for (int j = 0; j < m.size(); j++) {
                board[i][j] = m.get(j);
            }
        }
        // point (i, j)
        for (int i = 0; i < board.length -1 ; i++) {
            for (int j = 0; j < board[i].length -1 ; j++) {
                if(board[i][j] == 0) {
                    // now start point i, j
                    // determine max square size
                    int maxSize = Math.min( (board.length - i -1), (board[i].length - j-1));
                    boolean result = containsSquare(i,j, maxSize, board);
                    if(result) return true;
                }
            }
        }
        // determin square size
        return false;
    }

    public static boolean containsSquare(int i, int j, int maxSize, int[][] board) {
        boolean isFinished = false;
        mainLoop: for (int size = 1; size <= maxSize ; size++) {
            isFinished = true;
            // go Left (i, j+++)
            for (int l = j ; l <= size + j ; l++) {
                if(board[i][l] != 0) {
                    isFinished = false;
                    break;
                }
            }

            // Left Down (i+++, (j+k))
            for (int l = i; l<= size+i; l++) {
                if(board[l][j+size] != 0){
                    isFinished = false;
                    break;
                }
            }

            // Down (i+++, j)
            for (int l = i;l <= size+i; l++) {
                if(board[l][j] != 0){
                    isFinished = false;
                    break;
                }
            }

            // Down Left (i+k, j+++)
            for (int l = j ; l <= size + j ; l++) {
                if(board[i+size][l] != 0){
                    isFinished = false;
                    break;
                }
            }

            if(isFinished) {
                System.out.println(String.format("%d %d %d", i, j, maxSize));
                return true;
            }
        }
        return false;
    }
}
