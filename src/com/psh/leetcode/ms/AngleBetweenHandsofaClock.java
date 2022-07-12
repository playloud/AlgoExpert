package com.psh.leetcode.ms;
//https://leetcode.com/problems/angle-between-hands-of-a-clock/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Angle Between Hands of a Clock.
//Memory Usage: 40.9 MB, less than 65.62% of Java online submissions for Angle Between Hands of a Clock.
public class AngleBetweenHandsofaClock {
    public double angleClock(int hour, int minutes) {
        double result = 0;

        double hourAngle = hour * 30 + 30 * ((double)minutes/(double) 60);
        double minAngle = 360 * ((double)minutes/(double) 60);

        double betAngle = Math.abs(minAngle - hourAngle);
        double anotherAngle = 360 - betAngle;

        result = Math.min(betAngle, anotherAngle);

        return result;
    }
}
