package com.psh.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeStringTest {

    @Test
    public void test01() {
        var app = new DecodeString();
        Assert.assertEquals("abcdcdc", app.decodeString("abc2[dc]"));
        Assert.assertEquals("abcdcdcttyy", app.decodeString("abc2[dc]tt2[y]"));
        Assert.assertEquals("abcsdfcrcrsdfcrcrttyy", app.decodeString("abc2[sdf2[cr]]tt2[y]"));

    }

}