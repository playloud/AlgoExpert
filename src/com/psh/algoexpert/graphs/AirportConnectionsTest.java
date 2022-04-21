package com.psh.algoexpert.graphs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AirportConnectionsTest {

    @Test
    public void testAirportCon() {
        var airports = new ArrayList<String>();
        airports.add("BGI");
        airports.add("CDG");
        airports.add("DEL");
        airports.add("DOH");
        airports.add("DSM");
        airports.add("EWR");
        airports.add("EYW");
        airports.add("HND");
        airports.add("ICN");
        airports.add("JFK");
        airports.add("LGA");
        airports.add("LHR");
        airports.add("ORD");
        airports.add("SAN");
        airports.add("SFO");
        airports.add("SIN");
        airports.add("TLV");
        airports.add("BUD");

        var routes = new ArrayList<List<String>>();
        String[] temp0 =  {"DSM", "ORD"};
        routes.add(Arrays.asList(temp0 ));
        String[] temp1 =  {"ORD", "BGI"};
        routes.add(Arrays.asList(temp1 ));
        String[] temp2 =  {"BGI", "LGA"};
        routes.add(Arrays.asList(temp2 ));
        String[] temp3 =  {"SIN", "CDG"};
        routes.add(Arrays.asList(temp3 ));
        String[] temp4 =  {"CDG", "SIN"};
        routes.add(Arrays.asList(temp4 ));
        String[] temp5 =  {"CDG", "BUD"};
        routes.add(Arrays.asList(temp5 ));
        String[] temp6 =  {"DEL", "DOH"};
        routes.add(Arrays.asList(temp6 ));
        String[] temp7 =  {"DEL", "CDG"};
        routes.add(Arrays.asList(temp7 ));
        String[] temp8 =  {"TLV", "DEL"};
        routes.add(Arrays.asList(temp8 ));
        String[] temp9 =  {"EWR", "HND"};
        routes.add(Arrays.asList(temp9 ));
        String[] temp10 =  {"HND", "ICN"};
        routes.add(Arrays.asList(temp10));
        String[] temp11 =  {"HND", "JFK"};
        routes.add(Arrays.asList(temp11));
        String[] temp12 =  {"ICN", "JFK"};
        routes.add(Arrays.asList(temp12));
        String[] temp13 =  {"JFK", "LGA"};
        routes.add(Arrays.asList(temp13));
        String[] temp14 =  {"EYW", "LHR"};
        routes.add(Arrays.asList(temp14));
        String[] temp15 =  {"LHR", "SFO"};
        routes.add(Arrays.asList(temp15));
        String[] temp16 =  {"SFO", "SAN"};
        routes.add(Arrays.asList(temp16));
        String[] temp17 =  {"SFO", "DSM"};
        routes.add(Arrays.asList(temp17));
        String[] temp18 =  {"SAN", "EYW"};
        routes.add(Arrays.asList(temp18));

        var result = AirportConnections.airportConnections_wrong(airports, routes, "LGA");
        System.out.println(result);
    }

    @Test
    public void testAirportCon2() {
        var airports = new ArrayList<String>();
        airports.add("BGI");
        airports.add("CDG");
        airports.add("DEL");
        airports.add("DOH");
        airports.add("DSM");
        airports.add("EWR");
        airports.add("EYW");
        airports.add("HND");
        airports.add("ICN");
        airports.add("JFK");
        airports.add("LGA");
        airports.add("LHR");
        airports.add("ORD");
        airports.add("SAN");
        airports.add("SFO");
        airports.add("SIN");
        airports.add("TLV");
        airports.add("BUD");

        var routes = new ArrayList<List<String>>();
        String[] temp0 =  {"DSM", "ORD"};
        routes.add(Arrays.asList(temp0 ));
        String[] temp1 =  {"ORD", "BGI"};
        routes.add(Arrays.asList(temp1 ));
        String[] temp2 =  {"BGI", "LGA"};
        routes.add(Arrays.asList(temp2 ));
        String[] temp3 =  {"SIN", "CDG"};
        routes.add(Arrays.asList(temp3 ));
        String[] temp4 =  {"CDG", "SIN"};
        routes.add(Arrays.asList(temp4 ));
        String[] temp5 =  {"CDG", "BUD"};
        routes.add(Arrays.asList(temp5 ));
        String[] temp6 =  {"DEL", "DOH"};
        routes.add(Arrays.asList(temp6 ));
        String[] temp7 =  {"DEL", "CDG"};
        routes.add(Arrays.asList(temp7 ));
        String[] temp8 =  {"TLV", "DEL"};
        routes.add(Arrays.asList(temp8 ));
        String[] temp9 =  {"EWR", "HND"};
        routes.add(Arrays.asList(temp9 ));
        String[] temp10 =  {"HND", "ICN"};
        routes.add(Arrays.asList(temp10));
        String[] temp11 =  {"HND", "JFK"};
        routes.add(Arrays.asList(temp11));
        String[] temp12 =  {"ICN", "JFK"};
        routes.add(Arrays.asList(temp12));
        String[] temp13 =  {"JFK", "LGA"};
        routes.add(Arrays.asList(temp13));
        String[] temp14 =  {"EYW", "LHR"};
        routes.add(Arrays.asList(temp14));
        String[] temp15 =  {"LHR", "SFO"};
        routes.add(Arrays.asList(temp15));
        String[] temp16 =  {"SFO", "SAN"};
        routes.add(Arrays.asList(temp16));
        String[] temp17 =  {"SFO", "DSM"};
        routes.add(Arrays.asList(temp17));
        String[] temp18 =  {"SAN", "EYW"};
        routes.add(Arrays.asList(temp18));

        var result = AirportConnections.airportConnections(airports, routes, "LGA");
        System.out.println(result);
    }

}