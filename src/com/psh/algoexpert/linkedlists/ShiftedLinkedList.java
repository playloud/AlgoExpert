package com.psh.algoexpert.linkedlists;

import java.util.*;

public class ShiftedLinkedList {

    public static LinkedList shiftLinkedList(LinkedList head, int k) {

        if(head.next == null) return head;

        var arrList = new ArrayList<LinkedList>();
        LinkedList cursor = head;
        while(cursor != null) {
            arrList.add(cursor);
            cursor = cursor.next;
        }

        if(k>0) {
            for (int i = 0; i < k; i++) {
                arrList.add(0, arrList.remove(arrList.size()-1));
                arrList.get(0).next = arrList.get(1);
            }
            arrList.get(arrList.size()-1).next = null;
        } else if(k < 0) {
            for (int i = 0; i < Math.abs(k); i++) {
                var last = arrList.get(arrList.size()-1);
                var newLast =arrList.remove(0);
                arrList.add(newLast);
                last.next = newLast;
                newLast.next = null;
            }
        }

        return arrList.get(0);
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
