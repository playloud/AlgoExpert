package com.psh.algoexpert.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class LRUCachePTest {

    @Test
    public void testLRUCache() {
        LRUCacheP.LRUCache cache = new LRUCacheP.LRUCache(3);
        cache.insertKeyValuePair("b", 2);
        cache.insertKeyValuePair("a", 1);
        cache.insertKeyValuePair("c", 3);
        System.out.println(cache.getMostRecentKey());
        System.out.println(cache.getValueFromKey("a").value);
        System.out.println(cache.getMostRecentKey());
        cache.insertKeyValuePair("d", 4);
        System.out.println(cache.getValueFromKey("b").value);
        cache.insertKeyValuePair("a", 5);
        System.out.println(cache.getValueFromKey("a").value);
    }

}