package com.psh.algoexpert.stacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShortenPathTest {

    @Test
    public void testShortenPath() {
        String input = "/foo/../test/../test/../foo//bar/./baz";
        var result = ShortenPath.shortenPath(input);
        System.out.println(result);
    }

    ///foo/./././bar/./baz///////////test/../../../kappa
    @Test
    public void testShortenPath2() {
        String input = "../../foo/../../bar/baz";
        var result = ShortenPath.shortenPath(input);
        System.out.println(result);
    }

}