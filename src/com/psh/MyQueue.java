package com.psh;

public class MyQueue {

    int[] elements = null;
    int initialSize = 100;
    int threshold = 80;

    int head = 0;
    int tail = 0;

    public MyQueue() {
        elements = new int[initialSize];
        // todo: initial size should be decided again.
        init();
    }

    // 1 0 2 3 4 5 6 7 8 9
    // h     t
    //if  over threshold, then double the array size, then copy to new array
    public void init() {

    }

    //
    public void push(int element) {
        this.elements[tail++] = element;
    }

    public int pop() {
        // if size is greater than zero
        if(count() > 0) {
            return this.elements[head++];
        }
        return Integer.MIN_VALUE;
    }

    //count
    public int count() {
        int size = (tail - head + 1);
        return size;
    }

    //copy
    public MyQueue copy() {
        return null;
    }

    // delete all
    public void deleteAll() {

    }


}
