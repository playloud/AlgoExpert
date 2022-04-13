package com.psh.algoexpert.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneNumberMnemonicsTest {

    @Test
    public void testPhoneNumMnemonics() {
        var app = new PhoneNumberMnemonics();
        var result = app.phoneNumberMnemonics("1905");
        System.out.println(result);
    }

}