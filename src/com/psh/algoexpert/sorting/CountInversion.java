package com.psh.algoexpert.sorting;
import java.util.*;
public class CountInversion {

    public int inversion = 0;

    public int countInversions(int[] array) {
        inversion = 0;
        if (array.length == 0) return 0;
        var result = this.mergeSort2(array);
        System.out.println(Arrays.toString(result));
        return inversion;
    }

    public int[] mergeSort2(int[] src) {
        // split into 2 parts
        if (src.length == 1) {
            return src;
        } else if (src.length == 2) {
            if (src[1] < src[0]) {
                var temp = src[1];
                src[1] = src[0];
                src[0] = temp;
                inversion++;
            }
            return src;
        }

        int half = src.length / 2;
        int[] lower = new int[half];
        int[] higher = new int[src.length - half];
        for (int i = 0; i < half; i++) {
            lower[i] = src[i];
        }

        for (int i = half; i < src.length; i++) {
            higher[i - half] = src[i];
        }

        int[] lower_merged = mergeSort2(lower);
        int[] higher_merged = mergeSort2(higher);

        return merge2(lower_merged, higher_merged);
    }

    public int[] merge2(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int pos = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                result[pos] = arr2[j];
                pos++;
                j++;
                inversion += (arr1.length - i);
            } else {
                result[pos] = arr1[i];
                pos++;
                i++;
            }
        }
        if (i < arr1.length) {
            while (i < arr1.length) {
                result[pos++] = arr1[i++];
            }
        } else if (j < arr2.length) {
            while (j < arr2.length) {
                result[pos++] = arr2[j++];
            }
        }
        return result;
    }

    public int countInversions_incorrect(int[] array) {

        //build nodes
        Node[] nodes = new Node[array.length];
        for (int i = 0; i < array.length; i++) {
            nodes[i] = new Node(i, array[i]);
        }

        // merge sort against nodes
        // records indices
        var records = new HashMap<Integer, HashSet<Integer>>();
        Node[] sorted = mergeSort(nodes, records);

        return inversion;
    }

    public Node[] mergeSort(Node[] array, HashMap<Integer, HashSet<Integer>> records) {
        // split and merge
        if (array.length == 1)
            return array;
        if (array.length == 2) {
            if (array[1].value < array[0].value) {
                var temp = array[1];
                array[1] = array[0];
                array[0] = temp;
                putRecord(array[0], array[1], records);
            }
            return array;
        }

        int m = array.length / 2;
        var arr1 = new Node[m + 1];
        var arr2 = new Node[array.length - m - 1];
        for (int i = 0; i <= m; i++) {
            arr1[i] = array[i];
        }

        for (int i = m + 1; i < array.length; i++) {
            arr2[i - (m + 1)] = array[i];
        }

        var sorted1 = mergeSort(arr1, records);
        var sorted2 = mergeSort(arr2, records);
        return merge(sorted1, sorted2, records);
    }

    public Node[] merge(Node[] arr1, Node[] arr2, HashMap<Integer, HashSet<Integer>> records) {
        Node[] merged = new Node[arr1.length + arr2.length];

        if (arr1.length == 1 && arr2.length == 1) {
            if (arr1[0].value < arr2[0].value) {
                merged[0] = arr1[0];
                merged[1] = arr2[0];
                putRecord(arr1[0], arr2[0], records);
            } else {
                merged[1] = arr1[0];
                merged[0] = arr2[0];
                putRecord(arr1[0], arr2[0], records);
            }
            return merged;
        }

        int pos1 = 0;
        int pos2 = 0;
        int pos_result = 0;
        while (pos1 < arr1.length && pos2 < arr2.length) {
            Node a = arr1[pos1];
            Node b = arr2[pos2];
            if (a.value < b.value) {
                pos1++;
                merged[pos_result++] = a;
                // solution
                putRecord(a, b, records);
            } else {
                pos2++;
                merged[pos_result++] = b;
                putRecord(a, b, records);
            }
        }

        if (pos1 < arr1.length) {
            while (pos1 < arr1.length) {
                merged[pos_result++] = arr1[pos1++];
            }
        } else if (pos2 < arr2.length) {
            while (pos2 < arr2.length) {
                merged[pos_result++] = arr2[pos2++];
            }
        }

        return merged;
    }

    public void putRecord(Node a, Node b, HashMap<Integer, HashSet<Integer>> records) {
        if (a.value > b.value && a.index < b.index) {
            if (records.containsKey(a.index)) records.get(a.index).add(b.index);
            else {
                records.put(a.index, new HashSet<Integer>());
                records.get(a.index).add(b.index);
            }
        } else if (a.value < b.value && a.index > b.index) {
            if (records.containsKey(b.index)) records.get(b.index).add(a.index);
            else {
                records.put(b.index, new HashSet<Integer>());
                records.get(b.index).add(a.index);
            }
        }
    }

    public class Node {
        int index = 0;
        int value = 0;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }


}
