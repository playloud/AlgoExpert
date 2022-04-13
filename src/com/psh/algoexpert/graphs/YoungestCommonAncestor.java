package com.psh.algoexpert.graphs;

import java.util.HashMap;
import java.util.HashSet;

public class YoungestCommonAncestor {
    public static AncestralTree getYoungestCommonAncestor(
            AncestralTree topAncestor,
            AncestralTree descendantOne,
            AncestralTree descendantTwo) {

        var oneSet = new HashSet<AncestralTree>();
        AncestralTree curNode = null;
        curNode = descendantOne;
        while(curNode != topAncestor) {
            oneSet.add(curNode);
            curNode = curNode.ancestor;
        }

        curNode = descendantTwo;
        while(curNode != topAncestor) {
            if(oneSet.contains(curNode)) {
                return  curNode;
            } else {
                curNode = curNode.ancestor;
            }
        }
        return topAncestor; // Replace this line
    }

    static class AncestralTree {
        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }

        // This method is for testing only.
        void addAsAncestor(AncestralTree[] descendants) {
            for (AncestralTree descendant : descendants) {
                descendant.ancestor = this;
            }
        }
    }
}
