package com.psh.leetcode.weelyContest.contest296TE;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextEditorTest {

    @Test
    public void test() {
        var sbuf = new StringBuffer();
        sbuf.append("012345");
        sbuf.delete(0,2);
        System.out.println(sbuf);
    }

    @Test
    public void test01() {
        String str = null;
        int n = 0;
        var textEditor = new TextEditor();
        textEditor.addText("leetcode");
        n = textEditor.deleteText(4); // return 4
        Assert.assertEquals(4, n);
        // The current text is "leet|".
        // 4 characters were deleted.

        textEditor.addText("practice"); // The current text is "leetpractice|".

        str = textEditor.cursorRight(3); // return "etpractice"
        // The current text is "leetpractice|".
        // The cursor cannot be moved beyond the actual text and thus did not move.
        // "etpractice" is the last 10 characters to the left of the cursor.
        System.out.println(str);
        Assert.assertEquals("etpractice", str);

        str = textEditor.cursorLeft(8); // return "leet"
        // The current text is "leet|practice".
        // "leet" is the last min(10, 4) = 4 characters to the left of the cursor.
        System.out.println(str);
        Assert.assertEquals( "leet", str);

        n = textEditor.deleteText(10); // return 4
        // The current text is "|practice".
        // Only 4 characters were deleted.
        Assert.assertEquals(4,n);

        str = textEditor.cursorLeft(2); // return ""
        // The current text is "|practice".
        // The cursor cannot be moved beyond the actual text and thus did not move.
        // "" is the last min(10, 0) = 0 characters to the left of the cursor.
        System.out.println(str);
        Assert.assertEquals( "", str);

        str = textEditor.cursorRight(6); // return "practi"
        // The current text is "practi|ce".
        // "practi" is the last min(10, 6) = 6 characters to the left of the cursor.
        System.out.println(str);
        Assert.assertEquals( "practi", str);
    }

}