package com.psh.algoexpert.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZipLinkedListTest {

    @Test
    public void testZipLinked() {
        var node = new ZipLinkedList.LinkedList(0);
        node.next = new ZipLinkedList.LinkedList(1);
        node.next.next = new ZipLinkedList.LinkedList(2);
        node.next.next.next = new ZipLinkedList.LinkedList(3);
        node.next.next.next.next = new ZipLinkedList.LinkedList(4);
        node.next.next.next.next.next = new ZipLinkedList.LinkedList(5);
        node.next.next.next.next.next.next = new ZipLinkedList.LinkedList(6);

        var app = new ZipLinkedList();
        var result = app.zipLinkedList(node);

        ZipLinkedList.LinkedList cursor = null;
        cursor = result;
        while(cursor != null) {
            System.out.println(cursor.value);;
            cursor = cursor.next;
        }
    }

    @Test
    public void testZipLinked2() {
        var node = new ZipLinkedList.LinkedList(0);
        node.next = new ZipLinkedList.LinkedList(1);
        node.next.next = new ZipLinkedList.LinkedList(2);
        node.next.next.next = new ZipLinkedList.LinkedList(3);
        node.next.next.next.next = new ZipLinkedList.LinkedList(4);
        node.next.next.next.next.next = new ZipLinkedList.LinkedList(5);
        node.next.next.next.next.next.next = new ZipLinkedList.LinkedList(6);

        var app = new ZipLinkedList();
        var result = app.zipLinkedList(node);

        ZipLinkedList.LinkedList cursor = null;
        cursor = result;
        while(cursor != null) {
            System.out.println(cursor.value);;
            cursor = cursor.next;
        }
    }

}