package com.psh.leetcode.amazon;
import java.util.*;
//https://leetcode.com/problems/number-of-days-between-two-dates/
public class NumberofDaysBetweenTwoDates {
    public int daysBetweenDates(String date1, String date2) {
        int result = 0;

        int year1, year2;
        int mon1, mon2;
        int day1, day2;

        year1 = Integer.parseInt(date1.split("-")[0]);
        mon1 = Integer.parseInt(date1.split("-")[1]);
        day1 = Integer.parseInt(date1.split("-")[2]);

        year2 = Integer.parseInt(date2.split("-")[0]);
        mon2 = Integer.parseInt(date2.split("-")[1]);
        day2 = Integer.parseInt(date2.split("-")[2]);

        int gap_year = year2 - year1;
        int gap_mon = mon2 - mon1;
        int gat_day = day2 - day1;

        result = gap_year * 365 + gap_mon *(365/12) + gat_day;

        //long d1 = (year1 - 1971)

        return Math.abs(result);
    }
}
