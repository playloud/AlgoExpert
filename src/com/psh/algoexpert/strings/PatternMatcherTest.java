package com.psh.algoexpert.strings;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PatternMatcherTest {

    @Test
    public void testPatternMatcher() {
        String pattern =  "xxyxxy";
        String str = "gogopowerrangergogopowerranger";
        var result = PatternMatcher.patternMatcher(pattern, str);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testPatternMatcher2() {
        String pattern =  "xyxy";
        String str = "abab";
        var result = PatternMatcher.patternMatcher(pattern, str);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testPatternMatcher3() {
        String pattern =  "yxx";
        String str = "yomama";
        var result = PatternMatcher.patternMatcher(pattern, str);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testPatternMatcher4() {
        String pattern =  "xxx";
        String str = "mamama";
        var result = PatternMatcher.patternMatcher(pattern, str);
        System.out.println(Arrays.toString(result));
    }

}