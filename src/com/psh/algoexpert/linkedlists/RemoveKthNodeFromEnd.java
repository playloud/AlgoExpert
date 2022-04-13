package com.psh.algoexpert.linkedlists;

import java.util.*;

public class RemoveKthNodeFromEnd {

    public static void removeKthNodeFromEnd(LinkedList head, int k) {

        var arrList = new ArrayList<LinkedList>();
        var cpMap = new HashMap<LinkedList, LinkedList>();
        LinkedList cursor = head;
        while (cursor != null) {
            arrList.add(cursor);
            if(cursor.next != null) {
                cpMap.put(cursor.next, cursor);
            }
            cursor = cursor.next;
        }
        int index = arrList.size() - k;
        if(0<=index && index< arrList.size()) {
            LinkedList targetNode = arrList.get(index);
            LinkedList parent = null;
            if(cpMap.containsKey(targetNode)) {
                parent = cpMap.get(targetNode);
                parent.next = targetNode.next;
            } else {
                // cannot delete head, so copying moving ahead..
                while(head!=null) {
                    if(head.next != null) head.value = head.next.value;
                    head = head.next;
                }
                var lastNode = arrList.get(arrList.size()-1);
                var lastParent = cpMap.get(lastNode);
                lastParent.next = null;
            }
        }
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }

}
