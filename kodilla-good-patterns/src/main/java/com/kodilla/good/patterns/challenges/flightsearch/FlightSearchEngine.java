package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightSearchEngine {

    public static List<Flight> searchByDeparture(String departure) {
        return FlightCollection.getFlights().stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .collect(Collectors.toList());
    }

    public static List<Flight> searchByArrival(String arrival) {
        return FlightCollection.getFlights().stream()
                .filter(flight -> flight.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }

    public static Set<Flight> searchFlightWithTransfer(Flight searchedFlight) {
       Stream<Flight> tempListWithDepartures = searchByDeparture(searchedFlight.getDeparture()).stream()
               .filter(flight -> flight.getArrival().equals(searchedFlight.getTransfer()));

       Stream<Flight> tempListWithArrivals = searchByArrival(searchedFlight.getArrival()).stream()
               .filter(flight -> flight.getDeparture().equals(searchedFlight.getTransfer()));

        return Stream.concat(tempListWithDepartures, tempListWithArrivals).collect(Collectors.toSet());
    }
}
