package com.psh.leetcode.weelyContest.contest296TE;

public class TextEditor {
    StringBuffer sbuf = null;
    int cursor = 0;

    public TextEditor() {
        sbuf = new StringBuffer();
        cursor = 0;
    }

    public void addText(String text) {
        sbuf.insert(cursor, text);
        cursor += text.length();
    }


    public int deleteText(int k) {

        if (this.sbuf.length() <= k) {
            this.sbuf.delete(0, sbuf.length());
            cursor = 0;
            return sbuf.length();
        } else {
            int maxDelete = cursor + 1;
            if (maxDelete < k) {
                int delete = maxDelete;
                sbuf.delete(0, delete);
                cursor = 0;
            } else {
                sbuf.delete(cursor - k, cursor + 1);
                cursor = cursor - k;
                return k;
            }
        }
        return 0;
    }

    public String cursorLeft(int k) {

        cursor = cursor-k;
        if(cursor < 0)
            cursor = 0;

        int cursorSize = cursor+1;
        int size = Math.min(10, cursorSize);
        int startPoint = cursor - size;
        if(startPoint < 0) startPoint = 0;
        return sbuf.substring(startPoint, cursor);
    }

    public String cursorRight(int k) {
        cursor = cursor + k;
        if(sbuf.length() <= cursor)
            cursor = sbuf.length()-1;
        int cursorSize = cursor+1;
        int size = Math.min(10, cursorSize);
        int startPoint = cursor - size;
        if(startPoint < 0) startPoint = 0;
        return sbuf.substring(startPoint, cursor);
    }
}
