package com.psh.algoexpert.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveKthNodeFromEndTest {

    @Test
    public void testRmvKth() {
        var head = new RemoveKthNodeFromEnd.LinkedList(0);
        head.next = new RemoveKthNodeFromEnd.LinkedList(1);
        head.next.next = new RemoveKthNodeFromEnd.LinkedList(2);
        head.next.next.next = new RemoveKthNodeFromEnd.LinkedList(3);
        head.next.next.next.next = new RemoveKthNodeFromEnd.LinkedList(4);
        head.next.next.next.next.next = new RemoveKthNodeFromEnd.LinkedList(5);
        head.next.next.next.next.next.next = new RemoveKthNodeFromEnd.LinkedList(6);
        head.next.next.next.next.next.next.next = new RemoveKthNodeFromEnd.LinkedList(7);
        head.next.next.next.next.next.next.next.next = new RemoveKthNodeFromEnd.LinkedList(8);
        head.next.next.next.next.next.next.next.next.next = new RemoveKthNodeFromEnd.LinkedList(9);

        RemoveKthNodeFromEnd.removeKthNodeFromEnd(head, 10);

        RemoveKthNodeFromEnd.LinkedList cursor = null;
        cursor = head;
        while(cursor != null) {
            System.out.println(cursor.value);;
            cursor = cursor.next;
        }

    }

}