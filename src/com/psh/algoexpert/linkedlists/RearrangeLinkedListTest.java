package com.psh.algoexpert.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class RearrangeLinkedListTest {

    @Test
    public void testRearrangeLL() {
        RearrangeLinkedList.LinkedList root = new RearrangeLinkedList.LinkedList(3);
        root.next = new RearrangeLinkedList.LinkedList(0);
        root.next.next = new RearrangeLinkedList.LinkedList(2);
        root.next.next.next = new RearrangeLinkedList.LinkedList(1);
        root.next.next.next.next = new RearrangeLinkedList.LinkedList(4);
        root.next.next.next.next.next = new RearrangeLinkedList.LinkedList(5);

        var result = RearrangeLinkedList.rearrangeLinkedList(root, 5);
        RearrangeLinkedList.LinkedList node = null;
        node = result;
        while(node!=null) {
            System.out.print(node.value+"->");
            node = node.next;
        }
        System.out.println();

    }

    @Test
    public void testRearrangeLL2() {
        RearrangeLinkedList.LinkedList root = new RearrangeLinkedList.LinkedList(0);
        root.next = new RearrangeLinkedList.LinkedList(3);
        root.next.next = new RearrangeLinkedList.LinkedList(2);
        root.next.next.next = new RearrangeLinkedList.LinkedList(1);
        root.next.next.next.next = new RearrangeLinkedList.LinkedList(4);
        root.next.next.next.next.next = new RearrangeLinkedList.LinkedList(5);

        var result = RearrangeLinkedList.rearrangeLinkedList(root, 0);
        RearrangeLinkedList.LinkedList node = null;
        node = result;
        while(node!=null) {
            System.out.print(node.value+"->");
            node = node.next;
        }
        System.out.println();

    }

}