package com.psh.algoexpert.graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoggleBoardTest {

    @Test
    public void testBoggle() {
        char[][] board = {
            {'t', 'h', 'i', 's', 'i', 's', 'a'},
            {'s', 'i', 'm', 'p', 'l', 'e', 'x'},
            {'b', 'x', 'x', 'x', 'x', 'e', 'b'},
            {'x', 'o', 'g', 'g', 'l', 'x', 'o'},
            {'x', 'x', 'x', 'D', 'T', 'r', 'a'},
            {'R', 'E', 'P', 'E', 'A', 'd', 'x'},
            {'x', 'x', 'x', 'x', 'x', 'x', 'x'},
            {'N', 'O', 'T', 'R', 'E', '-', 'P'},
            {'x', 'x', 'D', 'E', 'T', 'A', 'E'}
        };
        String[] words = {"this", "is", "not", "a", "simple", "boggle", "board", "test", "REPEATED", "NOTRE-PEATED"};
        var result = BoggleBoard.boggleBoard(board, words);
        System.out.println(result);

    }

}