package com.psh.algoexpert.tries;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiStringSearchTest {

    @Test
    public void testMultiStringSearch() {
        String bigString = "hey i am hungry";
        String[] smalls = {"hey","am","big","one","hungr"};
        var result = MultiStringSearch.multiStringSearch(bigString, smalls);
        System.out.println(result);
    }

}