package com.psh.algoexpert.linkedlists;
import java.util.*;
public class ZipLinkedList {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList zipLinkedList(LinkedList linkedList) {

        var myQ = new ArrayDeque<LinkedList>();
        var myStack = new Stack<LinkedList>();
        int total = 0;
        int count = 0;
        LinkedList cursor = null;
        cursor = linkedList;
        while(cursor != null) {
            myQ.add(cursor);
            myStack.add(cursor);
            cursor = cursor.next;
        }

        total = myQ.size();
        LinkedList newHead = null;
        newHead = linkedList;
        LinkedList tail = null;
        while(count < total) {

            var temp = myQ.remove();
            if(tail == null) {
                tail = temp;
            } else {
                tail.next = temp;
                tail = tail.next;

            }
            ++count;
            tail.next = myStack.pop();
            ++count;
            tail = tail.next;
        }
        tail.next = null;
        return newHead;
    }
}
