package com.psh.leetcode.string;

import org.junit.Test;

public class MinDeletionToMakcCharFreqUniqeTest {
    @Test
    public void testMinDeletion() {
        var app = new MinDeletionToMakcCharFreqUniqe();
        var result = app.minDeletions("aaabbbcc");
        System.out.println(result);
    }

}