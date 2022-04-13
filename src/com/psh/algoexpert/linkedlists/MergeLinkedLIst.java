package com.psh.algoexpert.linkedlists;

import java.util.ArrayList;

public class MergeLinkedLIst {


    // This is an input class. Do not edit.
    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {

        LinkedList cursorOne = null;
        LinkedList cursorTwo = null;
        var arr = new ArrayList<LinkedList>();

        cursorOne = headOne;
        cursorTwo = headTwo;

        while(cursorOne != null || cursorTwo != null) {
            if( (cursorTwo != null && cursorOne == null)) {
                arr.add(cursorTwo);
                cursorTwo = cursorTwo.next;
            } else if( (cursorOne !=null && cursorTwo == null)) {
                arr.add(cursorOne);
                cursorOne = cursorOne.next;
            } else if(cursorTwo.value <= cursorOne.value) {
                arr.add(cursorTwo);
                cursorTwo = cursorTwo.next;
            } else {
                arr.add(cursorOne);
                cursorOne = cursorOne.next;
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if(i == arr.size()-1) {
                arr.get(i).next = null;
            } else {
                arr.get(i).next = arr.get(i+1);
            }
        }

        return arr.get(0);
    }
}
