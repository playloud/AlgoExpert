package com.psh.leetcode.ms;
//https://leetcode.com/problems/string-compression/
//Runtime: 7 ms, faster than 11.54% of Java online submissions for String Compression.
//Memory Usage: 44.6 MB, less than 18.38% of Java online submissions for String Compression.
import java.util.ArrayList;

public class StringCompression {
    public int compress(char[] chars) {
        var temp = new ArrayList();
        for (char c : chars) {
            //check temp
            if (temp.size() == 0) {
                temp.add(c);
            } else {
                Object lastItem = temp.get(temp.size() - 1);
                if (lastItem instanceof Character) {
                    Character lastc = (Character) lastItem;
                    if (lastc == c) {
                        temp.add(2);
                    } else {
                        temp.add(c);
                    }
                } else {
                    Integer lastn = (Integer) lastItem;
                    Character lastc = (Character) temp.get(temp.size() - 2);
                    if (lastc == c) {
                        temp.remove(temp.size() - 1);
                        temp.add((lastn + 1));
                    } else {
                        temp.add(c);
                    }
                }
            }
        }
        var buf = new StringBuffer();
        for (Object o : temp) {
            if (o instanceof Character) {
                buf.append((Character) o);
            } else {
                buf.append((Integer) o);
            }
        }
        var temp2 = buf.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i < temp2.length) chars[i] = temp2[i];
            else chars[i] = ' ';
        }
        return temp2.length;
    }

    public void modifyChar(char[] input) {
        input = new char[1];
        input[0] = 'T';
    }
}
