package com.psh.leetcode;
//https://leetcode.com/problems/basic-calculator-ii/
//Runtime: 34 ms, faster than 22.47% of Java online submissions for Basic Calculator II.
//Memory Usage: 60.1 MB, less than 5.00% of Java online submissions for Basic Calculator II.
import java.util.*;
// my keypoint - do the work naturally, do plus min first, and multi/div should be embedded
// that means eventually, nested multi/div will be done first
public class BasicCalculatorII {

    public int calculate(String s) {
        var myN = new MyNum(s);
        return myN.getNum();
    }

    public class MyNum {
        Queue plusMinQ = null;
        Queue multiDivQ = null;
        Integer myNum = null;

        public MyNum(String src) {

            if (src.contains("+") || src.contains("-")) {
                plusMinQ = new ArrayDeque<>();
                var buf = new StringBuffer();
                char[] arr = src.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == '+') {
                        var myNum2 = new MyNum(buf.toString().trim());
                        plusMinQ.add(myNum2);
                        buf.delete(0, buf.length());
                        plusMinQ.add("+");
                    } else if (arr[i] == '-') {
                        var myNum2 = new MyNum(buf.toString().trim());
                        plusMinQ.add(myNum2);
                        buf.delete(0, buf.length());
                        plusMinQ.add("-");
                    } else {
                        buf.append(arr[i]);
                    }
                }
                plusMinQ.add(new MyNum(buf.toString().trim()));

            } else if (src.contains("*") || src.contains("/")) {
                multiDivQ = new ArrayDeque<>();
                var buf = new StringBuffer();
                char[] arr = src.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == '*') {
                        var myNum2 = new MyNum(buf.toString().trim());
                        multiDivQ.add(myNum2);
                        buf.delete(0, buf.length());
                        multiDivQ.add("*");
                    } else if (arr[i] == '/') {
                        var myNum2 = new MyNum(buf.toString().trim());
                        multiDivQ.add(myNum2);
                        buf.delete(0, buf.length());
                        multiDivQ.add("/");
                    } else {
                        buf.append(arr[i]);
                    }
                }
                multiDivQ.add(new MyNum(buf.toString().trim()));
            } else {
                myNum = Integer.parseInt(src.trim());
            }
        }

        public int getNum() {
            if(this.myNum != null)
                return myNum;

            int result = 0;
            if (plusMinQ != null && plusMinQ.size() > 0) {
                result = ((MyNum) plusMinQ.remove()).getNum();
                while (plusMinQ.size() > 0) {
                    String op = ((String) plusMinQ.remove());
                    if (op.equals("+")) {
                        result = result + ((MyNum) plusMinQ.remove()).getNum();
                    } else {
                        result = result - ((MyNum) plusMinQ.remove()).getNum();
                    }
                }
            } else if (multiDivQ != null && multiDivQ.size() > 0) {
                result = ((MyNum) multiDivQ.remove()).getNum();
                while (multiDivQ.size() > 0) {
                    String op = ((String) multiDivQ.remove());
                    if (op.equals("*")) {
                        result = result * ((MyNum) multiDivQ.remove()).getNum();
                    } else {
                        result = result / (((MyNum) multiDivQ.remove()).getNum());
                    }
                }
            }
            return result;
        }

    }

}
