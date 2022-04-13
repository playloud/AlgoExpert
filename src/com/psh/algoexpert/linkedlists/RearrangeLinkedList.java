package com.psh.algoexpert.linkedlists;
import java.util.*;
public class RearrangeLinkedList {

    public static LinkedList rearrangeLinkedList(LinkedList head, int k) {

        LinkedList cur;
        cur = head;
        LinkedList smallHead, smallTail;
        LinkedList bigHead, bigTail;
        LinkedList kNodeHead, kNodeTail;
        smallHead = smallTail = kNodeHead = kNodeTail = bigHead = bigTail = null;

        // build three parts nodes,
        while (cur != null) {
            if(cur.value == k) {
                if(kNodeHead == null) {
                    kNodeHead = cur;
                    kNodeTail = kNodeHead;
                } else {
                    kNodeTail.next = cur;
                    kNodeTail = kNodeTail.next;
                }

            } else if(cur.value < k) {
                if(smallHead == null) {
                    smallHead = cur;
                    smallTail = smallHead;
                } else {
                    smallTail.next = cur;
                    smallTail = smallTail.next;
                }
            } else {
                if(bigHead == null) {
                    bigHead = bigTail = cur;
                } else {
                    bigTail.next = cur;
                    bigTail = bigTail.next;
                }
            }
            cur = cur.next;
        }

        if(smallTail != null) {
            if(kNodeHead != null) smallTail.next = kNodeHead;
            else smallTail.next = bigHead;
        }
        if(kNodeTail != null) kNodeTail.next = bigHead;
        if(bigTail !=null) bigTail.next = null;


        if(smallHead != null) return smallHead;
        if(kNodeHead != null) return kNodeHead;
        if(bigHead != null) return bigHead;


        return null;
    }

    static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            next = null;
        }
    }
}
