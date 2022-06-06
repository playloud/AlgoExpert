package com.psh.leetcode.amazon.DesignanExpressionTreeWithEvaluateFunction;
//https://leetcode.com/problems/design-an-expression-tree-with-evaluate-function/
import java.util.*;

public class TreeBuilder {
    Node buildTree(String[] postfix) {
        var arr = new ArrayList<MyNode>();
        for (String s : postfix) {
            arr.add(new MyNode(s));
        }
        while(arr.size() > 1) {
            for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i).isOps()) {
                    var ops = arr.get(i);
                    var left = arr.get(i-2);
                    var right = arr.get(i-1);
                    ops.left = left;
                    ops.right = right;
                    arr.remove(i-1);
                    arr.remove(i-2);
                    break;
                }
            }
        }
        return arr.get(0);
    }
}

abstract class Node {
    public abstract int evaluate();
    // define your fields here
}

/**
 * This is the TreeBuilder class.
 * You can treat it as the driver code that takes the postinfix input
 * and returns the expression tree represnting it as a Node.
 */

class MyNode extends Node {
    String symbol = null;

    public MyNode(String symbol) {
        this.symbol = symbol;
    }
    public MyNode left = null;
    public MyNode right = null;
    public boolean isOps() {
        if (this.symbol.equals("-") || this.symbol.equals("+") || this.symbol.equals("*") || this.symbol.equals("/")) {
            if(this.right == null && this.left == null)
                return true;
        }
        return false;
    }

    @Override
    public int evaluate() {
        if (this.symbol.equals("-") || this.symbol.equals("+") || this.symbol.equals("*") || this.symbol.equals("/")) {
            if (symbol.equals("-")) {
                return (this.left.evaluate() - this.right.evaluate());
            } else if (symbol.equals("*")) {
                return (this.left.evaluate() * this.right.evaluate());
            } else if (symbol.equals("/")) {
                return (this.left.evaluate() / this.right.evaluate());
            } else if (symbol.equals("+")) {
                return (this.left.evaluate() + this.right.evaluate());
            }
        }
        return Integer.parseInt(this.symbol);
    }
}
