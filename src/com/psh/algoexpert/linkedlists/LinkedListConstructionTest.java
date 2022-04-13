package com.psh.algoexpert.linkedlists;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LinkedListConstructionTest {

    @Test
    public void testLinked() {
        var app = new LinkedListConstruction.DoublyLinkedList();
        app.setHead(new LinkedListConstruction.Node(1));
        app.setHead(new LinkedListConstruction.Node(3));
        app.setHead(new LinkedListConstruction.Node(5));
    }

    @Test
    public void testLinks() {
        var arr = new ArrayList<String>();
        arr.add("0");
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        arr.add("5");
        System.out.println(arr);
        arr.add(arr.indexOf("3"), "yay");
        System.out.println(arr);
    }

}