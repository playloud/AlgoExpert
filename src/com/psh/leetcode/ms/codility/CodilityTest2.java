package com.psh.leetcode.ms.codility;

public class CodilityTest2 {

    public int solution(int[] A) {
        int preHeight = 0;
        int horizCount = 0;

        for(int i = 0; i < A.length; i++) {
            if(preHeight < A[i]){
                horizCount = A[i] - preHeight + horizCount;
                System.out.println("horizCount" + horizCount);
            }
            // save previous
            preHeight = A[i];
        }

        return horizCount;
    }

    int BrushCount(int[] buildings)
    {
        int brushCount = 0;
        int prevHeight = 0;
        for(int i = 0; i < buildings.length; i++)
        {
            if(buildings[i] > prevHeight)
                brushCount = brushCount + (buildings[i] - prevHeight);
            prevHeight = buildings[i];
        }
        return brushCount;
    }

}
