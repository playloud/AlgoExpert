package com.psh.algoexpert.linkedlists;

public class NodeSwap {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public LinkedList newHead = null;
    public LinkedList nodeSwap(LinkedList head) {
        newHead = head;
        mySol(head, null);
        return newHead;
    }

    public void mySol(LinkedList n, LinkedList prev) {
        if(n == null) return;
        if(n.next == null) return;

        LinkedList temp = n;
        LinkedList tempNext = n.next;
        LinkedList tempNN = n.next.next;

        tempNext.next = temp;
        temp.next = tempNN;

        if(prev == null) {
            newHead = tempNext;
        } else {
            prev.next = tempNext;
        }
        mySol(tempNN, temp);
    }
}
