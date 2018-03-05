package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.ArrayList;
import java.util.List;

public class FlightCollection {

    private static List<Flight> flights = new ArrayList<>();

    public static List<Flight> getFlights() {
        return flights;
    }
}


