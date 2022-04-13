package com.psh.algoexpert.recursion;
import com.psh.algoexpert.Util;

import java.util.*;
public class SolveSudoku {

    boolean isFound = false;
    public ArrayList<ArrayList<Integer>> solveSudoku(ArrayList<ArrayList<Integer>> board) {
        isFound = false;
        int[][] boardArr = new int[board.size()][board.size()];
        // assumes i*i size
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.size(); j++) {
                boardArr[i][j] = board.get(i).get(j);
            }
        }
        var next = initialZero(0,0, boardArr);
        mySol(next.x, next.y, boardArr, board);
        return board;
    }

    public void mySol(int i, int j, int[][] board, ArrayList<ArrayList<Integer>> src) {
        var possibles = getNum(i,j, board);
        if(possibles.size() == 0) {
            board[i][j] = 0;
            return;
        }
        Point nextPoint = nextZero(i,j,board);
        for (Integer maybe : possibles) {
            if(isFound) return;
            board[i][j] = maybe;

            if(nextPoint != null) {
                System.out.println(String.format("(%d %d) %d => (%d %d)",i, j, maybe, nextPoint.x, nextPoint.y ));
                mySol(nextPoint.x, nextPoint.y, board, src);
                board[i][j] = 0;
            } else {
                Util.print2D(board);
                isFound = true;
                for (int k = 0; k < board.length; k++) {
                    for (int l = 0; l < board.length; l++) {
                        src.get(k).set(l, board[k][l]);
                    }
                }
            }
        }
    }

    public ArrayList<Integer> getNum(int i, int j, int[][] board) {
        boolean[] map = new boolean[10];
        // check horizontal
        for (int k = 0; k < board.length; k++) {
            if(k == j) continue;
            if(board[i][k] != 0) {
                int mapIndex = board[i][k];
                map[mapIndex] = true;
            }
        }
        // check vertical
        for (int k = 0; k < board.length; k++) {
            if(k == i) continue;
            if(board[k][j] != 0) {
                int mapIndex = board[k][j];
                map[mapIndex] = true;
            }
        }
        // check group
        int i_mo = i %3;
        int j_mo = j % 3;
        for (int k = i - i_mo; k < (i - i_mo + 3); k++) {
            for (int l = (j - j_mo); l < (j - j_mo + 3) ; l++) {
                if(k == i && l == j) continue;
                if(board[k][l] != 0) {
                    int mapIndex = board[k][l];
                    map[mapIndex] = true;
                }
            }
        }
        // check map
        var resultArr = new ArrayList<Integer>();
        for (int k = 1; k < map.length; k++) {
            if(!map[k])
                resultArr.add(k);
        }
        return  resultArr;
    }

    public Point nextZero(int i, int j, int[][]board) {
        Point p = null;
        for (int k = i; k < board.length; k++) {
            for (int l = j; l < board[k].length; l++) {
                if(k == i && l == j) continue;
                if(board[k][l] == 0) {
                    p = new Point();
                    p.x = k;
                    p.y = l;
                    return p;
                }
            }
            j=0;
        }
        return p;
    }

    public Point initialZero(int i, int j, int[][]board) {
        Point p = null;
        for (int k = i; k < board.length; k++) {
            for (int l = j; l < board[k].length; l++) {
                if(board[k][l] == 0) {
                    p = new Point();
                    p.x = k;
                    p.y = l;
                    return p;
                }
            }
        }
        return p;
    }

    class Point {
        int x;
        int y;
    }

    public ArrayList<ArrayList<Integer>> solveSudoku_wrong(ArrayList<ArrayList<Integer>> board) {
        int[][] boardArr = new int[board.size()][board.size()];

        // assumes i*i size
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.size(); j++) {
                boardArr[i][j] = board.get(i).get(j);
            }
        }
        boolean isSomeFound = true;
        int count = 0;
        while(true) {
            count++;
            isSomeFound = true;
            for (int i = 0; i < board.size(); i++) {
                for (int j = 0; j < board.size(); j++) {
                    if(boardArr[i][j] == 0) {
                        var resultARr = getNum(i,j, boardArr);
                        if(resultARr.size() == 1) {
                            boardArr[i][j] = resultARr.get(0);
                        } else {
                            isSomeFound = false;
                        }
                    }
                }
            }
            if(isSomeFound) break;
        }
        System.out.println(count);
        for (int i = 0; i < boardArr.length; i++) {
            for (int j = 0; j < boardArr.length; j++) {
                board.get(i).set(j, boardArr[i][j]);
            }
        }
        return board;
    }
}
