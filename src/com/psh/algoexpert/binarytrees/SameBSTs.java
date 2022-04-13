package com.psh.algoexpert.binarytrees;
import java.util.*;
public class SameBSTs {
    public static boolean sameBsts(List<Integer> arrayOne,List<Integer> arrayTwo) {
        return mySol(arrayOne, arrayTwo);
    }

    public static boolean mySol(List<Integer> arr1,List<Integer> arr2) {
        if(arr1.size() != arr2.size()) return false;

        if(arr1.size() == 1&& arr2.size() == 1) {
            if(arr1.get(0) == arr2.get(0)) return true;
            else return false;
        }

        if(arr1.size() > 0 && arr2.size() > 0) {
            if(arr1.get(0) != arr2.get(0)) {
                return false;
            }
            return mySol(getLeft(arr1), getLeft(arr2)) & mySol(getRight(arr1), getRight(arr2));
        } else {
            return true;
        }
    }

    public static ArrayList<Integer> getLeft(List<Integer> arr) {
        int pivot = arr.get(0);
        var left = new ArrayList<Integer>();
        if(arr.size()> 1) {
            for (int i = 1; i < arr.size(); i++) {
                if(arr.get(i) < pivot) left.add(arr.get(i));
            }
        }
        return left;
    }

    public static ArrayList<Integer> getRight(List<Integer> arr) {
        int pivot = arr.get(0);
        var right = new ArrayList<Integer>();
        if(arr.size() > 1) {
            for (int i = 1; i < arr.size(); i++) {
                if(arr.get(i) >= pivot) right.add(arr.get(i));
            }
        }
        return right;
    }

}
