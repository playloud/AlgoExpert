package com.psh.algoexpert.binarytrees;
import java.util.*;
public class BSTConstruction {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if(value < this.value) {
                if(this.left == null) {
                    this.left = new BST(value);
                } else {
                    this.left.insert(value);
                }
            } else {
                if(value >= this.value) {
                    if(this.right == null) {
                        this.right = new BST(value);
                    } else {
                        this.right.insert(value);
                    }
                }
            }
            // Do not edit the return statement of this method.
            return this;
        }

        public boolean contains(int value) {
            if(this.value == value) {
                return true;
            } else if(value < this.value) {
                if(this.left != null) return this.left.contains(value);
            }else if(value > this.value) {
                if(this.right != null) return this.right.contains(value);
            }
            return false;
        }

        public BST remove(int value) {
            // find node to delete;
            var nodeToDelete = findFirstNode(this, value);

            if(isLeafNode(nodeToDelete)){
                // find parent and delete
                var cpMap = new HashMap<BST, BST>();
                buildCPMap(this, cpMap);
                unLink(cpMap.get(nodeToDelete), nodeToDelete);
            } else {
                deleteNode(nodeToDelete);
            }
            // Do not edit the return statement of this method.
            return this;
        }

        public void deleteNode(BST node) {
            var nodeRightLeft = getRight_LeftMost(node);
            if(nodeRightLeft == null) {
                var nodeLeftRight = getLeft_RightMost(node);
                node.value = nodeLeftRight.value;
                if(isLeafNode(nodeLeftRight)){
                    // find parent and delete
                    var cpMap = new HashMap<BST, BST>();
                    buildCPMap(node, cpMap);
                    unLink(cpMap.get(nodeLeftRight), nodeLeftRight);
                } else {
                    deleteNode(nodeLeftRight);
                }
            } else {
                node.value = nodeRightLeft.value;
                if(isLeafNode(nodeRightLeft)) {
                    // find parent and delete
                    var cpMap = new HashMap<BST, BST>();
                    buildCPMap(node, cpMap);
                    unLink(cpMap.get(nodeRightLeft), nodeRightLeft);
                } else {
                    deleteNode(nodeRightLeft);
                }
            }
        }

        public void unLink(BST parent, BST child) {
            if(parent!=null) {
                if(parent.left == child) {
                    parent.left = null;
                } else if(parent.right == child) {
                    parent.right = null;
                }
            }
        }

        public boolean isLeafNode(BST node) {
            if(node.left == null && node.right == null) return true;
            return false;
        }

        public BST getRight_LeftMost(BST node) {
            if(isLeafNode(node)) return node;
            BST cur = node.right;
            BST lastNode = null;
            while(cur != null) {
                lastNode = cur;
                cur = cur.left;
            }
            return lastNode;
        }

        public BST getLeft_RightMost(BST node) {
            if(isLeafNode(node)) return node;
            BST cur = node.left;
            BST lastNode = null;
            while(cur != null) {
                lastNode = cur;
                cur = cur.right;
            }
            return lastNode;
        }

        public BST findFirstNode(BST root, int value) {

            if(root.value == value) return root;
            else if(value < root.value && root.left != null) {
                return findFirstNode(root.left, value);
            } else if(value > root.value && root.right != null) {
                return findFirstNode(root.right, value);
            }

            return null;
        }

        public void buildCPMap(BST root, HashMap<BST, BST> cpMap) {
            BST cur = null;
            var queue = new ArrayDeque<BST>();
            queue.push(root);
            while(queue.size() > 0) {
                cur = queue.remove();
                if(cur.left != null) {
                    cpMap.put(cur.left, cur);
                    queue.add(cur.left);
                }
                if(cur.right != null){
                    cpMap.put(cur.right, cur);
                    queue.add(cur.right);
                }
            }
        }

    }
}
