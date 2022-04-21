package com.psh.algoexpert.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeSwapTest {

    @Test
    public void testNodeSwap() {
        NodeSwap.LinkedList root = new NodeSwap.LinkedList(0);
        root.next = new NodeSwap.LinkedList(1);
        root.next.next = new NodeSwap.LinkedList(2);
        root.next.next.next = new NodeSwap.LinkedList(3);
        root.next.next.next.next = new NodeSwap.LinkedList(4);
        root.next.next.next.next.next = new NodeSwap.LinkedList(5);

        var app = new NodeSwap();
        var result = app.nodeSwap(root);

        NodeSwap.LinkedList node = null;
        node = result;
        while(node!=null) {
            System.out.print(node.value+"->");
            node = node.next;
        }
        System.out.println();
    }

    @Test
    public void testNodeSwap2() {
        NodeSwap.LinkedList root = new NodeSwap.LinkedList(0);
        root.next = new NodeSwap.LinkedList(1);


        var app = new NodeSwap();
        var result = app.nodeSwap(root);

        NodeSwap.LinkedList node = null;
        node = result;
        while(node!=null) {
            System.out.print(node.value+"->");
            node = node.next;
        }
        System.out.println();
    }

    @Test
    public void testNodeSwap3() {
        NodeSwap.LinkedList root = new NodeSwap.LinkedList(0);


        var app = new NodeSwap();
        var result = app.nodeSwap(root);

        NodeSwap.LinkedList node = null;
        node = result;
        while(node!=null) {
            System.out.print(node.value+"->");
            node = node.next;
        }
        System.out.println();
    }
}