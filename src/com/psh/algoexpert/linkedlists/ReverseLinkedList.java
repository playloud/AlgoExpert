package com.psh.algoexpert.linkedlists;

public class ReverseLinkedList {

    public static LinkedList reverseLinkedList(LinkedList head) {

        if(head.next == null) return head;
        if(head.next.next == null) {
            LinkedList s = head.next;
            head.next = null;
            s.next = head;
            return s;
        }

        LinkedList na = head;
        LinkedList nb = null;
        LinkedList temp = null;

        boolean isInitial = true;
        nb = na.next;
        temp = nb.next;

        while(true) {

            if(isInitial) {
                na.next = null;
                isInitial = false;
            }

            // re link
            nb.next = na;

            na = nb;
            nb = temp;
            temp = nb.next;
            if(temp == null) {
                nb.next = na;
                break;
            }
        }

        return nb;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }

}
