package com.psh.leetcode.amazon;
//Runtime: 17 ms, faster than 15.66% of Java online submissions for Asteroid Collision.
//https://leetcode.com/problems/asteroid-collision/
import java.util.*;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {

        var myStack = new Stack<Integer>();
        for (int asteroid : asteroids) {
            if (myStack.isEmpty()) {
                myStack.push(asteroid);
            } else {
                if ((asteroid > 0 && myStack.peek() > 0) || (asteroid < 0 && myStack.peek() < 0)) {
                    myStack.push(asteroid);
                } else {
                    while (true) {
                        if (myStack.isEmpty()) {
                            myStack.push(asteroid);
                            break;
                        } else if (asteroid > 0 && myStack.peek() < 0) {
                            myStack.push(asteroid);
                            break;
                        } else if (asteroid < 0 && myStack.peek() > 0) {
                            // if same
                            if (Math.abs(asteroid) == Math.abs(myStack.peek())) {
                                myStack.pop();
                                break;
                            } else if (Math.abs(asteroid) > Math.abs(myStack.peek())) {
                                myStack.pop();
                            } else {
                                // dump the asteroid
                                break;
                            }
                        } else if (asteroid < 0 && myStack.peek() < 0) {
                            myStack.push(asteroid);
                            break;
                        }

                    }
                }
            }
        }

        int[] result = new int[myStack.size()];
        for (int i = 0; i < myStack.size(); i++) {
            result[i] = myStack.get(i);
        }
        return result;
    }
}
