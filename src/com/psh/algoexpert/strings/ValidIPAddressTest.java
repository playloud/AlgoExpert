package com.psh.algoexpert.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidIPAddressTest {

    @Test
    public void testValidIP() {
        String input = "1921680";
        var app = new ValidIPAddress();
        var result = app.validIPAddresses(input);
        System.out.println(result);
        System.out.println(result.size());
    }

}