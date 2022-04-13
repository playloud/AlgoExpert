package com.psh.algoexpert.strings;
import java.util.LinkedList;

public class UnderscoifySubstring {

    public static String underscorifySubstring( String str, String substring) {
        var myLIst = new LinkedList<MyPoint>();
        int subLeng = substring.length();
        int index = 0;
        while(true) {
            if(index < 0) break;
            int startIndex = str.indexOf(substring, index);
            if(startIndex >= 0) {
                int endIndex = startIndex + subLeng-1;
                var mp = new MyPoint();
                mp.startIndex = startIndex;
                mp.endIndex = endIndex;
                myLIst.add(mp);
            }
            if(startIndex == -1) break;
            index = startIndex + 1;
        }

        // KEYPOINT: if merged, i should stay
        int i = 0;
        if(myLIst.size() > 0){
            while(true) {
                if(i == myLIst.size()-1)
                    break;
                var first = myLIst.get(i);
                var next = myLIst.get(i+1);
                if(first.isMergable(next)) {
                    var merged = MyPoint.merge(first,next);
                    myLIst.remove(i);
                    myLIst.set(i, merged); // this will simply replacing
                    //myLIst.remove(i+1);
                } else {
                    ++i;
                }
            }
        }
        StringBuffer sbuf = new StringBuffer(str);
        for (int j = myLIst.size()-1; ; j--) {
            if(j < 0) break;
            var mp = myLIst.get(j);
            sbuf.insert(mp.endIndex+1, '_');
            sbuf.insert(mp.startIndex, '_');
        }
        return sbuf.toString();
    }

    public static class MyPoint {
        public int startIndex = 0;
        public int endIndex = 0;
        public boolean isMergable(MyPoint other) {
            if(startIndex <= other.startIndex && other.startIndex <= endIndex) return true;
            if(other.startIndex <= startIndex && startIndex <= other.endIndex) return true;
            if(endIndex+1 == other.startIndex) return true;
            if(other.endIndex+1 == startIndex) return true;
            return false;
        }
        public static MyPoint merge(MyPoint a, MyPoint b) {
            var mp = new MyPoint();
            mp.startIndex = Math.min(a.startIndex, b.startIndex);
            mp.endIndex = Math.max(a.endIndex, b.endIndex);
            return mp;
        }
    }
}
