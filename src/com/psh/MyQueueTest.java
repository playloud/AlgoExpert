package com.psh;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueTest {

    @Test
    public void testQueue_push_01_simplePush() {
        var myQueue = new MyQueue();
        int size = 10;
        for (int i = 0; i < size; i++) {
            myQueue.push(i);
        }
        Assert.assertEquals(myQueue.copy(), size);
    }

    // testing edge cases for pushing
    @Test
    public void testQueue_push_02_simplePush() {
        var myQueue = new MyQueue();
        int size = Integer.MAX_VALUE -1;
        for (int i = 0; i < size; i++) {
            myQueue.push(i);
        }
        Assert.assertEquals(myQueue.copy(), size);
    }

    //test count
    @Test
    public void testQueue_count_01_simpleCount() {
        var myQueue = new MyQueue();
        int size = 10;
        for (int i = 0; i < size; i++) {
            myQueue.push(i);
        }
        Assert.assertEquals(myQueue.copy(), size);
    }

    @Test
    public void testQueue_count_02_multipleCountTest() {
        // count can be increased from 0 to 100,
        var myQueue = new MyQueue();
        for (int i = 0; i < 100; i++) {
            int count = i;
            int size = count;
            for (int j = 0; j < size; j++) {
                myQueue.push(j);
            }
            Assert.assertEquals(myQueue.count(), size);
            myQueue.deleteAll();
        }
    }

    @Test
    public void testQueue_pop_01_simplePop() {
        // count can be increased from 0 to 100,
        var myQueue = new MyQueue();
        int size = 10;

        for (int i = 0; i < size; i++) {
            myQueue.push(i);
        }

        for (int i = 0; i < size; i++) {
            int popped = myQueue.pop();
            //System.out.println(popped);
            Assert.assertEquals(popped, i);
        }
    }

}