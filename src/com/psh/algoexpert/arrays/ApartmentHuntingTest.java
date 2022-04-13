package com.psh.algoexpert.arrays;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ApartmentHuntingTest {
    @Test
    public void testApartment() {
        List<Map<String, Boolean>> input = new ArrayList<Map<String, Boolean>>();
        Map<String,Boolean> mp01 = new HashMap<String, Boolean>();
        Map<String,Boolean> mp02 = new HashMap<String, Boolean>();
        Map<String,Boolean> mp03 = new HashMap<String, Boolean>();
        Map<String,Boolean> mp04 = new HashMap<String, Boolean>();
        Map<String,Boolean> mp05 = new HashMap<String, Boolean>();

        mp01.put("gym", false);
        mp01.put("school", true);
        mp01.put("store", false);

        mp02.put("gym", true);
        mp02.put("school", false);
        mp02.put("store", false);

        mp03.put("gym", true);
        mp03.put("school", true);
        mp03.put("store", false);

        mp04.put("gym", false);
        mp04.put("school", true);
        mp04.put("store", false);

        mp05.put("gym", false);
        mp05.put("school", true);
        mp05.put("store", true);
        input.add(mp01);
        input.add(mp02);
        input.add(mp03);
        input.add(mp04);
        input.add(mp05);
        String[] reqs = {"gym", "school", "store"};
        var result = ApartmentHunting.apartmentHunting(input, reqs);
        System.out.println(result);


    }

}