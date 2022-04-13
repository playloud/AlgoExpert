package com.psh.algoexpert.linkedlists;

import java.util.ArrayList;
import java.util.HashSet;

public class LinkedListConstruction {
    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            var mySet = getSet();
            var arr = getArr();

            if(mySet.contains(node)) {
                arr.remove(node);
                arr.add(0, node);
                resetList(arr);
            } else { // new node
                arr.add(0, node);
                resetList(arr);
            }
        }

        public void setTail(Node node) {
            var mySet = getSet();
            var arr = getArr();

            if(arr.size() == 0) return;

            if(mySet.contains(node)) {
                arr.remove(node);
                arr.add(node);
                resetList(arr);
            } else { // new node
                arr.add(node);
                resetList(arr);
            }
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            var arr = getArr();
            int index = arr.indexOf(node);
            arr.add(index, nodeToInsert);
            this.resetList(arr);
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            var arr = getArr();
            int index = arr.indexOf(node);
            arr.add(index+1, nodeToInsert);
            this.resetList(arr);
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            if(position < 0) return;
            var arr = getArr();
            arr.add(position, nodeToInsert);
            this.resetList(arr);
        }

        public void removeNodesWithValue(int value) {
            var arr = getArr();
            Node nodeToDelete = null;
            for (Node node : arr) {
                if(node.value == value) nodeToDelete = node;
            }
            arr.remove(nodeToDelete);
            this.resetList(arr);
        }

        public void remove(Node node) {
            var arr = getArr();
            arr.remove(node);
            this.resetList(arr);
        }

        public boolean containsNodeWithValue(int value) {
            var arr = getArr();
            for (Node node : arr) {
                if(node.value == value) return true;
            }
            return false;
        }

        public ArrayList<Node> getArr() {
            Node cur = head;
            var arr = new ArrayList<Node>();
            while(cur != null) {
                arr.add(cur);
                cur = cur.next;
            }
            return arr;
        }

        public void resetList(ArrayList<Node> arr) {
            for (int i = 0; i < arr.size(); i++) {
                Node cur = arr.get(i);
                Node next = null;
                if(i<arr.size()-1)
                    next = arr.get(i+1);
                cur.next = next;
                if(i==0) {
                    this.head = cur;
                    cur.prev = null;
                }
                if(i == arr.size()-1) {
                    this.tail = cur;
                    cur.next = null;
                } else {
                    next.prev = cur;
                }
            }

            Node temp = null;
            temp = head;
            System.out.println(String.format("head:%s tail:%s", head.value+"", tail.value+"" ));
            while(temp != null) {
                System.out.print(temp.value+"-> ");
                temp = temp.next;
            }

            System.out.println();
        }

        public HashSet<Node> getSet() {
            Node cur = head;
            var set = new HashSet<Node>();
            while(cur != null) {
                set.add(cur);
                cur = cur.next;
            }
            return set;
        }
    }

    // Do not edit the class below.
    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
