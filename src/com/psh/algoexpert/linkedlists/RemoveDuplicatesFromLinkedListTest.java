package com.psh.algoexpert.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromLinkedListTest {
    @Test
    public void testRemoveDupList() {

        RemoveDuplicatesFromLinkedList.LinkedList root = new RemoveDuplicatesFromLinkedList.LinkedList(1);
        root.next = new RemoveDuplicatesFromLinkedList.LinkedList(1);
        root.next.next = new RemoveDuplicatesFromLinkedList.LinkedList(3);
        root.next.next.next = new RemoveDuplicatesFromLinkedList.LinkedList(4);
        root.next.next.next.next = new RemoveDuplicatesFromLinkedList.LinkedList(4);
        root.next.next.next.next.next = new RemoveDuplicatesFromLinkedList.LinkedList(5);
        root.next.next.next.next.next.next = new RemoveDuplicatesFromLinkedList.LinkedList(6);
        root.next.next.next.next.next.next.next = new RemoveDuplicatesFromLinkedList.LinkedList(6);

        var app = new RemoveDuplicatesFromLinkedList();
        var resultNode = app.removeDuplicatesFromLinkedList(root);
        RemoveDuplicatesFromLinkedList.LinkedList node = null;
        node = resultNode;
        while(node!=null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

}