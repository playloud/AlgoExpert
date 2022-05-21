package com.psh.algoexpert.heaps;

import org.junit.Assert;
import org.junit.Test;

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

}