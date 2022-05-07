package com.psh.algoexpert.arrays;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CalendarMatchingTest {

    @Test
    public void testCalendarMatching() {
        ArrayList<CalendarMatching.StringMeeting> cal1 = new ArrayList<CalendarMatching.StringMeeting>();
        cal1.add(new CalendarMatching.StringMeeting("9:00", "10:30"));
        cal1.add(new CalendarMatching.StringMeeting("12:00", "13:00"));
        cal1.add(new CalendarMatching.StringMeeting("16:00", "18:00"));

        ArrayList<CalendarMatching.StringMeeting> cal2 = new ArrayList<CalendarMatching.StringMeeting>();
        cal2.add(new CalendarMatching.StringMeeting("10:00", "11:30"));
        cal2.add(new CalendarMatching.StringMeeting("12:30", "14:30"));
        cal2.add(new CalendarMatching.StringMeeting("14:30", "15:00"));
        cal2.add(new CalendarMatching.StringMeeting("16:00", "17:00"));

        var dailyBound1 = new CalendarMatching.StringMeeting("9:00", "20:00");
        var dailyBound2 = new CalendarMatching.StringMeeting("10:00", "18:30");

        var result = CalendarMatching.calendarMatching(cal1, dailyBound1, cal2, dailyBound2, 30);
        System.out.println(result);

    }

    @Test
    public void testCalendarMatching2() {
        ArrayList<CalendarMatching.StringMeeting> cal1 = new ArrayList<CalendarMatching.StringMeeting>();
        cal1.add(new CalendarMatching.StringMeeting("9:00", "10:30"));
        cal1.add(new CalendarMatching.StringMeeting("12:00", "13:00"));
        cal1.add(new CalendarMatching.StringMeeting("16:00", "18:00"));

        ArrayList<CalendarMatching.StringMeeting> cal2 = new ArrayList<CalendarMatching.StringMeeting>();
        cal2.add(new CalendarMatching.StringMeeting("10:00", "11:30"));
        cal2.add(new CalendarMatching.StringMeeting("12:30", "14:30"));
        cal2.add(new CalendarMatching.StringMeeting("14:30", "15:00"));
        cal2.add(new CalendarMatching.StringMeeting("16:00", "17:00"));

        var dailyBound1 = new CalendarMatching.StringMeeting("8:00", "20:00");
        var dailyBound2 = new CalendarMatching.StringMeeting("7:00", "18:30");

        var result = CalendarMatching.calendarMatching(cal1, dailyBound1, cal2, dailyBound2, 45);
        System.out.println(result);

    }

    @Test
    public void testCalendarMatching3() {
        ArrayList<CalendarMatching.StringMeeting> cal1 = new ArrayList<CalendarMatching.StringMeeting>();
        cal1.add(new CalendarMatching.StringMeeting("7:00", "7:45"));
        cal1.add(new CalendarMatching.StringMeeting("8:15", "8:30"));
        cal1.add(new CalendarMatching.StringMeeting("9:00", "10:30"));
        cal1.add(new CalendarMatching.StringMeeting("12:00", "14:00"));
        cal1.add(new CalendarMatching.StringMeeting("14:00", "15:00"));
        cal1.add(new CalendarMatching.StringMeeting("15:15", "15:30"));
        cal1.add(new CalendarMatching.StringMeeting("16:30", "18:30"));
        cal1.add(new CalendarMatching.StringMeeting("20:00", "21:00"));

        ArrayList<CalendarMatching.StringMeeting> cal2 = new ArrayList<CalendarMatching.StringMeeting>();
        cal2.add(new CalendarMatching.StringMeeting("9:00", "10:00"));
        cal2.add(new CalendarMatching.StringMeeting("11:15", "11:30"));
        cal2.add(new CalendarMatching.StringMeeting("11:45", "17:00"));
        cal2.add(new CalendarMatching.StringMeeting("17:30", "19:00"));
        cal2.add(new CalendarMatching.StringMeeting("20:00", "22:15"));

        var dailyBound1 = new CalendarMatching.StringMeeting("6:30", "22:00");
        var dailyBound2 = new CalendarMatching.StringMeeting("8:00", "22:30");

        var result = CalendarMatching.calendarMatching(cal1, dailyBound1, cal2, dailyBound2, 30);
        System.out.println(result);

    }

    @Test
    public void testString() {
        var ss = String.format("%d:%d", 12, 1);
        System.out.println(ss);

        // so this is the answer
        var ss2 = String.format("%d:%02d", 12, 1);
        System.out.println(ss2);

        var ss3 = String.format("%d:%03d", 12, 12);
        System.out.println(ss3);
    }

    @Test
    public void testArr() {
        String[] arr = {"abc1", "2abc", "3abc", "4abc", "5abc", "6abc" };
        var al = new ArrayList<String>();
        var al2 = new ArrayList<String>();
        Arrays.stream(arr).forEach(a->{
            al.add(a);
            System.out.println("al1 <= "+a);
        });
        System.out.println("in between ");
        Arrays.stream(arr).forEach(a->{
            al2.add(a);
            System.out.println("al2 <= "+a);
        });
        System.out.println("end of");
        System.out.println(al);
        System.out.println(al2);

    }

}