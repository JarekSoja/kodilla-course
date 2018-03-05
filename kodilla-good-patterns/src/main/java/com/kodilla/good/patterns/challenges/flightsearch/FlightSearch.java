package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.List;
import java.util.Set;

public class FlightSearch {

    public static void main(String[] args) {


        FlightCollection.getFlights().add(new Flight("Warszawa", "Berlin"));
        FlightCollection.getFlights().add(new Flight("Warszawa", "Radom"));
        FlightCollection.getFlights().add(new Flight("Warszawa", "Moskwa"));
        FlightCollection.getFlights().add(new Flight("Radom", "Berlin"));
        FlightCollection.getFlights().add(new Flight("Moskwa", "Berlin"));
        FlightCollection.getFlights().add(new Flight("Londyn", "Berlin"));
        FlightCollection.getFlights().add(new Flight("Londyn", "Radom"));
        FlightCollection.getFlights().add(new Flight("Warszawa", "Katowice"));

        int searchChoice = Commander.welcomeMenu();

        if(searchChoice == 1) {
            String searchCriteria = Commander.singleCitySearch();
            List<Flight> results = FlightSearchEngine.searchByDeparture(searchCriteria);
            for(Flight f : results){
                System.out.println(f);
            }

        } else if (searchChoice == 2) {
            String searchCriteria = Commander.singleCitySearch();
            List<Flight> results = FlightSearchEngine.searchByArrival(searchCriteria);
            for(Flight f : results){
                System.out.println(f);
            }

        } else {
            Flight searchCriteria = Commander.transferFlightSearch();
            Set<Flight> results = FlightSearchEngine.searchFlightWithTransfer(searchCriteria);
            for(Flight f : results){
                System.out.println(f);
            }
        }


    }
}
