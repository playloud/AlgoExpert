package com.psh.algoexpert.stacks;

import java.util.ArrayList;

public class MinMaxStack2 {

    ArrayList<Integer> myStack = new ArrayList<>();
    ArrayList<MinMax> mmStack = new ArrayList<>();

    public int peek() {
        return myStack.get(0);
    }

    public int pop() {
        int value = myStack.remove(0);
        mmStack.remove(0);
        return value;
    }

    public void push(Integer number) {
        if(myStack.size() > 0) {

            myStack.add(0, number);
            var latestMM =  mmStack.get(0);
            var newMM = new MinMax();
            newMM.min = latestMM.min;
            newMM.max = latestMM.max;

            if(latestMM.max < number) {
                newMM.max = number;
            }

            if(number < latestMM.min ) {
                newMM.min = number;
            }

            mmStack.add(0, newMM);

        } else {
            myStack.add(0, number);
            var mm = new MinMax();
            mm.max = number;
            mm.min = number;
            mmStack.add(0, mm);
        }

    }

    public int getMin() {
        return mmStack.get(0).min;
    }

    public int getMax() {
        return mmStack.get(0).max;
    }

    class MinMax {
        public int min = 0;
        public int max = 0;
    }
}
