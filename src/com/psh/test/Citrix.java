package com.psh.test;

import org.junit.Test;

public class Citrix {

    public void myFunction() {
        System.out.println("my function");
    }




    @Test
    public void test01() {
        var app = new Citrix();
        app.myFunction();
    }

}
