package com.psh.hackerrank;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class JsonTest {


    public void perform() throws Exception {
        int threshold = 10;
        String urlstr = "https://jsonmock.hackerrank.com/api/article_users?page=2";
        var url = new URI(urlstr);

        BufferedInputStream bis = new BufferedInputStream(new URL(urlstr).openStream());
        var allBytes = bis.readAllBytes();
        String result = new String(allBytes);
        //System.out.println(result);

        ObjectMapper om = new ObjectMapper();
        var rr = om.readValue(result, ActiveUsers.class);
        System.out.println(rr.getTotal());
        System.out.println(String.format("total page %d", rr.getTotalPages()));

        var rr2 = om.readValue(new URL(urlstr), ActiveUsers.class);
        //System.out.println(rr2.getPage());

        Arrays.stream(rr.getData()).forEach(a->{
            if(a.getSubmissionCount() >= threshold) {
                System.out.println(String.format("%s => %d", a.getUsername(), a.getSubmissionCount()));
            } else {
                System.out.println(String.format("**%s => %d", a.getUsername(), a.getSubmissionCount()));
            }

//            System.out.println(a.getUsername());
//            System.out.println(a.getSubmissionCount());
        });
    }

    public void mySol() throws Exception {
        int curPage = 1;
        int maxPage = 1000;
        int threshold = 10;
        var result = new ArrayList<String>();

        String strUrl = "https://jsonmock.hackerrank.com/api/article_users?page=1";

        // get the max page
        ObjectMapper om = new ObjectMapper();
        var r = om.readValue(new URL(strUrl), ActiveUsers.class);
        maxPage = (int)r.getTotalPages();
        System.out.println("maxPage" + maxPage);
        for (int i = 1; i < maxPage; i++) {
            String tempUrl = String.format("https://jsonmock.hackerrank.com/api/article_users?page=%d", i);
            var cur = om.readValue(new URL(tempUrl), ActiveUsers.class);
            Arrays.stream(cur.getData()).forEach(a->{
                if(a.getSubmissionCount() > threshold) {
                    result.add(a.getUsername());
                } else {
                    System.out.println(a.getUsername() + "**");
                }
            });
        }

        result.forEach(a->{
            System.out.println(a);
        });
    }

    @Test
    public void test01 (){
        var jt = new JsonTest();
        try {
            jt.perform();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test02 (){
        var jt = new JsonTest();
        try {
            jt.mySol();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
