package com.psh.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumTwinSumofaLinkedListTest {
    @Test
    public void test01() {
        var node = new MaximumTwinSumofaLinkedList.ListNode(4);
        node.next = new MaximumTwinSumofaLinkedList.ListNode(2);
        node.next.next = new MaximumTwinSumofaLinkedList.ListNode(2);
        node.next.next.next = new MaximumTwinSumofaLinkedList.ListNode(3);

        var app = new MaximumTwinSumofaLinkedList();
        int result = app.pairSum(node);
        System.out.println(result);
    }

    @Test
    public void test02() {
        var node = new MaximumTwinSumofaLinkedList.ListNode(1);
        node.next = new MaximumTwinSumofaLinkedList.ListNode(100);


        var app = new MaximumTwinSumofaLinkedList();
        int result = app.pairSum(node);
        System.out.println(result);
    }

    @Test
    public void test03() {

    }

}