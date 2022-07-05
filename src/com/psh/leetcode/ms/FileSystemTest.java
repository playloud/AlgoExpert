package com.psh.leetcode.ms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FileSystemTest {

    @Test
    public void splitTest() {

        System.out.println(Arrays.toString("/".split("/")));
    }

    @Test
    public void test01() {
        var app = new FileSystem();
        app.mkdir("/a/b/c");
        System.out.println(app.ls("/"));;
    }

    @Test
    public void test02() {
        var app = new FileSystem();
        app.mkdir("/a/b/c1");
        app.mkdir("/a/b/c2");
        app.mkdir("/a/b/c3");
        System.out.println(app.ls("/a/b"));;
    }

    @Test
    public void test03() {
        var app = new FileSystem();
        app.mkdir("/a/b/c1");
        app.mkdir("/a/b/c2");
        app.mkdir("/a/b/c3");
        app.addContentToFile("/a/b/c3/cfile", "this is c file");
        System.out.println(app.ls("/a/b"));;
        System.out.println(app.readContentFromFile("/a/b/c3/cfile"));;
        app.addContentToFile("/a/b/c3/cfile", "this is new c file");
        System.out.println(app.readContentFromFile("/a/b/c3/cfile"));;
        app.addContentToFile("/a/b/c3/dfile", "this is d file");
        System.out.println(app.readContentFromFile("/a/b/c3/cfile"));;
        System.out.println(app.readContentFromFile("/a/b/c3/dfile"));;
        System.out.println(app.ls("/"));;
    }

    @Test
    public void test04() {
        var app = new FileSystem();
        System.out.println(app.ls("/"));;
        app.mkdir("/a/b/c");
        System.out.println(app.ls("/"));;

    }

    @Test
    public void test05() {
        var app = new FileSystem();
        app.mkdir("/goowmfn");
        System.out.println(app.ls("/goowmfn"));;
        System.out.println(app.ls("/"));;
        app.mkdir("z");
        System.out.println(app.ls("/"));;
        System.out.println(app.ls("/"));;
        app.addContentToFile("/goowmfn/c","shetopcy");
        System.out.println(app.ls("/z"));;
        System.out.println(app.ls("/goowmfn/c"));;
        System.out.println(app.ls("/goowmfn"));;

    }

    @Test
    public void test06() {
        var app = new FileSystem();
        System.out.println(app.ls("/"));;
        app.mkdir("/a/b/c");
        System.out.println(app.ls("/a/b"));;

    }

}