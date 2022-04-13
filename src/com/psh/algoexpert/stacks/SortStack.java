package com.psh.algoexpert.stacks;
import java.util.*;
public class SortStack {

    boolean hasSwitch = false;
    public ArrayList<Integer> sortStack(ArrayList<Integer> stack) {

        while(true) {
            hasSwitch = false;
            mySol(stack);
            if(!hasSwitch) break;
        }
        return stack;
    }

    public void mySol(ArrayList<Integer> stack) {
        if(stack.size() > 1) {
            int a = stack.remove(stack.size()-1);
            int b = stack.remove(stack.size()-1);
            // assumes b <= a
            if(b > a) {
                hasSwitch = true;
                stack.add(a);
                mySol(stack);
                stack.add(b);
            } else {
                stack.add(b);
                mySol(stack);
                stack.add(a);
            }
        }
    }
}
