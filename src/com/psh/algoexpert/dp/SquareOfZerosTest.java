package com.psh.algoexpert.dp;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class SquareOfZerosTest {

    @Test
    public void testSquareOfZeros() {
        var mat = new ArrayList<List<Integer>>();
        mat.add(Arrays.asList(1, 1, 1, 0, 1, 0));
        mat.add(Arrays.asList(0, 0, 0, 0, 0, 1));
        mat.add(Arrays.asList(0, 1, 1, 1, 0, 1));
        mat.add(Arrays.asList(0, 0, 0, 1, 0, 1));
        mat.add(Arrays.asList(0, 1, 1, 1, 0, 1));
        mat.add(Arrays.asList(0, 0, 0, 0, 0, 1));

        var result = SquareOfZeros.squareOfZeroes(mat);
        System.out.println(result);

    }

}