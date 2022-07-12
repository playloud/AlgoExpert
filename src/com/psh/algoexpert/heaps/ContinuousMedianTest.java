package com.psh.algoexpert.heaps;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class ContinuousMedianTest {

    @Test
    public void testContiMediTest() {
        var app = new ContinuousMedian.ContinuousMedianHandler();
        var rand = new Random();
        for (int i = 0; i < 100; i++) {
            int value = rand.nextInt(100);
            app.insert_incorrect(value);
            app.insert(value);
            double m = app.getMedian_incorrect();
            double m2 = app.getMedian();
            System.out.println("median:" + m2);
            System.out.println();
            //System.out.println(String.format("%f %f", m, m2));
            Assert.assertEquals(m, m2, 1);
        }

    }

    @Test
    public void testD() {
        double d = ((double) 33)/32;
        System.out.println(d);
    }

    @Test
    public void testMedian() {
        Random rand = new Random();
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < 100; i++) {
            int number = rand.nextInt(100);

            if(minQ.size() == 0) {
                minQ.add(number);
            } else {
                if( number < minQ.peek()) {
                    maxQ.add(number);
                } else {
                    minQ.add(number);
                }
            }

            // rebalancing
            while(Math.abs(minQ.size() - maxQ.size()) >=2) {
                if(minQ.size() > maxQ.size()) {
                    maxQ.add(minQ.remove());
                } else {
                    minQ.add(maxQ.remove());
                }
            }
        }
        System.out.println(minQ.peek());
        System.out.println(maxQ.peek());
        if(minQ.size() == maxQ.size()) {
            double result = (minQ.peek() + maxQ.peek()) / 2;
        }
    }

}