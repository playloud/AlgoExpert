package com.psh.algoexpert.recursion;
import java.util.*;
// LATER // PSH 03/30/22 : this is not correct
public class NumberOfBinaryTreeTopologies {
    public static int cnt = 0;
    public static int srcNum = 0;
    public static boolean isOneCared = false;
    public static int numberOfBinaryTreeTopologies(int n) {
        if(n <= 0) return 1;
        cnt = 0;
        srcNum = n;
        isOneCared = false;
        mySol(--n, 2);
        return cnt;
    }

    public static void mySol(int node, int childRemain) {
        if(node == 0){
            ++cnt;
        }
        if(childRemain == 1) {
            mySol(node-1, 2);
        } else {
            mySol(node-1, 1);
            mySol(node-1, 1);
        }
    }

}
