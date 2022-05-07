package com.psh.algoexpert.arrays;

import java.util.*;

public class CalendarMatching {
    public static List<StringMeeting> calendarMatching(
            List<StringMeeting> calendar1,
            StringMeeting dailyBounds1,
            List<StringMeeting> calendar2,
            StringMeeting dailyBounds2,
            int meetingDuration) {

        if ((dailyBounds1 == null) ||
                (dailyBounds2 == null) ||
                (!IsMergable(dailyBounds1, dailyBounds2))) {
            return new ArrayList<StringMeeting>();
        }

        var result = new ArrayList<StringMeeting>();

        var queue1 = new LinkedList<StringMeeting>();
        var queue2 = new LinkedList<StringMeeting>();

        var mergedList = new LinkedList<StringMeeting>();

        if (calendar1 != null) {
            calendar1.forEach(a -> queue1.addLast(a));
//            for (StringMeeting stringMeeting : calendar1) {
//                queue1.add(stringMeeting);
//            }
        }

        if (calendar2 != null) {
            calendar2.forEach(a -> queue2.addLast(a));
//            for (StringMeeting sm : calendar2) {
//                queue2.add(sm);
//            }
        }


        // Merge two parts
        while (queue1.size() > 0 || queue2.size() > 0) {

            StringMeeting sm1 = null;
            StringMeeting sm2 = null;

            if (queue1.size() > 0)
                sm1 = queue1.get(0);
            if (queue2.size() > 0)
                sm2 = queue2.get(0);

            if (IsMergable(sm1, sm2)) {

                var merged = MergeTwo(sm1, sm2);
                queue1.remove(0);
                queue2.remove(0);

                if (queue1.size() == 0 || !IsMergable(merged, queue1.get(0))) {
                    queue1.add(0, merged);
                } else {
                    queue2.add(0, merged);
                }

            } else {
                if ((sm1 != null && sm2 != null && sm1.startMin < sm2.startMin)
                        || (sm2 == null && sm1 != null)) {
                    sm1 = queue1.get(0);
                    queue1.remove(0);
                    mergedList.add(sm1);
                } else if ((sm1 != null && sm2 != null && sm1.startMin >= sm2.startMin)
                        || (sm2 != null && sm1 == null)) {
                    sm2 = queue2.get(0);
                    queue2.remove(0);
                    mergedList.add(sm2);
                }
            }
        }
        StringMeeting boundary = MergeTwoMin(dailyBounds1, dailyBounds2);



        // checking last
        for (int i = mergedList.size() - 1; i > 0; i--) {
            StringMeeting sm = mergedList.get(mergedList.size() - 1);
            if (boundary.endMin > sm.endMin) {
                StringMeeting smEnder = new StringMeeting(boundary.end, boundary.end);
                smEnder.LastFlag = true;
                mergedList.add(smEnder);
                break;
            } else if (sm.startMin <= boundary.endMin && boundary.endMin < sm.endMin) {
                sm.end = boundary.end;
                sm.endMin = boundary.endMin;
                sm.LastFlag = true;
                break;
            } else if (boundary.endMin < sm.startMin) {
                mergedList.remove(0);
            }
        }

//        if(boundary.startMin < mergedList.get(0).startMin) {
//            mergedList.add(0, new StringMeeting(boundary.start, boundary.start));
//        }
//
//        if(mergedList.getLast().endMin < boundary.endMin) {
//            mergedList.add(new StringMeeting(boundary.end, boundary.end));
//        }

        // now calculate
        if (mergedList.size() == 0) {
            mergedList.add(boundary);
            StringMeeting sm = mergedList.get(0);
            if (meetingDuration <= sm.endMin - sm.startMin) {
                result.add(sm);
            }
        } else {

            // initial boundry check
            if (boundary.startMin < mergedList.get(0).startMin) {
                if (meetingDuration <= mergedList.get(0).startMin - boundary.startMin) {
                    result.add(new StringMeeting(boundary.start, mergedList.get(0).start));
                }
            }

            for (int i = 0; i < mergedList.size() - 1; i++) {
                if (i + 1 >= mergedList.size()) break;
                StringMeeting sm1 = mergedList.get(i);
                StringMeeting sm2 = mergedList.get(i + 1);

                if (meetingDuration <= sm2.startMin - sm1.endMin) {
                    var sm = new StringMeeting(sm1.end, sm2.start);
                    if(boundary.startMin <= sm.startMin && sm.endMin <= boundary.endMin) {
                        result.add(new StringMeeting(sm1.end, sm2.start));
                    }
                }
            }

            // last boundary check
            if (boundary.endMin > mergedList.getLast().endMin) {
                if (meetingDuration <= boundary.endMin - mergedList.getLast().endMin) {
                    result.add(new StringMeeting(mergedList.getLast().end, boundary.end));
                }
            }
        }
        return result;
    }






















    static class StringMeeting {
        public String start;
        public String end;

        public int startMin = 0;
        public int endMin = 0;
        public boolean StartFlag;
        public boolean LastFlag;


        public StringMeeting(String start, String end) {
            this.start = start;
            this.end = end;
            startMin = toMinuteValue(start);
            endMin = toMinuteValue(end);
        }

        public StringMeeting(String start, int duration) {
            this.start = start;
            startMin = toMinuteValue(start);
            endMin = startMin + duration;
            this.end = toTimeFormat(endMin);
        }

        public int toMinuteValue(String str) {
            String[] arr = str.split(":");

            try {
                int min = Integer.parseInt(arr[0].trim()) * 60 + Integer.parseInt(arr[1].trim());
                return min;
            } catch (Exception ex) {
                System.out.println(ex);
            }
            return 0;
        }

        public String toTimeFormat(int src) {
            int hour = 0;
            int min = 0;

            hour = (src / 60);
            min = (src % 60);

            return String.format("%d:%02d", hour, min);
        }

        public String toString() {
            return String.format("%s:%s", start, end);
        }

    }

    public static StringMeeting MergeTwo(StringMeeting a, StringMeeting b) {
        StringMeeting merged = new StringMeeting("00:00", "00:00");

        merged.startMin = Math.min(a.startMin, b.startMin);
        merged.endMin = Math.max(a.endMin, b.endMin);
        merged.start = merged.toTimeFormat(merged.startMin);
        merged.end = merged.toTimeFormat(merged.endMin);

        return merged;
    }

    public static StringMeeting MergeTwoMin(StringMeeting a, StringMeeting b) {
        StringMeeting merged = new StringMeeting("0:0", "0:0");

        merged.startMin = Math.max(a.startMin, b.startMin);
        merged.endMin = Math.min(a.endMin, b.endMin);
        merged.start = merged.toTimeFormat(merged.startMin);
        merged.end = merged.toTimeFormat(merged.endMin);

        return merged;
    }

    public static boolean IsMergable(StringMeeting a, StringMeeting b) {
        if (a == null || b == null) return false;

        if (a.startMin <= b.startMin && b.startMin <= a.endMin)
            return true;

        if (b.startMin <= a.startMin && a.startMin <= b.endMin)
            return true;

        return false;
    }

}
