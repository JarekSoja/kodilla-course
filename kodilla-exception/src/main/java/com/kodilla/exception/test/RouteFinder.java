package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteFinder {

    private Map<String,Boolean> flights = new HashMap<>();

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        flights.put("Warsaw", true);
        flights.put("London", true);
        flights.put("Manila", false);
        flights.put("Paris", true);
        flights.put("Brussels", false);
        flights.put("Beijing", false);

        if (flights.containsKey(flight.getArrivalAirport())){
            return flights.get(flight.getArrivalAirport());

        }
        throw new RouteNotFoundException("No flights found to this destination");
    }
}
