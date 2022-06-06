package com.psh.codesignal;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class Test01Test {

    @Test
    public void test01() {
        int ts = 1613327630;
        Date dt = new Date(ts);
        System.out.println(dt);
    }

    @Test
    public void test011() {

    }




    @Test
    public void test02() {
        String[] commands = {
                "withdraw 1613327630 2 480", "withdraw 1613327644 2 800", "withdraw 1614105244 1 100", "deposit 1614108844 2 200", "withdraw 1614108845 2 150"
        };
        int[] balance = new int[2];
        balance[0] = 1000;
        balance[1] = 1500;

        var app = new Test01();
        var result = app.solution(balance, commands);
        System.out.println(result[0] + " "+result[1]);

    }



}