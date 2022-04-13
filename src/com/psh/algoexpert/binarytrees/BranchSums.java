//https://www.algoexpert.io/questions/Branch%20Sums
package com.psh.algoexpert.binarytrees;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        var result = new ArrayList<Integer>();
        getMyBranchSum(0, root, result);
        return result;
    }

    public static void getMyBranchSum(int currentSum, BinaryTree node, List<Integer> sums) {

        if (node.left == null && node.right == null) {
            sums.add(currentSum+node.value);
            return;
        }

        if(node.left != null) {
            getMyBranchSum(currentSum+node.value, node.left, sums);
        }

        if(node.right != null) {
            getMyBranchSum(currentSum+node.value, node.right, sums);
        }
    }
}
