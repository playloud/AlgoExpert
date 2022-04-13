package com.psh.algoexpert.linkedlists;
import java.util.*;
public class RemoveDuplicatesFromLinkedList {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        var mySet = new HashSet<Integer>();
        LinkedList node = null;
        LinkedList prev = null;
        node = linkedList;
        while (node != null) {
            if(mySet.contains(node.value)) {
                prev.next = node.next;
                node = node.next;
            } else {
                mySet.add(node.value);
                prev = node;
                node = node.next;
            }
        }
        return linkedList;
    }

}
