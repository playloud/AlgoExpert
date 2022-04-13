//https://www.algoexpert.io/questions/Min%20Heap%20Construction
// PSH 01/08/22 : passed
/*
* Key point: when removing and the last item is not the last index,
* items after deleted item till end of items should be re INSERTED!!
* */
package com.psh.algoexpert.heaps;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {

    List<Integer> heap = new ArrayList<Integer>();

    public MinHeap(List<Integer> array) {
        heap = buildHeap(array);
    }

    public List<Integer> buildHeap(List<Integer> array) {
        for (Integer i : array) {
            insert(i);
        }
        return heap;
    }

    public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
        // not sure what should be done here
    }

    public void siftUp(int currentIdx, List<Integer> heap) {
        // not sure what should be done here
    }

    public int peek() {
        if(this.heap.size() > 0)
            return this.heap.get(0);
        return -1;
    }

    public int remove() {
        int result = Integer.MIN_VALUE;
        if(heap.size() == 1) {
            result = heap.remove(0);
        } else if(heap.size() == 0) {
            return -1;
        } else {
            result = heap.get(0);
            this.checkMovingDown(0);
        }
        return result;
    }

    // kids to Up
    private void checkMovingDown(int i) {
        int index1 = 2*i+1;
        int index2 = 2*i+2;
        boolean isIndex1Valid = index1 < this.heap.size();
        boolean isIndex2Valid = index2 < this.heap.size();

        if(isIndex1Valid && !isIndex2Valid) {
            int value1 = this.heap.get(index1);
            this.heap.set(i, value1);
            //this.heap.remove(index1);
            checkMovingDown(index1);
        } else if(!isIndex1Valid && isIndex2Valid) {
            int value2 = this.heap.get(index2);
            this.heap.set(i, value2);
            this.heap.remove(index2);
            checkMovingDown(index2);
        } else if(isIndex1Valid && isIndex2Valid) {
            int value1 = this.heap.get(index1);
            int value2 = this.heap.get(index2);
            if(value1 < value2) {
                this.heap.set(i, value1);
                checkMovingDown(index1);
            } else {
                this.heap.set(i, value2);
                checkMovingDown(index2);
            }
        } else {
            // End of recursion
            //THIS IS THE PINNACLE POINT
            // take element i -- end of line, then re insert
            int lastIndex = heap.size()-1;
            var tempArray = new ArrayList<Integer>();
            if (i < lastIndex) {
                for (int j = i+1; j <= lastIndex; j++) {
                    tempArray.add(heap.get(j));
                }
                // simply removing items including i
                for (int j = 0; j <= tempArray.size(); j++) {
                    heap.remove(i);
                }
                for (int j = 0; j <tempArray.size() ; j++) {
                    int tempValue = tempArray.get(j);
                    this.insert(tempValue);
                }
            } else {
                heap.remove(i);
            }
        }
    }

    public void insert(int value) {
        this.heap.add(value);
        int index = this.heap.size() -1;
        this.checkMovingUp(index);
    }

    private void checkMovingUp(int index) {
        int value = this.heap.get(index);
        int parentIndex = (index-1) / 2;
        if(parentIndex >= 0) {
            int parent = this.heap.get((parentIndex));
            if(value < parent) {
                // swap
                this.heap.set(parentIndex, value);
                this.heap.set(index, parent);
                checkMovingUp(parentIndex);
            }
        }
    }

    boolean isMinHeapPropertySatisfied(List<Integer> array) {
        for (int currentIdx = 1; currentIdx < array.size(); currentIdx++) {
            int parentIdx = (currentIdx - 1) / 2;
            if (parentIdx < 0) {
                return true;
            }
            if (array.get(parentIdx) > array.get(currentIdx)) {
                return false;
            }
        }
        return true;
    }
}
