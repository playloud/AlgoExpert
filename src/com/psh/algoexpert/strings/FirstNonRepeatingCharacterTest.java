package com.psh.algoexpert.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstNonRepeatingCharacterTest {

    @Test
    public void testFirstNonRepeating() {
        String str = "abcab";
        var app = new FirstNonRepeatingCharacter();
        System.out.println(app.firstNonRepeatingCharacter(str));
    }

}