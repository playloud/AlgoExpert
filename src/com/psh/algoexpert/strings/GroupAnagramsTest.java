package com.psh.algoexpert.strings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

    @Test
    public void testGAna() {
        String[] input = {"yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"};
        var list = Stream.of(input).collect(Collectors.toList());
        var result = GroupAnagrams.groupAnagrams(list);
        System.out.println(result);
    }

}