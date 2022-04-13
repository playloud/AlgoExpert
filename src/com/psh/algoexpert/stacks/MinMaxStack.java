package com.psh.algoexpert.stacks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinMaxStack {

    PriorityQueue<Integer> minQ = new PriorityQueue<Integer>();
    PriorityQueue<Integer> maxQ = new PriorityQueue<Integer>(Comparator.reverseOrder());
    ArrayList<Integer> myStack = new ArrayList<>();

    public int peek() {
        return myStack.get(0);
    }

    public int pop() {
        int value = myStack.remove(0);
        minQ.remove(value);
        maxQ.remove(value);
        return value;
    }

    public void push(Integer number) {
        myStack.add(0, number);
        minQ.add(number);
        maxQ.add(number);
    }

    public int getMin() {
        return minQ.peek();
    }

    public int getMax() {
        return maxQ.peek();
    }
}
