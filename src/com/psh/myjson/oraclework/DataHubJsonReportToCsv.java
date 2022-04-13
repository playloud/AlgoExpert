package com.psh.myjson.oraclework;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.json.*;


public class DataHubJsonReportToCsv {


    public DataHubJsonReportToCsv() {

    }

    public void parse() {

        String path = "test01.json";
        try {

            String contents = Files.readString(Path.of(path));
            JSONObject root = new JSONObject(contents);
            var cols = root.getJSONArray("columns");
            var arrData = root.getJSONArray("data");
            var arr1 = arrData.getJSONArray(0);

            var colBuf = new ArrayList<String>();

            var dataBuf = new ArrayList<ArrayList<String>>();
            for (int i = 0; i < cols.length(); i++) {
                colBuf.add(String.format("\"%s\"", cols.get(i).toString()));
            }

            for (Object arr : arrData) {
                var data = (JSONArray)arr;
                var dataArr = new ArrayList<String>();
                for (int i = 0; i < data.length(); i++) {
                    dataArr.add(String.format("\"%s\"", data.get(i).toString()));
                }
                dataBuf.add(dataArr);
            }

//            System.out.println(colBuf);
//            for (ArrayList<String> line : dataBuf) {
//                System.out.println(line);
//            }

            StringBuffer finalBuf = new StringBuffer();
            finalBuf.append(String.join(",", colBuf) + System.lineSeparator());
            for (ArrayList<String> line :
                    dataBuf) {
                finalBuf.append(String.join(",", line) + System.lineSeparator());
            }

            System.out.println(finalBuf.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String splitNToCSVFormat(ArrayList<String> line){
        StringBuffer sbuf = new StringBuffer();
        String.join(",", line);

        line.forEach(a->{
            sbuf.append(String.format("\"%s\"", a));
        });

        return sbuf.toString();
    }

}
