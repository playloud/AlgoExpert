package com.psh.algoexpert.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeLinkedLIstTest {

    @Test
    public void testMergeLinkedList() {
        var headOne = new MergeLinkedLIst.LinkedList(1);
        headOne.next = new MergeLinkedLIst.LinkedList(2);
        headOne.next.next = new MergeLinkedLIst.LinkedList(3);
        headOne.next.next.next = new MergeLinkedLIst.LinkedList(4);


        var headTwo = new MergeLinkedLIst.LinkedList(5);
        headTwo.next = new MergeLinkedLIst.LinkedList(6);
        headTwo.next.next = new MergeLinkedLIst.LinkedList(7);
        headTwo.next.next.next = new MergeLinkedLIst.LinkedList(8);

        var result = MergeLinkedLIst.mergeLinkedLists(headTwo, headOne);
        System.out.println(result);
        MergeLinkedLIst.LinkedList cursor = result;
        while(cursor != null) {
            System.out.println(cursor.value);
            cursor = cursor.next;
        }

    }


}