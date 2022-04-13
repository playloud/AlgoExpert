package com.psh.algoexpert.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateDocumentTest {

    @Test
    public void testGenDoc() {
        var app = new GenerateDocument();
        //System.out.println(app.generateDocument("dafaf", "fafad"));
        System.out.println(app.generateDocument("Bste!hetsi ogEAxpelrt x ", "AlgoExpert is the Best!"));
    }

}