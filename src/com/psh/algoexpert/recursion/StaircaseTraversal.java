//https://www.algoexpert.io/questions/Staircase%20Traversal
// PSH 01/13/22 : simply passed
// key point: simple recursion
package com.psh.algoexpert.recursion;

public class StaircaseTraversal {

    static int count = 0;

    public int staircaseTraversal(int height, int maxSteps) {
        count = 0;
        if(height == 0) return 0;

        steps(height, maxSteps);
        return count;
    }

    public void steps(int curHeight, int maxSteps) {
        for (int i = 1; i <= maxSteps; i++) {
            if(curHeight - i == 0 ) {
                count++;
            } else if (curHeight - i > 0) {
                steps(curHeight -i, maxSteps);
            }
        }
    }

}
