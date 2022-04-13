package com.psh.algoexpert.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {

    @Test
    public void testReverse() {
        var head = new ReverseLinkedList.LinkedList(0);
        head.next = new ReverseLinkedList.LinkedList(1);
        head.next.next = new ReverseLinkedList.LinkedList(2);
        head.next.next.next = new ReverseLinkedList.LinkedList(3);
        head.next.next.next.next = new ReverseLinkedList.LinkedList(4);
        head.next.next.next.next.next = new ReverseLinkedList.LinkedList(5);
        head.next.next.next.next.next.next = new ReverseLinkedList.LinkedList(6);
        head.next.next.next.next.next.next.next = new ReverseLinkedList.LinkedList(7);

        var result = ReverseLinkedList.reverseLinkedList(head);
        ReverseLinkedList.LinkedList cursor = null;
        cursor = result;
        while(cursor != null) {
            System.out.println(cursor.value);;
            cursor = cursor.next;
        }
    }

    @Test
    public void testReverse2() {
        var head = new ReverseLinkedList.LinkedList(0);
        head.next = new ReverseLinkedList.LinkedList(1);

        var result = ReverseLinkedList.reverseLinkedList(head);
        ReverseLinkedList.LinkedList cursor = null;
        cursor = result;
        while(cursor != null) {
            System.out.println(cursor.value);;
            cursor = cursor.next;
        }
    }

    @Test
    public void testReverse3() {
        var head = new ReverseLinkedList.LinkedList(0);
        head.next = new ReverseLinkedList.LinkedList(1);
        head.next.next = new ReverseLinkedList.LinkedList(2);

        var result = ReverseLinkedList.reverseLinkedList(head);
        ReverseLinkedList.LinkedList cursor = null;
        cursor = result;
        while(cursor != null) {
            System.out.println(cursor.value);;
            cursor = cursor.next;
        }
    }

}