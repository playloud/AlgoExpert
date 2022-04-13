package com.psh.algoexpert.greedy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TaskAssignmentTest {

    @Test
    public void testTasksAssignment() {
        var app = new TaskAssignment();
        var input = new ArrayList<Integer>();
        input.addAll(Arrays.asList(1,3,5,3, 1,4));
        app.taskAssignment(3, input );
    }

}