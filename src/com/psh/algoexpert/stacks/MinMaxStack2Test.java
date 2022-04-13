package com.psh.algoexpert.stacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinMaxStack2Test {

    @Test
    public void testMinMaxStack2() {
        var mmStack = new MinMaxStack2();
        mmStack.push(5);
        System.out.println("min"+mmStack.getMin());
        System.out.println("max"+mmStack.getMax());

        mmStack.push(7);

        mmStack.push(2);
        System.out.println("min"+mmStack.getMin());
        System.out.println("max"+mmStack.getMax());
        System.out.println();
        System.out.println("pop:"+mmStack.pop());
        System.out.println("pop:"+mmStack.pop());
        System.out.println("min"+mmStack.getMin());
        System.out.println("max"+mmStack.getMax());

    }

}