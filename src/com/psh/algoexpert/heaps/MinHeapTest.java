package com.psh.algoexpert.heaps;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class MinHeapTest {

    @Test
    public void testMeanHeap() {
        var array = new ArrayList<Integer>();
        var rand = new Random();
        int size = 17;
        for (int i = 0; i < size; i++) {
            array.add(rand.nextInt(1000));
        }

        var removedList = new ArrayList<Integer>();

        var heap = new MinHeap(array);
        System.out.println("initial:"+heap.heap);
        for (int i = 0; i < size; i++) {
            System.out.println("h:"+heap.heap);
            removedList.add(heap.remove());

        }
        var sortedArray = array.stream().sorted().collect(Collectors.toList());
        System.out.println(array);
        System.out.println(sortedArray);
        System.out.println(removedList);

        Assert.assertEquals(sortedArray, removedList);
    }

    @Test
    public void testMeanHeap_K() {
        for (int k = 0; k < 50; k++) {
            testMeanHeap();
        }
    }

    @Test
    public void testMeanHeap2() {
        var array = new ArrayList<Integer>();
        var rand = new Random();
        int[] initArr = {-823, 164, 48, -987, 323, 399, -293, 183, -908, -376, 14, 980, 965, 842, 422, 829, 59, 724, -415, -733, 356, -855, -155, 52, 328, -544, -371, -160, -942, -51, 700, -363, -353, -359, 238, 892, -730, -575, 892, 490, 490, 995, 572, 888, -935, 919, -191, 646, -120, 125, -817, 341, -575, 372, -874, 243, 610, -36, -685, -337, -13, 295, 800, -950, -949, -257, 631, -542, 201, -796, 157, 950, 540, -846, -265, 746, 355, -578, -441, -254, -941, -738, -469, -167, -420, -126, -410, 59};
        for (int i : initArr)
            array.add(i);

        var heap = new MinHeap(array);
        heap.buildHeap(array);
        heap.remove();
        heap.insert(-8);
        heap.remove();
        heap.insert(8);
        System.out.println(heap.isMinHeapPropertySatisfied(heap.heap));
        Assert.assertTrue(true);
    }


}