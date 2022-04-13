package com.psh.algoexpert.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {
    @Test
    public void testFindLoop() {
        var node = new FindLoop.LinkedList(1);
        node.next = new FindLoop.LinkedList(2);
        node.next.next = new FindLoop.LinkedList(3);
        node.next.next.next = new FindLoop.LinkedList(4);
        node.next.next.next.next = new FindLoop.LinkedList(5);
        node.next.next.next.next.next = new FindLoop.LinkedList(6);
        node.next.next.next.next.next.next = new FindLoop.LinkedList(7);
        node.next.next.next.next.next.next.next = new FindLoop.LinkedList(8);
        node.next.next.next.next.next.next.next.next = new FindLoop.LinkedList(9);
        node.next.next.next.next.next.next.next.next.next = node.next.next.next;

        var result = FindLoop.findLoop(node);
        System.out.println(result.value);
    }

}