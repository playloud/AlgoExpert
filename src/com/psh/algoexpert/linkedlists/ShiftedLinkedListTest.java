package com.psh.algoexpert.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShiftedLinkedListTest {
    @Test
    public void testShiftedLL() {
        var node = new ShiftedLinkedList.LinkedList(0);
        node.next = new ShiftedLinkedList.LinkedList(1);
        node.next.next = new ShiftedLinkedList.LinkedList(2);
        node.next.next.next = new ShiftedLinkedList.LinkedList(3);
        node.next.next.next.next = new ShiftedLinkedList.LinkedList(4);
        var result = ShiftedLinkedList.shiftLinkedList(node, 2);

        ShiftedLinkedList.LinkedList cursor = null;
        cursor = result;
        while(cursor != null) {
            System.out.println(cursor.value);;
            cursor = cursor.next;
        }
    }

}