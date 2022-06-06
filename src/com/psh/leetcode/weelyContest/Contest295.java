package com.psh.leetcode.weelyContest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Contest295 {

    public int totalSteps(int[] nums) {
        int count = 0;
        var stack = new Stack<Integer>();
        int startIndex = 0;
        int sval = nums[startIndex];
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (sval > cur) {
                stack.push(nums[i]);
                if (i == (nums.length - 1)) {
                    count = Math.max(count, checkStack(stack));
                }
            } else {
                count = Math.max(count, checkStack(stack));
                startIndex = i;
                sval = nums[startIndex];
            }
        }
        return count;
    }

    public int checkStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return 0;

        int count = 0;
        int cur = stack.pop();
        count++;
        while (!stack.isEmpty()) {
            if (stack.peek() <= cur) {
                count++;
            }
            cur = stack.pop();
        }
        return count;
    }


    public int totalSteps_ref01(int[] nums) {
        int n = nums.length;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> kills = new ArrayDeque<>();
        int ans = 0;
        for (int i = n - 1; i >= 0; --i) {
            int curr = nums[i];
            int ks = 0;
            while (!stack.isEmpty() && stack.peekFirst() < curr) {
                stack.removeFirst();
                ks = Math.max(ks + 1, kills.removeFirst());
            }
            ans = Math.max(ans, ks);
            stack.addFirst(curr);
            kills.addFirst(ks);
            System.out.println(stack);
        }
        return ans;
    }

    //6080. Steps to Make Array Non-decreasing
    // timelimt caught
    public int totalSteps_timeLimit2(int[] nums) {
        int stepCount = 0;

        var toRemove = new ArrayList<Integer>();
        int i = 0;
        while (true) {
            toRemove.clear();
            i = 0;
            while (i < nums.length - 1) {
                int a = nums[i];
                int nextIndex = getNextIndex(i, nums);
                if (nextIndex == -1)
                    break;
                int b = nums[nextIndex];
                if (Math.abs(a) > b) {
                    toRemove.add(0, nextIndex);
                    nums[nextIndex] = nums[nextIndex] * -1;
                }
                i = nextIndex;
            }
            if (toRemove.size() == 0)
                break;
            else {
                stepCount++;

            }
            System.out.println(Arrays.toString(nums));
        }
        return stepCount;
    }

    public int getNextIndex(int i, int[] nums) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] > 0) return j;
        }
        return -1;
    }


    public int totalSteps_timelimit(int[] nums) {
        int stepCount = 0;
        var arr = new ArrayList<Integer>();
        for (int num : nums) {
            arr.add(num);
        }

        var toRemove = new ArrayList<Integer>();
        int i = 0;
        while (true) {
            toRemove.clear();
            i = 0;
            while (i < arr.size() - 1) {
                int a = arr.get(i);
                int b = arr.get(i + 1);
                if (a > b) {
                    toRemove.add(0, (i + 1));
                }
                ++i;
            }
            if (toRemove.size() == 0)
                break;
            else {
                stepCount++;
                System.out.println("to remove]" + toRemove);
                for (Integer indexToRemove : toRemove) {
                    arr.remove((int) indexToRemove);
                }
            }
            System.out.println(arr);
        }
        return stepCount;
    }


    public String discountPrices(String sentence, int discount) {
        StringBuffer sbuf = new StringBuffer();
        String[] arr = sentence.split(" ");
        for (String s : arr) {
            if (isValid(s)) {
                sbuf.append(getDiscounted(s, discount));
                sbuf.append(" ");
            } else {
                sbuf.append(s);
                sbuf.append(" ");
            }
        }
        return sbuf.toString().trim();
    }

    public boolean isValid(String chunk) {
        // need to start with $
        // rest of it is number (double)
        if (!chunk.startsWith("$")) return false;
        if (chunk.length() <= 1) return false;

        String rest = chunk.substring(1);
        try {
            double value = Double.parseDouble(rest);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public String getDiscounted(String chunk, int discount) {

        String rest = chunk.substring(1);
        double value = Double.parseDouble(rest);
        double result = (double) value - ((double) value * ((double) discount / 100));

        return String.format("$%.2f", result);
    }


    //easy passed
    public int rearrangeCharacters(String s, String target) {
        int result = 0;

        char[] src = s.toCharArray();
        char[] trg = target.toCharArray();

        var srcMap = new HashMap<Character, Integer>();
        var trgMap = new HashMap<Character, Integer>();

        for (char c : src) {
            if (!srcMap.containsKey(c))
                srcMap.put(c, 0);
            srcMap.put(c, srcMap.get(c) + 1);
        }

        for (char c : trg) {
            if (!trgMap.containsKey(c))
                trgMap.put(c, 0);
            trgMap.put(c, trgMap.get(c) + 1);
        }
        result = Integer.MAX_VALUE;
        for (Character c : trgMap.keySet()) {
            int srcValue = 0;

            if (srcMap.containsKey(c))
                srcValue = srcMap.get(c);
            int targetValue = trgMap.get(c);

            int count = srcValue / targetValue;
            if (count < result)
                result = count;
        }
        return result;
    }
}
