package com.psh.algoexpert.recursion;

import org.junit.Test;

public class GenerateDivTagsTest {

    @Test
    public void testGenDivs() {
        var app = new GenerateDivTags();
        var result = app.generateDivTags(4);
        System.out.println("count: "+result.size());
        for (String s : result) {
            System.out.println(s);
        }
    }

}