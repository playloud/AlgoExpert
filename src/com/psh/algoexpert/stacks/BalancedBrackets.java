package com.psh.algoexpert.stacks;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean balancedBrackets(String str) {

        var stack = new Stack<Character>();
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            char c = arr[i];
            if(isOpening(c)) {
                stack.push(c);
            } else if(isBracket(c)) {
                if(stack.size() == 0) return false;
                char close = stack.pop();
                if(!isPair(c, close)){
                    return false;
                }
            }
        }
        if(stack.size() > 0) return false;
        return true;
    }

    public static boolean isBracket(char a) {
        if(a=='{' || a == '}') return true;
        if(a=='[' || a == ']') return true;
        if(a=='(' || a == ')') return true;
        return false;
    }

    public static boolean isOpening(char a) {
        if(a=='{' || a=='['|| a=='(') return true;
        return false;
    }

    public static boolean isPair(char a, char b) {
        if(a=='{' && b == '}') return true;
        if(a=='[' && b == ']') return true;
        if(a=='(' && b == ')') return true;
        if(b=='{' && a == '}') return true;
        if(b=='[' && a == ']') return true;
        if(b=='(' && a == ')') return true;
        return false;
    }
}
