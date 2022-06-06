package com.psh.leetcode.amazon;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KillProcessTest {

    @Test
    public void testKillP01() {
        var pid = Arrays.asList(1,3,10,5);
        var ppid = Arrays.asList(3,0,5,3);
        var app = new KillProcess();
        var result = app.killProcess(pid, ppid, 5);
        System.out.println(result);
    }

    @Test
    public void testKillP02() {
        var pid = Arrays.asList(1,3,10,5);
        var ppid = Arrays.asList(3,0,5,3);
        var app = new KillProcess();
        var result = app.killProcess(pid, ppid, 3);
        System.out.println(result);
    }

}