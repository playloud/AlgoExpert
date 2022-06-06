package com.psh.leetcode.amazon.DesignanExpressionTreeWithEvaluateFunction;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeBuilderTest {

    @Test
    public void test01() {
        String[] postfix = {"4", "5", "7", "2", "+", "-", "*"};
        var app = new TreeBuilder();
        var n = app.buildTree(postfix);
        System.out.println(n.evaluate());
    }

    @Test
    public void test02() {
        String[] postfix = {"3","4","+","2","*","7","/"};
        var app = new TreeBuilder();
        var n = app.buildTree(postfix);
        System.out.println(n.evaluate());
    }

}