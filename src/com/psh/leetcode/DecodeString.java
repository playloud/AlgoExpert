package com.psh.leetcode;

public class DecodeString {

    public String decodeString(String s) {
        var myStr = new MyStr(s);
        return myStr.toString();
    }

    class MyStr {
        StringBuffer sbuf = null;

        public MyStr(String src) {
            sbuf = new StringBuffer();
            // now parse
            int i = 0;
            char[] arr = src.toCharArray();

            while (i < arr.length) {
                char c = arr[i];

                if (isNumChar(c)) {
                    int num = -1;
                    int brStart = -1, brEnd = -1;
                    // getting number
                    for (int j = i; ;j++) {
                        if(isNumChar(arr[j])) continue;
                        else {
                            num = Integer.parseInt(src.substring(i,j));
                            brStart = j;
                            break;
                        }
                    }

                    // find out br start and br end
                    int countS = 0, countE = 0;

                    for (int j = brStart; ; j++) {
                        if(arr[j] == '[') {
                            ++countS;
                        } else if(arr[j] == ']') {
                            ++countE;

                            if(countE == countS) {
                                brEnd = j;
                                break;
                            }
                        }
                    }

                    var subStr = new MyStr(src.substring(brStart+1, brEnd));
                    // calculate str
                    // todo: this can be optimized
                    for (int j = 0; j < num; j++) {
                        sbuf.append(subStr.toString());
                    }

                    // update pointer
                    i = brEnd+1;
                } else {
                    sbuf.append(c);
                    i++;
                }
            }
        }

        public boolean isNumChar(char c) {
            if ('0' <= c && c <= '9') {
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return sbuf.toString();
        }
    }
}
