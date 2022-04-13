package com.psh.algoexpert.graphs;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class RectangleManiaTest {

    @Test
    public void testRect() {
        List<Integer[]> input = new ArrayList<>();
        input.add(new Integer[]{0, 0});
        input.add(new Integer[]{0, 1});
        input.add(new Integer[]{1, 1});
        input.add(new Integer[]{1, 0});
        input.add(new Integer[]{2, 1});
        input.add(new Integer[]{2, 0});
        input.add(new Integer[]{3, 1});
        input.add(new Integer[]{3, 0});
        var result = RectangleMania.rectangleMania(input);
        System.out.println(result);
    }

}