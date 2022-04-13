package com.psh.algoexpert.linkedlists;

import java.util.*;

public class LRUCacheP {

    static class LRUCache {
        static HashMap<String,DLinkedList> myMap = new HashMap<>();
        static DLinkedList head = null;
        static DLinkedList tail = null;
        static int maxSize;

        public LRUCache(int maxSize) {
            this.maxSize = maxSize > 1 ? maxSize : 1;
            myMap.clear();
            head = tail = null;
        }

        public void insertKeyValuePair(String key, int value) {

            if(myMap.containsKey(key)) {
                // update value
                myMap.get(key).value = value;
                // move to latest
                moveToTail(key);
            } else {
                var temp = new DLinkedList(key, value);
                myMap.put(key, temp);
                if(this.head == null) {
                    this.head = temp;
                    this.tail = temp;
                } else {
                    tail.next = temp;
                    temp.prev = tail;
                    tail = temp;
                }

                // delete head
                if(myMap.size() > this.maxSize) {
                    var toDelete = head;
                    var newHead = head.next;
                    head = newHead;
                    head.prev = null;
                    toDelete.next = null;
                    myMap.remove(toDelete.key);
                }
            }
        }

        public void moveToTail(String key) {
            var node = myMap.get(key);
            if(node == null) return;
            if(node == tail) return;

            if(node == head) {
                var temp = head;
                head = head.next;
                head.prev = null;

                tail.next = temp;
                temp.prev = tail;
                tail = temp;

            } else {
                var tempPrev = node.prev;
                var tempNext = node.next;

                tempPrev.next = tempNext;
                tempNext.prev = tempPrev;

                tail.next = node;
                node.prev = tail;
                tail = node;
            }
        }

        public LRUResult getValueFromKey(String key) {
            LRUResult result = null;
            if(myMap.containsKey(key)) {
                result = new LRUResult(true, myMap.get(key).value);
                moveToTail(key);
            } else {
                result = new LRUResult(false, 0);
            }
            return result;
        }

        public String getMostRecentKey() {
            return tail.key;
        }
    }

    static class DLinkedList {
        DLinkedList prev = null;
        DLinkedList next = null;
        int value = 0;
        String key = null;
        public DLinkedList(String key, int value) {
            this.value = value;
            this.key = key;
        }
    }

    static class LRUResult {
        boolean found;
        int value;

        public LRUResult(boolean found, int value) {
            this.found = found;
            this.value = value;
        }
    }

}
