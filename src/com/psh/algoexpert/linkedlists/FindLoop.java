//https://www.algoexpert.io/questions/Find%20Loop
// PSH 01/23/22 : passed, easy..
package com.psh.algoexpert.linkedlists;

import java.util.HashSet;

public class FindLoop {
    public static LinkedList findLoop(LinkedList head) {

        var history = new HashSet<LinkedList>();
        var curNode = head;
        boolean isFoundLoop = false;
        while(curNode != null || !isFoundLoop ) {
            if(curNode.next != null &&  history.contains(curNode.next)) {
                isFoundLoop = true;
                return curNode.next;
            } else {
                history.add(curNode);
                curNode = curNode.next;
            }
        }
        return null;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
