package com.psh.algoexpert.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherEncryptorTest {
    @Test
    public void testCaesar() {
        String input = "abc";
        var result = CaesarCipherEncryptor.caesarCypherEncryptor(input, 57);
        System.out.println(result);
    }

}