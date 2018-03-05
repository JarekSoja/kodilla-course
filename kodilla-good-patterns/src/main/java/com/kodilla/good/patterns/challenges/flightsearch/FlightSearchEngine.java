package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightSearchEngine {

    public static List<Flight> searchByDeparture(String departure) {
        return FlightCollection.getFlights().stream()
                .filter(flight -> flight.getDEPARTURE().equals(departure))
                .collect(Collectors.toList());
    }

    public static List<Flight> searchByArrival(String arrival) {
        return FlightCollection.getFlights().stream()
                .filter(flight -> flight.getARRIVAL().equals(arrival))
                .collect(Collectors.toList());
    }

    public static Set<Flight> searchFlightWithTransfer(Flight searchedFlight) {
       List<Flight> tempListWithDepartures = searchByDeparture(searchedFlight.getDEPARTURE()).stream()
               .filter(flight -> flight.getARRIVAL().equals(searchedFlight.getTRANSFER()))
               .collect(Collectors.toList());

       List<Flight> tempListWithArrivals = searchByArrival(searchedFlight.getARRIVAL()).stream()
               .filter(flight -> flight.getDEPARTURE().equals(searchedFlight.getTRANSFER()))
               .collect(Collectors.toList());

        Set<Flight> result = new HashSet<>();

        Stream.of(tempListWithDepartures, tempListWithArrivals)
                .forEach(result::addAll);

        return result;
    }
}
