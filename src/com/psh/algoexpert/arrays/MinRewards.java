package com.psh.algoexpert.arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class MinRewards {

    public static int minRewards(int[] scores) {

        if(scores == null|| scores.length == 0 ) {
            return -1;
        } else if(scores.length ==1) {
            return 1;
        }

        int min = Integer.MAX_VALUE;
        int[] board = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            if(i == 0) {
                board[i] = 1;
                if(board[i] < min) min = board[i];
            } else if(i == scores.length-1) {
                int prevValue = scores[i-1];
                if(prevValue < scores[i]) {
                    board[i] = board[i-1] +1;
                } else {
                    board[i] = Math.min(min, board[i-1]-1);
                    if(board[i] < min) min = board[i];
                }
            } else {
                int prevValue = scores[i-1];
                if(prevValue < scores[i]) {
                    board[i] = board[i-1] +1;
                    if(board[i] < min) min = board[i];
                } else {
                    board[i] = board[i-1] - 1;
                    if(board[i] < min) min = board[i];
                }
            }
        }

        // nomalize 1
        for (int i = 0; i < board.length; i++) {
            if(i==0 && board[i] < board[i+1]) {
                board[i] = 1;
            } else {
                board[i] = board[i] + (1-min);
            }
        }

        // check bump down => can be min
        var minQueue = new ArrayDeque<Integer>();
        if(board.length >= 3) {
            for (int i = 1; i < board.length-1; i++) {
                if(board[i-1] > board[i] && board[i] < board[i+1]){
                    board[i] = 1;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            if(board[i] == 1) minQueue.add(i);
        }

        // normalize between mins
        int startIndex = 0;
        int endIndex = 0;
        boolean isFirst = true;
        while(minQueue.size() > 0) {
            if(isFirst) {
                int index = minQueue.peek();
                if(minQueue.peek() != 0) {
                    startIndex = -1;
                    endIndex = minQueue.peek();
                    normalize(startIndex, endIndex, board);
                }
                isFirst = false;
            } else {

                if(minQueue.size() > 1) {
                    startIndex = minQueue.remove();
                    endIndex = minQueue.peek();
                } else {
                    startIndex = minQueue.remove();
                    endIndex = board.length;
                }
                normalize(startIndex, endIndex, board);
            }
        }

        // normalize III
        if(board.length >= 3) {
            for (int i = 1; i < board.length-1; i++) {
                if(board[i-1] < board[i] && board[i] < board[i+1] && board[i-1] == 1){
                    board[i] = 2;
                }
            }
        }


        var sum = Arrays.stream(board).sum();
        return sum;
    }

    private static void normalize(int startIndex, int endIndex, int[] board) {
        int min = Integer.MAX_VALUE;
        for (int i = startIndex+1; i < endIndex; i++) {
            if(board[i] < min) min = board[i];
        }

        for (int i = startIndex+1; i < endIndex; i++) {
            board[i] = board[i] - min + 2;
        }
    }
}
